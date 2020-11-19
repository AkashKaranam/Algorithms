import java.io.*;
import java.util.*;

public class hello {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String str = in.next();
		if(str.matches("\\S*h\\S*e\\S*l\\S*l\\S*o\\S*"))
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}


	}
}