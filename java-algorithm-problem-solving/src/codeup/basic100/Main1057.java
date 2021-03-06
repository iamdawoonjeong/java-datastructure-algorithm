package codeup.basic100;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1057 : [기초-논리연산] 참/거짓이 서로 같을 때에만 참 출력하기
 *  
 * @references https://codeup.kr/problem.php?id=1057
 * @author iamdawoonjeong
 */
public class Main1057 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        if (a == b) {
            System.out.println(1);
        }else {
            System.out.println(0);
        }

    }
}
