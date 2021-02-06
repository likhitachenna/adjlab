package exp2_tcpnetwork;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class tcpserver {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			ServerSocket ss=new ServerSocket(2000);
			System.out.println("Server is ready for clients");
			Socket client=ss.accept();
			
			DataInputStream din=new DataInputStream(client.getInputStream());
			PrintStream pw=new PrintStream(client.getOutputStream());
			String s = din.readLine();
			int n = Integer.parseInt(s);
			
			System.out.println("Client data:"+n);
			int a = 0;
		    while(n!=0)
		    {
		    	a+=n%10;
		    	n/=10;
		    }
			pw.println(String.valueOf(a));
			client.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
