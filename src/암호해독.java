public class 암호해독 {

    public String solution(String cipher, int code) {
        String answer = "";

        String[] pass = cipher.split("");

        for (int i = 0; i<pass.length;i++){
            if((i+1) % code == 0){
                answer += pass[i];
            }
        }

        return answer;
    }

}
