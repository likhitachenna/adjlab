import java.rmi.*;
import java.util.*;

public class RMIClient {
	public static void main(String[] args) throws Exception{
		int n;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper range number: ");
		n = sc.nextInt();
		
		StrongNumbers sn = (StrongNumbers)Naming.lookup("rmi://localhost:1099/StrongServer");
		str = sn.strongNumber(n);
		System.out.println("Strong numbers upto given range is:"+str);
	}
}