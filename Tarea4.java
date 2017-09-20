package app;

import java.util.Scanner;

public class Tarea4 {
	
	Scanner leer = new Scanner(System.in);
	int x;
	int Matriz[][];
	int menor,mayor,contaux=0;
	int random;
	public Tarea4(){
		System.out.println("---------------------");
		System.out.println("Tarea 4");
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
		menor=mayor=Matriz[0][0];

		while(contaux<=1)
		{
			for (int i = 0; i < x; i++) {
				for (int j = 0; j < x; j++) {
				
					if(Matriz[i][j]>mayor && contaux==0){
						mayor=Matriz[i][j];
					}
					if(contaux==1 &&mayor==Matriz[i][j])
					{
						System.out.println("Numero Mayor :" +mayor+" en la posicion "+(i+1)+","+(j+1));

					}
					if(Matriz[i][j]<menor && contaux==0){
						menor=Matriz[i][j];
						
					}
					if(contaux==1 &&menor==Matriz[i][j])
					{
						System.out.println("Numero Menor :" +menor+"  en la posicion "+(i+1)+","+(j+1));
					}
				}
			}
			contaux++;
		}
	}
}
