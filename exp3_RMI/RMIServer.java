import java.rmi.*;
import java.rmi.server.*;

public class RMIServer extends UnicastRemoteObject implements StrongNumbers{
	public RMIServer() throws RemoteException{
		super();
	}

	public String strongNumber(int n) throws RemoteException{
		String s = "";
		for(int i=1; i<=n; i++){
			int cur = i;
			int sum = 0;
			int d;
			while(cur > 0){
				long fact = 1;
				d = cur % 10;
				for(int j=1; j<=d ; j++)
					fact = fact*j;
				sum += fact;
				cur /= 10;
			}
			if(sum == i)
				s = s + String.valueOf(i) + " ";
		}
		return s;
	}

	public static void main(String[] args) throws Exception{
		RMIServer server = new RMIServer();
		System.out.println("RMI Server is running");
		Naming.rebind("StrongServer",server);
	}
}