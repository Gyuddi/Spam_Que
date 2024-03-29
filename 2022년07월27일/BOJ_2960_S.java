// 에라토스테네스의 체
package Beakjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_2960_S {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[N + 1];

        int cnt = 0;

        for (int i = 2; i <= N; i++) {

            if (!arr[i]) {
                arr[i] = true;
                cnt++;

                if (cnt == K) {
                    System.out.println(i);
                }

                for (int j = i * i; j <= N; j += i) {

                    if (!arr[j]) {
                        arr[j] = true;
                        cnt++;
                        if (cnt == K) {
                            System.out.println(j);
                        }
                    }
                }
            }
        }
    }
}
