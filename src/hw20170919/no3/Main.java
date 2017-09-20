package hw20170919.no3;

import java.util.Scanner;
import java.util.Arrays;
  
/**
 * 明明的随机数
 * @author cs
 *
 */
public class Main
{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         
        while(scan.hasNext()){
            int n = scan.nextInt();
            int[] array = new int[n];
            for(int i=0;i<n;i++){
                array[i] = scan.nextInt();
            }
            Arrays.sort(array);//对输入的数组进行排序
            //对排好序的数组中重复的数组进行选择输出，首先输出第一个数
            System.out.println(array[0]);
            for(int i=1;i<n;i++){
                if(array[i] != array[i-1])
                    System.out.println(array[i]);
            }
        }
    }
}