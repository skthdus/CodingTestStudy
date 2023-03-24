public class 양꼬치 {

    public int solution(int n, int k) {
        int service = n / 10;
        if(service >= 1){
            int answer = 12000 * n + 2000 * (k-service);
            return answer;

        } else {
            int answer = 12000 * n + 2000 * k;
            return answer;
        }

    }
}
