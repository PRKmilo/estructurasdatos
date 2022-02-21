package co.edu.unbosque.model;

import java.util.ArrayList;

public class Sumatoria {
	
	public ArrayList<Integer> array(int a,int b){
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(a);
		numbers.add(b);
		return numbers;
	}

	public int sum(ArrayList<Integer> array) {
		int a=0;
		for(int i=0;i<array.size();i++) {
			a+=array.get(i);
		}
		return a;
	}
	
	public int res(int a,int b) {
		int r= a-b;
		return r;
	}
	
	public int multiplicacion(int a,int b) {
		int r = a*b;
		return r;
	}
	
	public double division(int a,int b) {
		return a/b;
	}
}
