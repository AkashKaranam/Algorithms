import java.io.*;
import java.util.*;

public class factor {
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for(int r=0;r<t;r++)
		{
			long n = in.nextLong();
			long copyn = n;
			int mid = (int) Math.floor(Math.sqrt(copyn));
			ArrayList<Integer> primes = new ArrayList<Integer>();
			for(int i=2;i<=mid;i++)
			{
				while(n % (long)i == 0)
				{
					//System.out.println("Adding " + i);
					primes.add(i);
					n/=i;
				}
				
			}
			if(primes.size() < 2)
			{
				//System.out.println("BEST SEQUENCE IS JUST THE NUMBER ITSELF");
				System.out.println(1);
				System.out.println(copyn);
			}
			else
			{
				if(primes.size() == 2 && primes.get(0) == 2 && primes.get(1) == 2)
				{

					System.out.println(2);
					long rest = copyn/2L;
					System.out.println(2 + " " + rest);
					//System.out.println("BEST SEQUENCE IS JUST THE 2 times half the number");
				}
				else
				{
					Map<Integer,Integer> freq = new HashMap<Integer, Integer>();
					for(int i=0;i<primes.size();i++)
					{
						if(!freq.keySet().contains(primes.get(i)))
						{
							freq.put(primes.get(i),1);
						}
						else
						{
							freq.put(primes.get(i), freq.get(primes.get(i))+1);
						}
					}
					int maxpower = -1;
					int maxnumber = -1;
					for(Map.Entry<Integer,Integer> entry: freq.entrySet())
					{
						if(entry.getValue() > maxpower)
						{
							maxpower = entry.getValue();
							maxnumber = entry.getKey();
						}
					}
					double prod = Math.pow(maxnumber,maxpower-1);
					double rest = ((double)copyn)/prod;
					//System.out.println("REST: " + rest);
					String remaining = rest + "";
					//System.out.println("REMAINING: " + remaining);
					int dotindex = remaining.indexOf(".");
					int eindex = remaining.indexOf("E");
					//System.out.println("INDEX " + index);
					String output = "";
					if(dotindex == -1 && eindex == -1)
					{
						output = remaining;
					}
					else if(eindex == -1 && dotindex != -1)
					{
						output = remaining.substring(0,dotindex);
					}
					else
					{
						output = remaining.substring(0,eindex).replace(".","");
						int power = Integer.parseInt(remaining.substring(eindex+1));
						int diff = eindex - dotindex - 1;
						if(power > diff)
						{
							for(int i=diff;i<power;i++)
							{
								output+="0";
							}
						}
					}


					String str = "";
					for(int i=0;i<maxpower-1;i++)
					{
						str+= maxnumber + " ";
					}
					str+=output;
					System.out.println(maxpower);
					System.out.println(str);
				}

			}
		}
	}
}