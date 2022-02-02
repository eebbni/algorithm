import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        //int A = sc.nextInt();
        int[] nums = new int[10];
        int[] rnums = new int[10];

        for(int i = 1 ; i < 10 ; i++)
        {
            nums[i] = sc.nextInt();
        }

        for(int j = 1; j < rnums.length; j++)
        {
            rnums[j] = nums[j];
        }

        //int[] rnums = nums; //원래 배열 값 저장 -> 이렇게 하면 배열이 서로 공유가 됨?

        Arrays.sort(nums);
        System.out.println(nums[9]);

        for(int k = 1; k < rnums.length; k++)
        {
            if(rnums[k] == nums[9])
            {
                System.out.println(k);
            }
        }
    }
}
