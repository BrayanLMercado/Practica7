/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 7: Arreglos y Herencia En Java
*/

public class Bomb extends AngryBirdMain {
	public Bomb(){
		fly();
		attackBomb();
		launch();
		speed();
		chirp();
		statusBomb();
		createBlank();
		
	}
	
	public void attackBomb(){
		System.out.println("Bomb Atacó");
	}
	
	public void kaboom(){
		System.out.println("Kaboom*");
	}
	
	public void statusBomb(){
		int number=(int)(Math.random()*2);
		if(number==0){
			kaboom();
		}
		else{
			impact();
			kaboom();
		}
	}
}
