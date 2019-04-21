# Protocol Buffers

This is a Java project demonstrating the Protocol Buffers.


### A Simple Example

This is simple project for Protocol Buffers. The Blog for this can be found at [Introduction to Protocol Buffers](https://ruthwik.github.io/other/2019-03-22-protocol_buffers/)


### How to generate from .proto files

* Download the Protocol Compiler from [protobuf releases](https://github.com/protocolbuffers/protobuf/releases/).
* Set the path to protoc or you can mention the path everytime you compile the code using --proto_path=IMPORT_PATH

```Java
 echo 'export PATH="$PATH":/home/user/Documents/softwares/protoc-3.7.1-linux-x86_64/bin' >> ~/.bashrc
```
* Go to .proto file folder and run the folowing command. we are using --java_out for Java files as output. Other options are --python_out,--cpp_out...

```Java
  protoc --java_out=../java greeting.proto
```

This would generate the java files from .proto file.

### Protobuf Dependency

Add grpc-protobuf dependency in pom.xml

```Java
  <properties>
	<jdkLevel>11</jdkLevel>
	<io.grpc.version>1.16.1</io.grpc.version>
  </properties>

  <dependency>
	<groupId>io.grpc</groupId>
	<artifactId>grpc-protobuf</artifactId>
	<version>${io.grpc.version}</version>
  </dependency>
```


### Code

* Import the HelloRequest and build the helloRequest object.

```Java
import com.example.protobuf.HelloRequest;

HelloRequest helloRequest = HelloRequest.newBuilder()
		.setName("John")
		.setAge(28)
		.addAllHobbies( Arrays.asList("reading","travelling"))
		.build();

```

* Save the helloRequest to a local file.

```Java

 FileOutputStream output = new FileOutputStream("Request.ser");
 helloRequest.writeTo(output);
 output.close();

```

* Load the saved file and deserialize it.

```Java

 HelloRequest requestFile = HelloRequest.parseFrom(new FileInputStream("Request.ser"));
 System.out.println(requestFile);

```

* Run the main class and should see the deserialized output.

```Java
name: "John"
age: 28
hobbies: "reading"
hobbies: "travelling"
```
