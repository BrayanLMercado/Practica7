/*
Nombre: Lopez Mercado Brayan
Matr�cula: 1280838
Materia: Programaci�n Orientada a Objetos 
Pr�ctica 7: Arreglos y Herencia En Java
*/
public class Ejercicio3 {

	public static void main(String[] args) {
		persona[] array= new persona[]{new persona ("Brayan", "Mercado"), new persona("Elena", "Martinez"), 
						 new persona("Jose", "Rivera")};
		for(int i=0;i<array.length;i++){
			array[i].display();	
		}
		
		System.out.print(" ** Array 2 ** " + "\n" );
		persona a= new persona ("Armando", "Barreras");
		persona b= new persona("Agustin", "Chac�n");
		persona c= new persona("Mar�a", "Cortez");
		persona[] array2= new persona[]{a,b,c};
		for(int i=0;i<array.length;i++){
			array2[i].display();	
		}
	}
	
}

class persona{
	public String name,apellido;
	
	persona(String name, String apellido){
		this.name=name;
		this.apellido=apellido;
	}
	
	public void display(){
		System.out.println("Nombre: " + name + "\n" + "Apellido: " + apellido + "\n" );
	}
}
