import java.rmi.*; 
public interface ServerIntf extends Remote {  
//method declaration  
public double add(double d1, double d2) throws RemoteException; 
} 