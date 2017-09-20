package app;

import java.util.Scanner;

public class Tarea2 {
	Scanner leer = new Scanner(System.in);
	int x;
	int Matriz[][];
public Tarea2 (){
	System.out.println("---------------------");
	System.out.println("Tarea 2");
	System.out.println("Dimencion de la matriz");
	x= leer.nextInt();
	Matriz =new int [x][x];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < x; j++) {
				if(i+j==x-1){
					Matriz[i][j]=0;
				}else
					Matriz[i][j]=1;
				System.out.print("[" + Matriz[i][j] + "]");	
			}
			System.out.println();
		}	
		System.out.println();
	}
}
