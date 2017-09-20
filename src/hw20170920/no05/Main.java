package hw20170920.no05;

import java.util.Scanner;

/**
 * 字符串反转
 * @author Shu Cheng
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String n = str.nextLine();
        StringBuilder sb  = new StringBuilder(n);  
        System.out.println(sb.reverse().toString().toCharArray());
    }
 
}