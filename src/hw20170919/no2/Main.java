package hw20170919.no2;

import java.util.Scanner;

/**
 * 计算字符个数
 * @author cs
 *
 */
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine().toLowerCase();
        char sd=sc.nextLine().substring(0,1).toLowerCase().charAt(0);
        char[] hh=str.toCharArray();
        int ret=0;
        for (int i = 0; i < hh.length; i++) {
            if(hh[i]==sd){
                ++ret;
            }
        }
        System.out.print(ret);
    }
}
