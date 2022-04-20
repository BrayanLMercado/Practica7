/*
Nombre: Lopez Mercado Brayan
Matr�cula: 1280838
Materia: Programaci�n Orientada a Objetos 
Pr�ctica 7: Arreglos y Herencia En Java
*/

public class Ejercicio2 {

	public static void main(String[] args) {
		double lista1 []= new double [5];
		double lista2 []= new double [5];
		System.out.println("Lista 1");
		fillNormal(lista1);
		System.out.println("Lista 2");
		fillRandom(lista2);
		
	}
	public static void fillNormal(double list[]){
		for (int i=0;i<list.length;i++){
			list[i]=0;
		}
		printList(list);
	}
	
	public static void fillRandom(double list[]){
		for (int i=0;i<list.length;i++){
			double a= 1 + Math.random()*100;
			list[i]=a;
		}
		printList(list);
	}
	
	public static void printList(double array[]){
		for (int j=0;j<array.length;j++){
			System.out.println(array[j]);
		}
	}
}
