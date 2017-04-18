package no7;

import java.util.Scanner;

/**
 * 取近似值
 * @author cs
 *
 */
public class Main {
	public static void main(String [] args){
		Scanner sc=new Scanner(System.in);
			while (sc.hasNextDouble()) {
				double num=sc.nextDouble();
				System.out.println(Math.round(num));
			}
		
	}
}
