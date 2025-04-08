package language.basics;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.util.logging.Logger;

public class FirstJavaProgram {

	/******* Advantages of Print Statements 
	 * @throws FileNotFoundException ******/
	// Debugging and error detection
	// Monitoring program execution
	// Testing and validation
	// Logging statements

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		
    //Print the statement and go to the next line
		System.out.println("Hello, World!");
		
	//Print the content and stay on same line
		System.out.print("Hello,");
		System.out.println(" World!");
		
	//Print the formatted content and stay on same line
		System.out.printf("%s comleted BE, empid is %d, and visa status is %b","Suraj",1234,true);
		
		System.out.println();
	
	//Format the digits and print the formatted content and then stay on same line
		System.out.format("Total bill is %.2f",100.32456);
		
		System.out.println();
		
	// Join multiple print statement together
		System.out.append("My name is suraj").append(", My empid is 1234");
		
		System.out.println();
		
    // Print the character based on ascii value
		System.out.write(65);
		System.out.println();
		
	// Print Logs of Program
		Logger log = Logger.getLogger("Mylogger");
		log.info("Current line is 44");
		log.warning("Some warning at line 45; Please check");
		
	// Print the errors in print statements
		System.err.println("Error: Expected result is not matching with actual Result");
		
	//
		PrintWriter writer= new PrintWriter("C:\\AutomationTraining\\AutomationProject\\Logs.txt");
		writer.println("Currently line 55 is running");
		writer.println(LocalDateTime.now()+"Currently line 56 is running");
		writer.close();
	}

}
