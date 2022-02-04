import java.io.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.lang.Integer;

public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        float[] score = new float[count];
        float[] new_score = new float[count];
        float sum = 0;

        for(int i= 0; i < count ; i++)
        {
            score[i] = sc.nextInt();
        }

        //배열 정렬
        Arrays.sort(score);

        for(int i= 0; i < count ; i++)
        {
            new_score[i] = (score[i]/score[score.length-1])*100;
            sum += new_score[i];
        }

        System.out.println(sum/(float)count);
    }
}
