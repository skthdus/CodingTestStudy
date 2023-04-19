public class 인덱스바꾸기 {

    public String solution(String my_string, int num1, int num2) {
        String answer = "";

        String[] word = my_string.split("");

        for (int i=0; i<word.length; i++){
            if(i == num1){
                answer += word[num2];
            } else if(i == num2){
                answer += word[num1];
            } else{
                answer += word[i];
            }
        }



        return answer;
    }

}
