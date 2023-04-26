import java.util.Arrays;

public class 문자열정렬하기_2 {

    public String solution(String my_string) {
        String answer = "";

        String[] arry = my_string.toLowerCase().split("");

        Arrays.sort(arry);

        for(int i = 0; i<arry.length; i++){
            answer += arry[i];
        }

        return answer;
    }

}
