import java.rmi.*; 
import java.util.Scanner;

public class Client { 
public static void main(String args[]) { 
Scanner sc=new Scanner(System.in); 
try { 
// Get reference to the remote object 
String ServerURL = "rmi://localhost/Server";  
ServerIntf ServerIntf = (ServerIntf) Naming.lookup(ServerURL); 

System.out.println("Enter first number : ");  
double d1 = sc.nextDouble(); 

System.out.println("Enter second number : "); 
double d2 = sc.nextDouble(); 

System.out.println("First number is: "+d1);
System.out.println("Second number is:"+d2);
// Invoke remote method to add numbers 

System.out.println(".......Result.......");

System.out.println("The sum is: " + ServerIntf.add(d1, d2)); 
}  
catch (Exception e) { System.out.println("Exception occurred at client side "+ e.getMessage()); 
}

}} 