package exp2_tcpnetwork;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;

public class tcpclient {
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
			Socket s=new Socket("localhost",2000);
			
			DataInputStream din=new DataInputStream(s.getInputStream());
			PrintStream pw=new PrintStream(s.getOutputStream());
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the number:");
			int n = sc.nextInt();
			String str = String.valueOf(n);
			pw.println(str);
			System.out.println("Sum Of Digits:"+din.readLine());
			s.close();
			System.out.println("Server is closed.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
