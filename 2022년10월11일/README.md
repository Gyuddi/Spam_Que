 # 📚 오늘의 문제
### 규현
- 백준 2606번 : [바이러스](https://www.acmicpc.net/problem/2606)
### 수진
- 백준 11659번 : [구간 합 구하기 4](https://www.acmicpc.net/problem/11659)
### 주혜
- 백준 11021번 : [A+B-7](https://www.acmicpc.net/problem/11021)
- 백준 11022번 : [A+B-8](https://www.acmicpc.net/problem/11022)
- 백준 2438번 : [별 찍기 - 1](https://www.acmicpc.net/problem/2438)

<hr>

## 구간 합

- 합 배열을 이용
- 합 배열을 미리 구해놓으면 시간 복잡도가 O(N)에서 O(1)로 감소

 **합 배열 S 정의**

S[i] = A[0] + A[1] + A[2] + … + A[i-1] + A[i]     // A[0] 부터 A[i] 까지의 합

 **합 배열 S를 만드는 공식**

S[i] = S[i-1] + A[i]

 **구간 합을 구하는 공식**

S[j] - S[i-1]    // i에서 j까지의 구간 합
