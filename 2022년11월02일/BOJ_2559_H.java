import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2559_H {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N+1];
        arr[0] = 0;
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            arr[i] = arr[i-1] + Integer.parseInt(st.nextToken());
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= N-K ; i++) {
            int tmp = arr[i+K]-arr[i];
            if (tmp > max) max = tmp;
        }
        System.out.println(max);
    }
}
