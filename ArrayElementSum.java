package com.rts.basics;
import java.util.Scanner;
public class ArrayElementSum {
	public static void main(String args[]) {
	int[] arr = new int[6];
    Scanner sc = new Scanner(System.in);
    System.out.println("enetr 6 elements in array");
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        
    }
    
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]);
    }
    
}
}
