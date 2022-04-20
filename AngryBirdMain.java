/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 7: Arreglos y Herencia En Java
*/

import java.util.Scanner;
public class AngryBirdMain {

	public static void main(String[] args) {
		String opc;
		Scanner Entry= new Scanner(System.in);
		
		do{
			Red Red1 = new Red();
			Blue Blue1= new Blue();
			Bomb Bomb1= new Bomb();
			AngryBirdMain set []= new AngryBirdMain[]{Red1,Blue1,Bomb1};
			for (int i=0;i<set.length;i++){
				set[i].display();
			}
			System.out.println("De Nuevo?");
			opc=Entry.nextLine();
			opc=opc.toLowerCase();
		}while(opc.equals("s"));
		
	}
	
	public static double launch(){
		int angle=(int)(1 + Math.random()*90);
		System.out.println("Angulo de lanzamiento: " + angle + " Grados" );
		return angle;
	}
	
	public static int speed(){
		int speed=(int)(15 + Math.random()*20);
		System.out.println("Velocidad De Lanzamiento: " + speed + " m/s" );
		return speed;
	}
	
	public static void chirp(){
		System.out.println("Angry Chirping*");
	}
	
	public static void fly(){
		System.out.println("Lanzamiento realizado");
	}
	
	public static void createBlank(){
		System.out.print("\n");
	}
	
	public static void impact(){
		System.out.println("Impact*");
	}
	
	public void display(){
	 //Hola, estoy aquí para mostrar el array.	
	}

}
