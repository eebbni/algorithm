import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int cnt = 1;
        int b,c;

        //10보다 작은 경우는 0과 더함
        if(A<10)
        {
            b = 0;
            c = A;
        }
        //그게 아니라면 나머지와 몫을 더함
        else
        {
            b = A / 10;
            c = A % 10;
        }

        int sum = b+c;

        while(true)
        {
            if((c*10)+(sum%10) == A)
            {
                System.out.println(cnt);
                break;
            }
            else
            {
                b = c;
                c = sum % 10;
                sum = b+c;

                cnt = cnt + 1;
            }
        }
    }
}
