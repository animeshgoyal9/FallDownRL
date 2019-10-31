from concurrent import futures
import logging
import grpc 
import PyServer_pb2
import PyServer_pb2_grpc
import time 
import threading

class PyServer(PyServer_pb2_grpc.PyServerServicer):
	def sendRewards(self, request, context):
		return PyServer_pb2.RewardResponse(reward = 'Reward: %d' %request.reward)
	def sentLocation(self, request, context):
		result = 0
		if(request.x == 0):
			result = 1
		return PyServer_pb2.Action(result = result)

def serve():
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=10))
    PyServer_pb2_grpc.add_PyServerServicer_to_server(PyServer(), server)
    server.add_insecure_port('[::]:50051')
    server.start()
    server.wait_for_termination()


if __name__ == '__main__':
    logging.basicConfig()
    serve()
		
