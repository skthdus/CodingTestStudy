public class 외계행성나이 {

    public String solution(int age) {
        String answer = "";

        String num = String.valueOf(age);

        String[] a = num.split("");

        for(int i=0; i<a.length; i++){
            answer += ((char)(Integer.parseInt(a[i])+97));
        }

        return answer;
    }

}
