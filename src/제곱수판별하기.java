public class 제곱수판별하기 {

    public int solution(int n) {
        int answer = 2;

        for (int i=1; i<=n; i++){
            if( i * i == n){
                answer = 1;
            }
        }

        return answer;
    }

}
