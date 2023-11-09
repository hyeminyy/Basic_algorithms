package Algorithms;

import java.util.ArrayList;

public class Pibonach {

	public static void main(String[] args) {
		//피보나치 수열 Arr 사용 
		int [] arr = new int[100];
		
		//An = An-1 + An-2; n>=3
		//a1 = 1, a2 = 1
		
		arr[1] = 1;
		arr[2] = 1;
		
		for(int i=3; i<100; i++) {
			arr[i] = arr[i-1] + arr[i-2];
		}
		
		for(int i=3; i<10; i++) {
			System.out.println(arr[i] + " ");
		}
		System.out.println();
		
		
		
		//2번째 방법 그냥..
		//a1=1, a2=1
		int prevPrevNum = 1; //An-2
		int preNum = 1; //An-1
		
		System.out.println(prevPrevNum + " ");
		System.out.println(preNum + " ");
		
		for(int i=3; i<10; i++) {
			int nNum = prevPrevNum+preNum;
			System.out.println(nNum+" ");
			
			prevPrevNum = preNum;
			preNum = nNum;
		}
		
	}

}
