import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int[] nums = new int[A];

        for (int i = 0 ; i < A ; i++)
        {
            nums[i] = sc.nextInt();
        }

        Arrays.sort(nums);
        System.out.println(nums[0]+" "+nums[A-1]);
    }
}
