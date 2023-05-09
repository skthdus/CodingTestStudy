import java.util.Arrays;

public class 진로규정정하기 {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];
        int[] arr = new int[emergency.length];

        for(int i=0; i<emergency.length; i++){
            arr[i] = emergency[i];
        }

        Arrays.sort(arr);

        for (int i=0; i<emergency.length; i++){
            for (int j=0; j<emergency.length;j++){
                if(arr[i] == emergency[j]){
                    answer[j] = emergency.length - i;
                }
            }
        }

        return answer;
    }

}
