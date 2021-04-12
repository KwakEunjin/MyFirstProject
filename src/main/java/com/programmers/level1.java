package com.programmers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class level1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//System.out.println("가로 수를 입력하세요");
		//int width    =  sc.nextInt(); 
		//System.out.println("세로 수를 입력하세요");
		//int height   = sc.nextInt();
		//System.out.println("움직일 수를 입력하세요");
		//int movescnt = sc.nextInt();
		
		//int[][] num = new int[width][height];
		//int[] moves = new int[movescnt];
		int[][] num = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		Q2(num, moves);
	}
	
	/* 두 개 뽑아서 더하기 */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public int[] Q1(int[] numbers) {
		/* Main함수 */
    	/* Scanner sc = new Scanner(System.in);
		
		int[] num = new int[sc.nextInt()];
		
		for (int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		Q1(num); */

    	// 1번
    	TreeSet<Integer> tsNumber = new TreeSet<Integer>(); 
    	
    	for (int i = 0; i < numbers.length - 1; i++) {
    		for (int j = i+1; j < numbers.length; j++) {
    			tsNumber.add(numbers[i] + numbers[j]);
    		}
    	}
    	
    	Iterator<Integer> it = tsNumber.iterator();
    	int[] answer = new int[tsNumber.size()];
    	int idx 	 = 0;

    	while (it.hasNext()) {
			answer[idx] = it.next();
			idx++;
		}

        return answer;

    	// 2번
        /* ArrayList<Integer> array = new ArrayList();
        
        // 모든 경우의 두 수 더해서 array에 저장
        for (int i = 0 ; i < numbers.length - 1; i++) {
        	for (int j = i + 1; j < numbers.length; j++) {
        		array.add(numbers[i] + numbers[j]);
        	}
        }
        
        // TreeSet : 정렬과, 중복제거에 효율적인 HashMap
        TreeSet<Integer> t = new TreeSet(array);
        // Iterator : Set, Map, List같은 요소들을 읽어오는 방법을 표준화 한 것 
        Iterator it = t.iterator();

        int[] answer = new int[t.size()];
        int index = 0;
        
        // 중복제거하고 정렬한 결과를 answer에 담기
        while (it.hasNext()) {
        	answer[index] = (Integer) it.next();
        	index++;
        }
        
        return answer; */
    }
	
	/* 크레인 인형뽑기 게임 */
    public static int Q2(int[][] board, int[] moves) {
		/* Main함수 */
    	/* int[][] num = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};
		int[] moves = {1,5,3,5,1,2,1,4};
		
		Q2(num, moves); */
    	
    	// 1번
    	ArrayList<Integer> basket = new ArrayList<Integer>();	// 바구니
    	int num, movesIdx, basketIdx = 0;
        int answer = 0;
    	
    	// 크레인이 바구니를 옮겨담는 수
    	for (int i = 0; i < moves.length; i++) {
    		movesIdx = moves[i] - 1;
    		
    		//  인형이 들어있는 행을 찾는다.
    		for (int j = 0; j < board.length; j++) { 
    			num = board[j][movesIdx];
    			
    			// 인형이 들어있으면 바구니에 옮겨담고 해당 칸은 비운다.
    			if (num > 0) {
    				basket.add(board[j][movesIdx]);
    				board[j][movesIdx] = 0;
    				
    				basketIdx = basket.size() - 1; 
    				
    				// 바스켓에 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이면 두개 제거하고 카운드
    				if (basketIdx > 0 && basket.get(basketIdx) == basket.get(basketIdx - 1)) {
    					basket.remove(basketIdx);
    					basket.remove(basketIdx - 1);
    					answer+=2;
    				}
    				
    				break;
    			}
    		}
    	}
    	
        return answer;
        
        // 2번
        // https://velog.io/@lshjh4848/Java-%EC%8A%A4%ED%83%9DStack-%ED%81%B4%EB%9E%98%EC%8A%A4-%EC%A0%95%EB%A6%AC
    }
}
