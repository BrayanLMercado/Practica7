/*
Nombre: Lopez Mercado Brayan
Matrícula: 1280838
Materia: Programación Orientada a Objetos 
Práctica 7: Arreglos y Herencia En Java
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
		persona b= new persona("Agustin", "Chacón");
		persona c= new persona("María", "Cortez");
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
