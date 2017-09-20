package hw20170920.no06;

import java.util.Scanner;

/**
 * 句子逆序
 * @author Shu Cheng
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        String n = str.nextLine();
        String[] a=n.split(" ");
        StringBuilder sb  = new StringBuilder();
        for (int i = a.length-1; i > 0; i--) {
            sb.append(a[i]);
            sb.append(" ");
        }
        sb.append(a[0]);
        System.out.println(sb);
    }  
}