import java.util.Scanner;

public class 직각삼각형출력하기 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String x = "*";
        String star = "*";

        for (int i = 0; i<n;i++){

            System.out.print(x);
            x = x.concat(star);

            System.out.println();
        }


    }

}
