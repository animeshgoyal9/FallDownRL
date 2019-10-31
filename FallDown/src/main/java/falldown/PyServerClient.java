package main.java.falldown;

import PyServer.PyServerGrpc;
import PyServer.PyServerGrpc.PyServerBlockingStub;
import PyServer.PyServerOuterClass.Action;
import PyServer.PyServerOuterClass.Location;
import PyServer.PyServerOuterClass.RewardRequest;
import PyServer.PyServerOuterClass.RewardResponse;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

public class PyServerClient {
	
	public static void sendReward(int reward) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051).usePlaintext().build();
		
		PyServerBlockingStub pyServerStub = PyServerGrpc.newBlockingStub(channel);
		RewardRequest request = RewardRequest.newBuilder().setReward(reward).build();
		RewardResponse result = pyServerStub.sendRewards(request);
		System.out.println("Result - "+result);
	}
	
	public static int sendLocation(int posX, int posY) {
		ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost",50051).usePlaintext().build();
		
		PyServerBlockingStub pyServerStub = PyServerGrpc.newBlockingStub(channel);
		Location request = Location.newBuilder().setX(posX).setY(posY).build();
		Action action = pyServerStub.sentLocation(request);
		return action.getResult();
	}
}
