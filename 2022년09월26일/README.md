 # 📚 오늘의 문제
 
### 수진 규현
- 백준 10870번 : [피보나치 수 5](https://www.acmicpc.net/problem/10870)
- 백준 17626번 : [Four Squares](https://www.acmicpc.net/problem/17626)


### 주혜
- 백준 2525번 : [오븐 시계](https://www.acmicpc.net/problem/2525)
- 백준 2480번 : [주사위 세개](https://www.acmicpc.net/problem/2480)

## 동적 계획법이란?

- 문제의 답을 여러번 계산하는 대신 한번 만 계산하고 결과를 재활용함으로써 속도향상을 이뤄냄 ex) 피보나치, 이항계수
- 위와 같은 방법을 메모이제이션(memoization)이라고 부른다.
- 최적 부분 구조(Optimal Substructure)
    - 큰 문제를 작은 문제로 나눌 수 있으며 작은 문제의 답을 모아서 큰 문제를 해결할 수 있다
- 중복되는 부분 문제(Overlapping Subproblem)
    - 동일한 작은 문제를 반복적으로 해결해야 한다.

## 해결방법

- 주어진 문제를 완전탐색을 이용해 해결
- 작은 문제와 큰 문제 사이의 점화식을 구한다.
- 중복된 부분 문제를 한번만 계산되도록 메모이제이션 적용
- 접근 방식
    - Top-down
        - 메모이제이션 + 재귀함수
    - Bottom-up
        - 메모이제이션 + 반복문
        
