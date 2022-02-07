import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String test = sc.next(); //입력받을 테스트


        //알파벳 배열 만들어주기
        for(char i='a'; i <= 'z';i++)
        {
            int cnt = 0;

            for(int j=0; j < test.length() ; j++)
            {
                if(test.charAt(j) == i)
                {
                    System.out.print(j+" ");
                    break;
                }

                cnt++;

                if(cnt == test.length())
                {
                    System.out.print("-1 ");
                }
            }
        }
    }
}
