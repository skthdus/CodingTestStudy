public class 모스부호_1 {

    public String solution(String letter) {
        String answer = "";

        String[] morseList = { ".-","-...","-.-.","-..",".","..-.",
                "--.","....","..",".---","-.-",".-..",
                "--","-.","---",".--.","--.-",".-.",
                "...","-","..-","...-",".--","-..-",
                "-.--","--.."};

        //String[] morse = letter.split(" ");

        //for (int i =0; i< morseList.length; i++){
        //if(morse.equals(morseList[i])){
        //answer += Character.toString(i + 'a');
        //}
        //}

        int ascii = 97;
        String[] alphabets = letter.split(" ");
        for (String alphabet : alphabets) {
            for (int i = 0; i < morseList.length; i++) {
                if (morseList[i].equals(alphabet)) {
                    answer += (char)(ascii + i);
                }
            }
        }



        return answer;
    }

}
