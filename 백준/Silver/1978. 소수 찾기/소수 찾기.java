import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int count = 0;

        for(int i = 0 ; i < N ; i++)
        {
            int num = sc.nextInt();
            boolean isSosu = true;

            // 소수 판별
            // 자신을 제외한 약수가 없는 경우
            if(num == 1)
            {
                continue;
            }
            for(int j = 2 ; j < num ; j++)
            {
                if (num % j == 0)
                {
                    isSosu = false;
                    break;
                }
            }

            if(isSosu)
            {
                count++;
            }
        }

        System.out.println(count);
    }
}
