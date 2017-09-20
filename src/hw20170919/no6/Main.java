package hw20170919.no6;

import java.util.Scanner;
/**
 * 质因分子
 * @author cs
 *
 */
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        long number=0;
        while(sc.hasNextLong()){
            	number=sc.nextLong();
            	getReString(number);
        };
    }
    
    public static String getReString(long ulDataInput){
    	while(ulDataInput!=1){
    		for (int i = 2; i <= ulDataInput; i++) {
				if(ulDataInput%i==0){
					ulDataInput/=i;
					System.out.print(i+" ");
					break;
				}
			}
    	}
    	return null;
    }
}