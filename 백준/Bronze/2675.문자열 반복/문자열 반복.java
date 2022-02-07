import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int testcase = sc.nextInt();

        for(int k = 0 ; k < testcase ; k++)
        {
            int num = sc.nextInt(); //입력받은 숫자
            String test = sc.next(); //입력받은 문자

            String[] str = test.split("");

            for(int i = 0 ; i < str.length ; i++)
            {
                for(int j = 0 ; j < num ; j++)
                {
                    System.out.print(str[i]);
                }
            }

            System.out.println();
        }
    }
}
