package no5;
import java.util.Scanner;
/**
 * 进制转换
 * @author cs
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine().substring(2);
            System.out.println(Integer.parseInt(s, 16));
        }
    }
}