package com.example.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import com.example.protobuf.HelloRequest;

public class GreetingMain {

	public static void main(String[] args) {
		
		HelloRequest helloRequest = HelloRequest.newBuilder()
		.setName("John")
		.setAge(28)
		.addAllHobbies( Arrays.asList("reading","travelling"))
		.build();

	try {
		System.out.println("Serializing...");
        // write into a file (or db not shown here)
        FileOutputStream output = new FileOutputStream("Request.ser");
        helloRequest.writeTo(output);
        output.close();
 
        System.out.println("Deserializing...");
        HelloRequest requestFile = HelloRequest.parseFrom(new FileInputStream("Request.ser"));
        System.out.println(requestFile);
     } catch (IOException e) {
             e.printStackTrace();
     }
}
	
}

