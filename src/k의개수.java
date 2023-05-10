public class k의개수 {

    public int solution(int i, int j, int k) {
        int answer = 0;

        for (int l = i; l <= j; l++) {

            // StringBuilder : 긴 문자열을 더하는 경우에 사용하기
            StringBuilder sb = new StringBuilder();
            sb.append(l);

            int defaultLength = sb.length();

            for (int r = 0; r < defaultLength; r++) {
                if ((sb.charAt(r) - '0') == k) {
                    answer++;
                }
            }
        }

        return answer;
    }

}
