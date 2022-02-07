import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int testcase = sc.nextInt();//테스트 케이스
        int sum = 0; //합계
        String inp = sc.next();
        String[] inpArr = inp.split("");

       for(int i = 0; i < testcase ; i++)
       {
           sum += Integer.parseInt(inpArr[i]);
       }
        System.out.println(sum);
    }
}
