package hw20170919.no4;
import java.util.Scanner;
/**
 * 字符串分隔
 * @author cs
 *
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while(scanner.hasNextLine()){
            String s=scanner.nextLine();
            while(s.length()>=8){
                System.out.println(s.substring(0,8));
                s=s.substring(8);
            }

            if(s.length()<8&&s.length()>0){
                System.out.println((s+"00000000").substring(0,8));
            }

        }
    }
}
