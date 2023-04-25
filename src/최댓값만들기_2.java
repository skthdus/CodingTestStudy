import java.util.Arrays;

public class 최댓값만들기_2 {

    public int solution(int[] numbers) {
        int answer = 0;

        int pnum, mnum; //음수 : mnum ,양수 : pnum 최댓값

        Arrays.sort(numbers);

        // 작은 수 끼리 곱
        mnum = numbers[0] * numbers[1];
        // 큰 수끼리 곱
        pnum = numbers[numbers.length -1] * numbers[numbers.length -2];

        answer = Math.max(mnum, pnum);

        return answer;
    }

}
