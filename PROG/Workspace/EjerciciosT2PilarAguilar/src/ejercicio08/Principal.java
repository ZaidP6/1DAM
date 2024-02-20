package ejercicio08;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*
	 * Realizar un programa que simule un inicio de sesión leyendo por teclado el nombre del 
		usuario y la contraseña y comprobando si esos coinciden con unos guardados en unas 
		variables inicializadas por vosotros al comienzo del programa.
	 */
		
		String userAd = "user", passwordAd = "1234", user, password;
		
		System.out.println("Bienvenido");
		System.out.println("Intente averiguar la contraseña del admin.");
		
		System.out.println("Introduce un nombre de usuario.");
		user = Leer.dato();
		System.out.println("Introduce una contraseña.");
		password = Leer.dato();
		
		if(userAd.equalsIgnoreCase(user) && passwordAd.equalsIgnoreCase(password)) {
			System.out.println("Enhorabuena! Has acertado! Puedes iniciar sesión.");
		}else if(userAd.equalsIgnoreCase(user)){
			System.out.println("Bueno... Al menos has acertado el usuario.");
		}else if(passwordAd.equals(password)){
			System.out.println("Bueno... Al menos has acertado la contraseña.");
		}else
			System.out.println("Vaya... Otra vez será, no has acertado nada.");
		
		System.out.println("Gracias por jugar ^^.");
	}

}
