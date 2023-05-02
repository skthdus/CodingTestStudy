public class 이차원으로만들기 {

    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];
        int count = 0;

        for (int i = 0; i < num_list.length; i++) {
            answer[i / n][i % n] = num_list[i];
        }

        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                answer[i][j] = num_list[count];
                count++;
            }
        }


        return answer;
    }

}
