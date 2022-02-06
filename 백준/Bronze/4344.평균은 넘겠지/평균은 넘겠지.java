import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt(); //테스트 케이스 수

        for(int i = 0 ; i < test ; i++)
        {
            //첫 수에는 학생의 수
            int num = sc.nextInt();
            int sum = 0;
            int cnt = 0;

            //배열초기화
            int[] test_case = new int[num];

            //학생의 수 만큼 배열값 받기
            for(int j = 0 ; j < num ; j++)
            {
                test_case[j] = sc.nextInt();
                sum += test_case[j];

            }

            //평균 계산
            float avg = sum/(float)num;

            //평균을 넘는 학생들의 비율 계산
            for(int k = 0 ; k < test_case.length; k++)
            {
                if(test_case[k] > avg)
                {
                    cnt++;
                }
            }

            System.out.println(String.format("%.3f", (cnt/(float)num)*100)+"%");
        }
    }
}
