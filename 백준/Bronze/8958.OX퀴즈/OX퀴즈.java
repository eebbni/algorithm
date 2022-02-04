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
        String quiz;

        for(int i= 0; i < count ; i++)
        {
            quiz = sc.next();
            String[] quiz_arr = quiz.split("");

            int flag = 0;
            int score = 0;
            
            for(int j = 0 ; j < quiz_arr.length ; j++)
            {
                if(quiz_arr[j].contains("X"))
                {
                    flag = 0;
                }
                else
                {
                    flag++;
                    score += flag;
                }
            }
            System.out.println(score);
        }
    }
}
