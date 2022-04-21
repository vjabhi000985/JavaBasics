import java.io.*;
class ConsoleInput{
	public static void main(String[] args){
		Console c = System.console();
		System.out.println("Enter password:");

		char[] passwordArray = c.readPassword();

		String password = String.valueOf(passwordArray);
		System.out.println("password:"+password);
	}
}