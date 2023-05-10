public class 숨어있는숫자의덧셈_2 {

    public int solution(String my_string) {
        int answer = 0;

        String[] arr = my_string.split("[^0-9]");

        for(int i = 0; i<arr.length; i++ ){
            answer += !arr[i].isEmpty() ? Integer.parseInt(arr[i]) :0;
        }

        return answer;
    }
}

