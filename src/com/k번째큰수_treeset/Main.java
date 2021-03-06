package com.k번째큰수_treeset;

import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

	public int solution(int n, int k, int[] arr) {
		int answer = -1;
		TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());//뒤에 Collections.reverseOrder() 써주면 내림차순 정렬해줌
		for (int i = 0; i < n; i++) {
			for (int j = i+1; j < n; j++) {
				for (int l = j+1; l < n; l++) {
					Tset.add(arr[i]+arr[j]+arr[l]);
				}//for l
			}//for j
		}//for i
		int cnt=0;
		for (int x : Tset) {
			//System.out.println(x);
			cnt++;
			if(cnt==k) answer=x;
		}
		return answer;
	}

	public static void main(String[] args) {
		Main t = new Main();
		Scanner kb = new Scanner(System.in);
		int n = kb.nextInt();
		int k = kb.nextInt();
		int[] arr =new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = kb.nextInt();
		}
		System.out.println(t.solution(n,k,arr));
		kb.close();
	}
}
