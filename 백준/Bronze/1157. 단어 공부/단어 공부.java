import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[26]; // 대문자가 입력된 배열
        int[] arr2 = new int[26]; // 대문자가 입력된 배열
        String txt = ""; // 입력받을 문자

        // 대문자 입력
        for(int i=0;i<arr.length;i++)
        {
            arr[i] = (char)(65+i);
        }

        txt = sc.nextLine();
        txt = txt.toUpperCase();
        char[] txtArr = txt.toCharArray(); // 문자열 배열로 변경

        for(int j=0;j<txtArr.length;j++) {
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] == txtArr[j]) {
                    arr2[k] = arr2[k] + 1;
                    continue;
                }
            }
        }

        //가장 큰 값 찾기
        int max = arr2[0];
        int maxIndex = 0;
        boolean flag = false;

        // 값 비교하기
        for(int h = 1 ; h<arr2.length;h++)
        {
            if (arr2[h] > max)
            {
               
                max = arr2[h];
                maxIndex = h;
                flag = false;
            }
            
            if(arr2[h] == max && maxIndex != h)
            {
               
                max = arr2[h];
                maxIndex = h;
                flag = true;
            }
        }

        if(flag)
        {
            System.out.println("?");
        }
        else
        {
            System.out.println(arr[maxIndex]);
        }


    }
}
