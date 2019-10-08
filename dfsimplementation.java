import java.io.*;
import java.util.*;
public class dfsimplementation {
	static ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
	static boolean [] visited;
	public static void main(String [] args) throws Exception {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int t = in.nextInt();
		//System.out.println(n);
		//System.out.println(n);
		int [] portals = new int[n];
		for(int i=0;i<n;i++)
		{
			arr.add(new ArrayList<Integer>());
		}
		visited = new boolean[n+1];
		visited[1] = true;


		for(int i=1;i<n;i++)
		{
			int a = in.nextInt();
			portals[i] = a;
			arr.get(i).add(i+a);
		}
		//System.out.println(Arrays.toString(portals));
		// System.out.println(arr);
		dfs(arr,1);
		// System.out.println(Arrays.toString(visited));
		if(visited[t])
			System.out.println("YES");
		else
			System.out.println("NO");

	}
	public static void dfs(ArrayList<ArrayList<Integer>> adj, int i) {
		if(visited[adj.get(i).get(0)] == false)
		{
		visited[adj.get(i).get(0)] = true;
		if(adj.get(i).get(0) < adj.size())
		dfs(adj, adj.get(i).get(0));
		}

		
	}
}