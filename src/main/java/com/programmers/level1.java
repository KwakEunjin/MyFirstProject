package com.programmers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class level1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[sc.nextInt()];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		solution(num);
	}
	
	/* 두 개 뽑아서 더하기 */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public static int[] solution(int[] numbers) {
        ArrayList<Integer> array = new ArrayList();
        
        // 모든 경우의 두 수 더해서 array에 저장
        for (int i = 0 ; i < numbers.length - 1; i++) {
        	for (int j = i + 1; j < numbers.length; j++) {
        		array.add(numbers[i] + numbers[j]);
        	}
        }
        
        TreeSet<Integer> t = new TreeSet(array);
        Iterator it = t.iterator();

        int[] answer = new int[t.size()];
        int index = 0;
        
        while (it.hasNext()) {
        	answer[index] = (Integer) it.next();
        	index++;
        }
        
        return answer;
    }
}
