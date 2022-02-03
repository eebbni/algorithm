import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int[] mod  = new int[10]; // 나머지 값 모아두는 배열
        int count = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        for(int i = 0 ; i < 10 ; i++)
        {
            nums[i] = sc.nextInt();
            mod[i]  = nums[i] % 42;
        }

        for(int item : mod){
            if(!arrayList.contains(item))
                arrayList.add(item);
        }

        System.out.println(arrayList.toArray().length);
    }
}
