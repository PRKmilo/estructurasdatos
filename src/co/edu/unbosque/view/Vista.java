package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vista {
	Scanner myInput = new Scanner( System.in );
	
	
	public int getnumber(String mensaje) {
		int a=0;
		System.out.println(mensaje);
		a=myInput.nextInt();
		return a;
	}
	
	public int paingettnumer(String mensaje) {
		 int a= Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
		 return a;
	}
	
	public void resultspain(String mensaje) {
		JOptionPane.showMessageDialog(null,mensaje);
	}

}
