
public class ²âÊÔ´ÎÊı {
	public static void main(String[] args) {
	     int n = 1000;
	        int m = 3;
	        int[][] dp = new int[1005][4];
	        for(int i=1;i<=n;++i){
	            for(int j=1;j<=m;++j){
	                dp[i][j] = dp[i - 1][j] + dp[i - 1][j - 1] + 1;
	            }
	            if(dp[i][m]>=n){
	                System.out.println(i);
	                break;
	            }
	        }
	}
}
