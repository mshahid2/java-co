package javaLearning.co.lambda;

public class LambdaMain {

	public static void main(String[] args) {

		LambdaInteface obj = new LambdaClass();
		System.out.println("With out lambda implementation Result : " + obj.getDetail("shahid"));
		// Basically what i did is created the implementation of interface method and
		// save a class to create where i was suppose to write the method
		// implementation.
		// instead of creating a new class and method implementation i have written the
		// method implementation here in this call only and accessed it by assigning it
		// to variable of type functional interface
		// ultimately you have to just create a functional interface and have you
		// implementation without writing the extra class.

		LambdaInteface var = (testing) -> {
			String msg = "Hello Their " + testing;
			return msg;
		};
		System.out.println("With lambda first implementation Result :  " + var.getDetail("MD"));
		
		LambdaInteface var2 = (msg)->{
			return "Wow Labda " + msg;
		};
		System.out.println("With lambda 2nd implementation Result :  " + var2.getDetail("Loving it"));
	}
}
