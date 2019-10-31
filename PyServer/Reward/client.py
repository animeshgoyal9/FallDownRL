from __future__ import print_function
import logging

import grpc

import PyServer_pb2
import PyServer_pb2_grpc


def run():
    # NOTE(gRPC Python Team): .close() is possible on a channel and should be
    # used in circumstances in which the with statement does not fit the needs
    # of the code.
    with grpc.insecure_channel('localhost:50051') as channel:
        stub = PyServer_pb2_grpc.PyServerStub(channel)
        response = stub.sendRewards(PyServer_pb2.RewardRequest(reward=2))
    print("PyServer client received - " + response.reward)


if __name__ == '__main__':
    logging.basicConfig()
    run()
