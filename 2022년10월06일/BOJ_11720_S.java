import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 숫자의 합
public class BOJ_11720_S {
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String num = br.readLine();
		
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum += num.charAt(i) - '0';
		}
		
		System.out.println(sum);
	}
}
