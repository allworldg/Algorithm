
public class Ö½ÅÆÈı½ÇĞÎ {
	public static boolean[] visited;
	public static int[] arr;
	public static int count = 0;
	public static void main(String[] args) {
		visited = new boolean[9];
		arr = new int[9];
		dfs(0);
		System.out.println(count/6);
		
	}
	
	public static void dfs(int step) {
		if(step==9&&arr[0]+arr[1]+arr[3]+arr[5]==arr[0]+arr[2]+arr[4]+arr[8]&&arr[0]+arr[1]+arr[3]+arr[5]==arr[5]+arr[6]+arr[7]+arr[8]) {
			count++;
			return ;
		}
		else {
			for(int i=0;i<visited.length;i++) {
				if(!visited[i]) {
					visited[i] = true;
					arr[step] = i+1;
					dfs(step+1);
					visited[i]= false; 
				}
			}
		}
		
	}
}
