public class n의배수고르기 {

    public int[] solution(int n, int[] numlist) {
        int num =0;
        int count =0;

        for(int i = 0; i<numlist.length; i++){
            if( numlist[i] % n == 0){
                count++;
            }
        }

        int[] answer = new int[count];

        for(int i = 0; i<numlist.length; i++){
            if(numlist[i] % n ==0){
                answer[num] = numlist[i];
                num++;
            }
        }

        return answer;

    }

}
