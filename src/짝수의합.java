public class 짝수의합 {

    public int solution(int n) {

        int answer = 0;
        int num;
        for(num=1; num<=n ;num++){

            if(num % 2 == 0){

                answer = answer + num ;

            }
        }
        return answer;


    }

}
