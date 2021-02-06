import java.rmi.*;

public interface StrongNumbers extends Remote {
	public String strongNumber(int n) throws RemoteException; 
}