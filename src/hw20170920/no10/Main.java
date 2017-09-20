package hw20170920.no10;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
/**
 * 坐标移动
 * @author Shu Cheng
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()) {
            String str = in.nextLine();
            String[] strs = str.split(";");
            int x = 0, y = 0;
            for(String s : strs) {
                if(s.charAt(0) == 'D' && s.substring(1).matches("\\d+"))
                    x += Integer.parseInt(s.substring(1));
                if(s.charAt(0) == 'W' && s.substring(1).matches("\\d+"))
                    y += Integer.parseInt(s.substring(1));
                if(s.charAt(0) == 'S' && s.substring(1).matches("\\d+"))
                    y -= Integer.parseInt(s.substring(1));
                if(s.charAt(0) == 'A' && s.substring(1).matches("\\d+"))
                    x -= Integer.parseInt(s.substring(1));
            }
            System.out.println(x + "," + y);
        }
        in.close();
    }
}