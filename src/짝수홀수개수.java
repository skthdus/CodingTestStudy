public class 짝수홀수개수 {

    public int[] solution(int[] num_list) {
        int[] answer = new int[2];

        // 홀수
        int odd = 0;
        // 짝수
        int even = 0;

        for(int i = 0; i < num_list.length ; i++){

            if(num_list[i] % 2 == 0){
                even ++;
            } else {
                odd++;
            }
        }

        answer[0]=even;
        answer[1]=odd;

        return answer;
    }

}
