package co.edu.unbosque.controller;

import co.edu.unbosque.model.Numbers;
import co.edu.unbosque.model.Sumatoria;
import co.edu.unbosque.view.Vista;

public class Controller {
	
	private Vista vista;
	private Numbers numeros;
	private Sumatoria sum;
	public Controller() {
		vista=new Vista();
		numeros=new Numbers();
		sum=new Sumatoria();
		
		int a=vista.paingettnumer("ingrese el primer numero");
		int b=vista.paingettnumer("ingrese el segundo numero");
		
		vista.resultspain("la suma de los dos numeros es "+(sum.sum(sum.array(a, b))));
		vista.resultspain("la resta de los dos numeros es "+(sum.res(a,b)));
		vista.resultspain("la multiplicacion de los dos numeros es "+(sum.multiplicacion(a,b)));
	    vista.resultspain("la division de los dos numeros es "+(sum.division(a,b)));
		
	}

}
