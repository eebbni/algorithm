import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int[] nums = new int[10]; //0부터 9까지 숫자 몇번 들어가는지 계산할 변수
        int gop = A * B * C;
        String to = Integer.toString(gop);
        String[] to2 = to.split("");
        int[] arr = new int[to2.length];

        //string형 int형으로 변경.. 왜 굳이 이렇게 까지 해야하는진 잘 모르겟다
        for(int i = 0 ; i < 10 ; i++)
        {
            for(int j = 0 ; j < to2.length ; j++)
            {
               arr[j] = Integer.parseInt(to2[j]);
               if(i == arr[j])
               {
                   nums[i] += 1;
               }
            }
        }

        for(int i = 0 ; i < 10 ; i++)
        {
            System.out.println(nums[i]);
        }
    }
}
