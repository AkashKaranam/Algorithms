import java.io.*;
import java.util.*;

public class taxi {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] s = new int[n];
		for(int i=0;i<n;i++)
		{
			s[i] = in.nextInt();
		}
		int numCars = 0;
		int onegroups = 0;
		int twogroups = 0;
		int threegroups = 0;
		int fourgroups = 0;
		for(int i=0;i<n;i++)
		{
			if(s[i] == 1)
			{
				onegroups++;
			}
			if(s[i] == 2)
			{
				twogroups++;
			}
			if(s[i] == 3)
			{
				threegroups++;
			}
			if(s[i] == 4)
			{
				fourgroups++;
			}
		}
		numCars+=fourgroups;
		fourgroups = 0;
		if(threegroups<=onegroups)
		{
			numCars+=threegroups;
			onegroups-=threegroups;
			threegroups = 0;
			if(twogroups % 2 == 0)
			{
				numCars += (twogroups/2);
				twogroups = 0;
				numCars += (int) (Math.ceil(onegroups/4.0));
				onegroups = 0;
			}
			else
			{
				numCars += (twogroups/2);
				twogroups = 1;
				if(onegroups>=2)
				{
					numCars+=1;
					twogroups=0;
					onegroups-=2;
					numCars+= (int) (Math.ceil(onegroups/4.0));
					onegroups = 0;
				}
				else
				{
					numCars+=1;
					twogroups = 0;
					onegroups = 1;
				}
			}
		}
		else
		{
			onegroups = 0;
			numCars += threegroups;
			threegroups = 0;
			numCars += (int) (Math.ceil(twogroups/2.0));
			twogroups = 0;
		}
		//System.out.println(onegroups + " " + twogroups + " " + threegroups + " " + fourgroups);
		System.out.println(numCars);

	}
}