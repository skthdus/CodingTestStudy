import java.util.Arrays;

public class A로B만들기 {

    public int solution(String before, String after) {
        int answer = 0;

        int[] beforeArray = new int[26];
        int[] afterArray = new int[26];

        for (int i = 0; i < before.length(); i++) {
            beforeArray[before.charAt(i) - 'a']++;
        }

        for (int i = 0; i < after.length(); i++) {
            afterArray[after.charAt(i) - 'a']++;
        }

        answer = Arrays.equals(beforeArray, afterArray) ? 1 : 0;

        return answer;
    }

}
