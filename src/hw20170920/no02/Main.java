package hw20170920.no02;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
 
/**
 * 提取不重复的整数
 * @author Shu Cheng
 *
 */
public class Main {
 
     
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        int n = Integer.parseInt(str.nextLine());
        StringBuilder sb  = new StringBuilder(n+"");  
        char[] ne=sb.reverse().toString().toCharArray();
        Set s=new LinkedHashSet();
        for (char c : ne) {
            s.add(c);
        }
        System.out.println(s.toString().replace(",", "").replace("[", "").replace("]","").replace(" ",""));
    }
}
     