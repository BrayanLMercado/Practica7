/*
Nombre: Lopez Mercado Brayan
Matr�cula: 1280838
Materia: Programaci�n Orientada a Objetos 
Pr�ctica 7: Arreglos y Herencia En Java
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
		System.out.println("Blue Atac�");
	}
	
	public void division(){
		System.out.println("Blue se dividi� en tres");
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
