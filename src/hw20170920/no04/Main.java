package hw20170920.no04;

import java.util.Scanner;

/**
 * 数字颠倒
 * @author Shu Cheng
 *
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = Integer.parseInt(str.nextLine());
        StringBuilder sb  = new StringBuilder(n+"");  
        char[] ne=sb.reverse().toString().toCharArray();
        System.out.println(ne);
    }
 
}