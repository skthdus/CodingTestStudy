public class 문자반복출력하기 {

    public int solution(int[] array, int n) {
        int answer = 0;

        for (int i =0; i< array.length; i++){
            if(array[i] == n ){
                answer ++;
            }
        }

        return answer;
    }

}
