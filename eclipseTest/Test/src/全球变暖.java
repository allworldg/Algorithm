import java.io.BufferedInputStream;
import java.util.Scanner;

public class ȫ���ů {
	public static int N;
	public static char[][] map;
	public static boolean[][] visited;
	public static boolean[][] survived;
	public static int count1 = 0;// ��һ�ε�������
	public static int count2 = 0;// �ڶ��ε�������

	public static void main(String[] args) {
		Scanner scanner = new Scanner(new BufferedInputStream(System.in));
		N = scanner.nextInt();
		map = new char[N][N];
		for (int i = 0; i < N; i++) {
			String str = scanner.next();
			char[] chars = str.toCharArray();
			for (int j = 0; j < chars.length; j++) {
				map[i][j] = chars[j]; // map��ʼ��
			}
		}

		visited = new boolean[N][N];
		survived = new boolean[N][N];

		for (int i = 1; i < N - 1; i++) {
			for (int j = 1; j < N - 1; j++) {// ��Ϊ��ͼ����Χ�ض��Ǻ��������ٱ���
				if (!visited[i][j] && map[i][j] == '#') {
					dfs1(i, j);// �ҳ����죬���ұ�ǳ���Щ���Բ��ᱻ��û
					count1++;
				}

			}
		}

		visited = new boolean[N][N];

		for (int i = 1; i < N - 1; i++) {
			for (int j = 1; j < N - 1; j++) {
				if (!visited[i][j] && survived[i][j]) {
					dfs2(i, j);
					count2++;
				}
			}
		}

		System.out.println(Math.abs(count1 - count2));
	}

	/**
	 * �����ѯ�����������Լ���ǲ�����û�ĵ���
	 * 
	 * @param x
	 * @param y
	 */
	public static void dfs1(int x, int y) {
		if (visited[x][y] || map[x][y] != '#') {
			return;
		}

		if (x < 1 || x > N - 1 || y < 1 || y > N - 1) {
			return;
		}

		if (map[x + 1][y] == '#' && map[x - 1][y] == '#' && map[x][y + 1] == '#' && map[x][y - 1] == '#') {
			survived[x][y] = true;
		}
		visited[x][y] = true;
		dfs1(x + 1, y);
		dfs1(x - 1, y);
		dfs1(x, y + 1);
		dfs1(x, y - 1);
	}
	
	public static void dfs2(int x,int y) {
		if (visited[x][y] || !survived[x][y]) {
			return;
		}
		
		if (x < 1 || x > N - 1 || y < 1 || y > N - 1) {
			return;
		}
		visited[x][y] = true; 
		dfs1(x + 1, y);
		dfs1(x - 1, y);
		dfs1(x, y + 1);
		dfs1(x, y - 1);
		
	}
}
