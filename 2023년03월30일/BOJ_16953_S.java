import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// A -> B
public class BOJ_16953 {
	static int a;
	static int b;
	static int result;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		a = Integer.parseInt(st.nextToken());
		b = Integer.parseInt(st.nextToken());
		result = 0;
		
		BFS(a);
		
		if(result == 0) {
			System.out.println(-1);
		}else {
			System.out.println(result);
		}
	}
	
	static void BFS(int a) {
		Queue<Node1> q = new LinkedList<>();
		q.add(new Node1(1, a));
		
		while(!q.isEmpty()) {
			Node1 now = q.poll();
			int level = now.level;
			int num = now.num;
			
			int next1 = num * 2;
			int next2 = Long.parseLong(num + "1") > Math.pow(10, 9) ? b+1 : Integer.parseInt(num + "1");
			
			if(next1 == b || next2 == b) {
				result = level+1;
				break;
			}else {
				if(next1 <= b) {
					q.add(new Node1(level+1, next1));
				}
				if(next2 <= b) {
					q.add(new Node1(level+1, next2));
				}
			}
		}
	}
}

class Node1{
	int level;
	int num;

	Node1(int level, int num){
		this.level = level;
		this.num = num;
	}
}
