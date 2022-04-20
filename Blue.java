/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 7: Arreglos y Herencia En Java
*/

public class Blue extends AngryBirdMain{
	public Blue(){
		fly();
		attackBlue();
		launch();
		speed();
		chirp();
		statusBlue();
		createBlank();
		
	}
	
	public void attackBlue(){
		System.out.println("Blue Atacó");
	}
	
	public void division(){
		System.out.println("Blue se dividió en tres");
	}
	
	public void statusBlue(){
		int number=(int)(Math.random()*2);
		if(number==1){
			division();
			impact();
		}
		else{
			impact();
		}
	}
		
}
