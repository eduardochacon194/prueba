package app;

import java.util.Scanner;

public class Tarea3  {

	Scanner leer = new Scanner(System.in);
	int x;
	int Matriz[][];
	int vector[]= new int [10];
	int random;

	public Tarea3 (){
		System.out.println("---------------------");
		System.out.println("Tarea 3");
		System.out.println("Dimencion de la matriz");
		x= leer.nextInt();
		Matriz =new int [x][x];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				Matriz[i][j] = random= (int) Math.floor(Math.random() * (35 - 1 + 1) + 1);
			}
		}
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
			
				System.out.print("[" + Matriz[i][j] + "]");	
			}
			System.out.println();
		}	
	System.out.println();
	System.out.println("Numeros pares:");
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
			if(Matriz[i][j]%2==0){
				System.out.print(Matriz[i][j]+" ");
			vector[i]+=Matriz[i][j];
			}
			}
			System.out.println();
			}
		for (int i = 0; i < x; i++) {
			System.out.println("La suma de los pares es "+vector[i]);
		}	
			System.out.println();
		}	
}
