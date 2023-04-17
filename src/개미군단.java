public class 개미군단 {

    public int solution(int hp) {
        int answer = 0;

        // 장군 : 5
        int a = 0;
        // 병정 : 3
        int b = 0;
        // 일 : 1
        int c = 0;

        a = hp /5 ;
        b = (hp % 5) / 3;
        c = (hp % 5) % 3;

        answer = a + b + c;

        return answer;
    }

}
