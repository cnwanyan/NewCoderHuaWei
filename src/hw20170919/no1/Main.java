package hw20170919.no1;

import java.util.Scanner;
/**
 * 字符串最后一个单词的长度
 * @author cs
 *
 */
public class Main{


    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str =sc.nextLine();
		String[] sp=str.split(" ");
		System.out.print(sp[sp.length-1].length());
    }
}