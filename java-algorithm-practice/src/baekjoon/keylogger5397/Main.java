package baekjoon.keylogger5397;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;


/**
 * 5397 키로거 
 * 
 * [문제]
 * 창영이는 강산이의 비밀번호를 훔치기 위해서 강산이가 사용하는 컴퓨터에 키로거를 설치했다. 
 * 며칠을 기다린 끝에 창영이는 강산이가 비밀번호 창에 입력하는 글자를 얻어냈다.
 * 키로거는 사용자가 키보드를 누른 명령을 모두 기록한다. 
 * 따라서, 강산이가 비밀번호를 입력할 때, 화살표나 백스페이스를 입력해도 정확한 비밀번호를 알아낼 수 있다.
 * 강산이가 비밀번호 창에서 입력한 키가 주어졌을 때, 강산이의 비밀번호를 알아내는 프로그램을 작성하시오.
 * 
 * [입력]
 * 첫째 줄에 테스트 케이스의 개수가 주어진다. 
 * 각 테스트 케이스는 한줄로 이루어져 있고, 강산이가 입력한 순서대로 길이가 L인 문자열이 주어진다. 
 * (1 ≤ L의 길이 ≤ 1,000,000) 강산이가 백스페이스를 입력했다면, '-'가 주어진다. 
 * 이때 커서의 바로 앞에 글자가 존재한다면, 그 글자를 지운다. 
 * 화살표의 입력은 '<'와 '>'로 주어진다. 이때는 커서의 위치를 움직일 수 있다면, 왼쪽 또는 오른쪽으로 1만큼 움직인다.
 *  나머지 문자는 비밀번호의 일부이다. 
 *  물론, 나중에 백스페이스를 통해서 지울 수는 있다.
 *   만약 커서의 위치가 줄의 마지막이 아니라면, 커서 및 커서 오른쪽에 있는 모든 문자는 오른쪽으로 한 칸 이동한다.
 * 
 * [출력]
 * 각 테스트 케이스에 대해서, 강산이의 비밀번호를 출력한다. 비밀번호의 길이는 항상 0보다 크다.
 * 
 * [예제]
 * 2
 * <<BP<A>>Cd-
 * ThIsIsS3Cr3t
 * 
 * BAPC
 * ThIsIsS3Cr3t
 * 
 * 반례: 
 * 1
 * A<B<C<D<E
 * 
 * @reference https://www.acmicpc.net/problem/5397
 * @author iamdawoonjeong
 */
public class Main {

    public static void main(String[] args) {

        try {
            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            
            int testCase= Integer.parseInt(br.readLine());
            String result[] = new String[testCase];
            
            //문제풀기
            for (int i = 0; i < testCase; i++) {
                String str = br.readLine();
                result[i] = solution(str);
            }
            
            //출력
            for (int i = 0; i < testCase; i++) {
                System.out.println(result[i]);
            }

            br.close();
            isr.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static String solution(String str) {
        Stack<Character> leftStack = new Stack<Character>();
        Stack<Character> rightStack = new Stack<Character>();
        StringBuilder sb = new StringBuilder();
        
        char[] word = str.toCharArray();
        
        
        for (char c : word) {
            switch (c) {
            case '-': {
                
                if (!leftStack.isEmpty()){
                    leftStack.pop();
                }
                break;
                
            } case '<' :{
                
                if (!leftStack.isEmpty()) {
                    rightStack.push(leftStack.pop());
                }
                break;
                
            } case '>' :{
                
                if(!rightStack.isEmpty()) {
                    leftStack.push(rightStack.pop());
                }
                break;
                
            }
            default:
                leftStack.push(c);
                break;
            } 
            
        }
        
        for (Character ch : leftStack) {
            sb.append(ch);
        }

        while (!rightStack.isEmpty()) {
            sb.append(rightStack.pop());
            
        }
        return sb.toString();
        
    }

}
