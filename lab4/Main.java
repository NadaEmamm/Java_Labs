import lab4Package.ThreeMethod;
import lab4Package.NewException;
import lab4Package.NotEmpty;
import lab4Package.DividedByZero;
import java.util.Scanner;
import java.io.*;

public class Main{
public static void main(String args[]){
	Scanner myObj = new Scanner(System.in);
	System.out.println("Enter username ");
	String userName = myObj.nextLine(); 
	System.out.println("How many times to print the name");
	int times = myObj.nextInt();
	int x =10;
	int y =1;

 
	 ThreeMethod object = new ThreeMethod();
	 try{
	 	object.printName(times,userName); // it will take number and name
	 	object.methodCalc(x,y); // it will calc numbers
	 	object.numberOfCaracter(""); // it will resieve string 
	 }
	 catch (NewException e){

	   	System.out.println(e.getMessage());
	 }
	 	 catch (DividedByZero e){
	   	System.out.println(e.getMessage());
	 }
	 	 catch (NotEmpty e ){
	   	System.out.println(e.getMessage());
	 }
	 finally {
		 System.out.println("Finished");
	 }
 }
 }
 
 
 
 

