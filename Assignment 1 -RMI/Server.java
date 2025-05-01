import java.rmi.*; 
public class Server { 
public static void main(String args[]) { 
try {  
System.out.println("Server Started.....");
//create remote object 
ServerImpl ServerImpl = new ServerImpl();  
//bind the remote object 
Naming.rebind("Server", ServerImpl); 
} 
catch (Exception e) { 
System.out.println("Exception occurred at server"+ e.getMessage()); 
}

}}