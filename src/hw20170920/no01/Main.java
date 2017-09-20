package hw20170920.no01;

import java.util.Map;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;
 
/**
 * 合并表记录
 * @author Shu Cheng
 *
 */
public class Main {
 
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        SortedMap<Integer,Integer> map = new TreeMap<>();
        int n = Integer.parseInt(str.nextLine());
        for (int i = 0;i<n;i++){
            String[] mid = str.nextLine().split("\\s+");
            add(mid,map);
        }
         
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) { 
               
            System.out.println(entry.getKey() + " " + entry.getValue()); 
           
        }
    }
     
     
    public static void  add(String[] mid,SortedMap<Integer,Integer> map){
         int key = Integer.parseInt(mid[0]);
            int value = Integer.parseInt(mid[1]);
            if(map.containsKey(key)){
                map.put(key, map.get(key) + value);
            }else{
                map.put(key, value);
            };
    }
     
 
}