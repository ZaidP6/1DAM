package ejemplo06_repasoarrays;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int tam;
		//1.declaración de arrays, varias formas
		
		//a) Dando valores a cascaporras
		//como no damos el tamaño el tamaño es directamente el número de elementos que ponemos
		
		int []lista= {2,8,6}; //Tamaño?3
		
		//b)Declarando e instanciando en diferentes lineas
		//primero se declara
		int []lista2;
		
		//necesito el tamaño y lo pido por teclado
		System.out.println("Indique tamaño");
		tam = Leer.datoInt();
		
		//instancio la lista con el tamaño
		lista2 = new int [tam];//tamaño ya está leido, se puede usar
		
		//c)Todo en la misma línea, debemos tener le  tamaño antes
		
		System.out.println("Indique el tamaño");
		tam= Leer.datoInt();
		
		int [] lista3 = new int[tam];
		
		//El mejor el segundo sunque puede que nos encontremos el primero
		
		
		//2. Cargar y rellenar array
			//a)leyendo por teclado
		
			for (int i = 0; i < lista3.length-1; i++) { //reservamos la última para poner el total, es una posibilidad
				lista3[i]=Leer.datoInt();
				
			}
		
			//b)aleatorio
			int desde, hasta;
			Random rdm = new Random(System.nanoTime());
			
			System.out.println("Indique el desde");
			desde = Leer.datoInt();
			System.out.println("Indique el hasta");
			hasta = Leer.datoInt();
			System.out.println("Indique el tamaño");
			tam = Leer.datoInt();
			
			int [] lista4 = new int[tam];
			
			for (int i = 0; i < lista4.length; i++) {
				lista4[i] = rdm.nextInt(hasta-desde +1)+desde;
			}
			for (int i = 0; i < lista4.length; i++) {
				System.out.println(lista4[i]);
			}
			
			
			//c)cascaporra style
		
			int lista5[] = {4,8,6,9,4,8};
			
		//3. Mostrar array
			
			for (int i = 0; i < lista4.length; i++) {
				System.out.println(lista4[i]);
			}
			
		//4. Acceso a un ellemento
			
			int indiceNoInformatico, nuevoValor;
			
			System.out.println("Indique el luegar que desea cambiar");
			indiceNoInformatico = Leer.datoInt() -1;
			System.out.println("Idique el nuevo valor");
			nuevoValor = Leer.datoInt();
			lista[indiceNoInformatico] = nuevoValor;
			
		//5. sumamos elemntos
			int suma = 0;
			//en caso de estar en un case poner suma = 0 para inicializar siempre la variable a 0 al empezar
			for (int i = 0; i < lista5.length; i++) {
				suma += lista5[i];
			}
			System.out.println(suma);
			
			
			
		//Operaciones variadas
			
			for (int i = 0; i < lista5.length; i++) {
				if(lista[i]%2==0) {
					lista[i]= lista[i]*13;
				}
				
			for (int j = 0; j < lista4.length; j++) {
				int contCeros = 0;
				if(lista4[i] == 0) {
					contCeros++;
				}
			}	
			
			}
			
			
		
		
	}

}
