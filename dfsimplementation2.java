import java.io.*;
import java.util.*;

public class dfsimplementation2 {
	static ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
	static int [] level;
    public static void main(String [] args) throws Exception {
    	Scanner in = new Scanner(System.in);
    	int n = in.nextInt();
    	for (int i=0;i<n+1;i++) 
    	{
    		adj.add(new ArrayList<Integer>());
    	}
    	level = new int[n+1];
    	ArrayList<Integer> dfslist = new ArrayList<Integer>();
    	for (int i=0;i<n;i++) {
    		int a = in.nextInt();
    		if(a!=-1)
    			adj.get(a).add(i+1);
    		else
    		{
    			dfslist.add(i+1);
    			level[i+1] = 1;
    		}

    	}
    	for (Integer top: dfslist) 
    	{
    		dfs(top);
    	}
    	//System.out.println(adj);
    	//System.out.println(dfslist);
    	int maxlevel = -1;
    	for (Integer num: level) {
    		maxlevel = Math.max(maxlevel,num);
    	}
    	System.out.println(maxlevel);
    	//System.out.println("2nd list " + adj.get(1));



    }
    public static void dfs(int i)
    {
       //System.out.println("Entered DFS" + " " + i);
       //System.out.println(adj.get(i));
       for(Integer num:adj.get(i))
       {
        //System.out.println(num);
       	level[num] = level[i]+1;
       	dfs(num);
       }
    }
}