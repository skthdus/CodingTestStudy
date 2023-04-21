public class 게임369 {

    public int solution(int order) {
        int answer = 0;

        String[] numArr = (""+order).split("");

        for(int i = 0; i < numArr.length; i++){
            if(numArr[i].equals("3") || numArr[i].equals("6") || numArr[i].equals("9") ){
                answer ++;
            }
        }

        return answer;
    }

}
