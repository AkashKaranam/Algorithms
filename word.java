import java.io.*;
import java.util.*;

public class word {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		String s = in.next();
		String lowercases = s.toLowerCase();
		String uppercases = s.toUpperCase();
		//System.out.println(s + " " + lowercases + " " + uppercases);
		int lowerdiff = 0;
		int upperdiff = 0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i) != lowercases.charAt(i))
				lowerdiff++;
			if(s.charAt(i) != uppercases.charAt(i))
				upperdiff++;
		}
		if(lowerdiff <= upperdiff)
		{
			System.out.println(lowercases);
		}
		else
		{
			System.out.println(uppercases);
		}


	}
}