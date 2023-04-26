public class 문자열안에문자열 {

    public int solution(String str1, String str2) {
        int answer = 0;

        boolean result = str1.contains(str2);

        answer = result ? 1 : 2;

        return answer;
    }

}
