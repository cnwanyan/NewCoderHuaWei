package hw20170920.no08;

import java.util.Scanner;

/**
 * 求int型数据在内存中存储时1的个数
 * @author Shu Cheng
 *
 */
public class Main {
    public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
            int n=in.nextInt();
            String g=Integer.toBinaryString(n);
            char[] s=g.toCharArray();
            int num=0;
            for (char c : s) {
                if(c=='1'){
                    ++num;
                }
            }
            System.out.println(num);
    }
}
