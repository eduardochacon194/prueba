package app;

import java.util.Scanner;

public class Tarea1{
	Scanner leer = new Scanner(System.in);
	int x;
	int Matriz[][];
	public Tarea1() {
		System.out.println("---------------------");
		System.out.println("Tarea 1");
		System.out.println("Dimencion de la matriz");
		x= leer.nextInt();
		Matriz =new int [x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if(i==j){
					Matriz[i][j]=1;
				}else
					Matriz[i][j]=0;
				System.out.print("[" + Matriz[i][j] + "]");	
			}
			System.out.println();
		}	
	}
}
