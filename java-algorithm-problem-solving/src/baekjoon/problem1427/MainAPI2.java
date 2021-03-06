package baekjoon.problem1427;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

/**
 * 1472 소트인사이드 - Arrays.sort() 이용
 * 
 * @reference https://www.acmicpc.net/problem/1472
 * @author iamdawoonjeong
 */
public class MainAPI2 {

    public static void main(String[] args) {
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            String[] input = br.readLine().split("");
            Integer[] arr = new Integer[input.length];
            for (int i = 0; i < input.length; i++) {
                arr[i] = Integer.parseInt(input[i]);
            }

            Arrays.sort(arr, new Comparator<Integer>() {

                @Override
                public int compare(Integer o1, Integer o2) {
                    return o2.compareTo(o1);
                }
                
            });

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]);
            }
            
            br.close();
            isr.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
