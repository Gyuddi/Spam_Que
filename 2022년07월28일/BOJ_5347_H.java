import java.util.Scanner;

public class BOJ_5347_H {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int g = gcd(a,b);
            System.out.println((a/g)*(b/g)*g);
        }
    }
    private static int gcd(int a, int b){
        if (a % b ==0){
            return(b);
        }
        return gcd(b,a%b);
    }
}
