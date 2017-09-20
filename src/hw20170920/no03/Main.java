package hw20170920.no03;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
 
/**
 * 字符个数统计
 * @author Shu Cheng
 *
 */
public class Main {
 
    public static void main(String[] args) {
            Scanner str = new Scanner(System.in);
            String n = str.nextLine();
            char[] ne=n.toCharArray();
            Set dd=new HashSet<>();
            for (char c : ne) {
                byte   b   =(byte)c;
                if(b>=0&&b<=127){
                    dd.add(b);
                }
            }
            System.out.println(dd.size());
    }
 
}