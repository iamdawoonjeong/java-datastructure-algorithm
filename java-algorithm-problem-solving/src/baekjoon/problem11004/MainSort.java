package baekjoon.problem11004;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * 11004 K번째 수  - Arrays.sort()로 구하기
 * 
 * @reference https://www.acmicpc.net/problem/11004
 * @author iamdawoonjeong
 */
public class MainSort {

    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        
        try {
            String[] str = br.readLine().split(" ");
            int n = Integer.parseInt(str[0]);
            int k = Integer.parseInt(str[1]);
            
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                 arr[i] = (Integer.parseInt(st.nextToken())); 
            }
            
            Arrays.sort(arr);
            System.out.println(arr[k-1]);
            
            br.close();
            isr.close();
                    
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
