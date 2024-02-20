package ejercicio_08;

public class CuentaCorriente {
	
	/*Se desea llevar un control del estado de una cuenta corriente. Una cuenta corriente está caracterizada por su saldo y el nombre del titular y sobre ella se pueden realizar tres tipos de operaciones:
	 
	•Ingresar (cantidad): ingresa en la cuenta una cantidad de dinero dada por el usuario. No imprime de nuevo el saldo, pero sí lo actualiza.
	•Retirar (cantidad): Debe comprobar si queda suficiente saldo y si es así, disminuye la cuenta una determinada cantidad de dinero especificada por el usuario. No imprime de nuevo el saldo, pero sí lo actualiza.
	•Calcular el saldo en dólares americanos. Se le debe pasar el valor de cambio y debe devolver el valor del saldo en dólares.
	•Consultar el saldo. Solo imprime el saldo.
	Supón que la cuenta inicialmente tiene un saldo de cero. Escribe una clase CuentaCorriente que implemente las funcionalidades descritas y un main con un menú para probarlas.*/

	
	private double saldo;
	private String nombreTitular;
	
	//Constructores
	public CuentaCorriente(double saldo, String nombreTitular) {
		super();
		this.saldo = saldo;
		this.nombreTitular = nombreTitular;
	
	//Getters and Setters
	
	}
	//no es obligatorio usar los gettter and setter
	public double getSaldo() {
		return saldo;
	}
	//todos los métodos void no tienen por qué imprimir, pero todos los 
	// imprimir si tienen que ser con void.
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}

	//toString
	
	public String toString() {
		return "CuentaCorriente [saldo=" + saldo + ", nombreTitular=" + nombreTitular + "]";
	}
	
	public double ingresarDinero(double ingreso) {
		saldo+=ingreso;
		return saldo;
	}
	
	public boolean comprobarSaldo(double retirada) {
		
		boolean comprobado;
		if(saldo>=retirada) {
			comprobado=true;
		}
		else {
			comprobado=false;
		}
		return comprobado;
	}
	
	public double retirarDinero(double retirada,boolean comprobado) {
		if(comprobado==true) {
			saldo-=retirada;
		}
		return saldo;
	}
	
	public double calcularCambioDolares(double cambio) {
		double saldoDolares=0;
		
		saldoDolares=saldo*cambio;
		
		return saldoDolares;
	}
	
	public void imprimirSaldoDolares(double saldoDolares){
		
		System.out.printf("El saldo en dólares es de %.2f $. ",saldoDolares);
		
	}
	
	public void imprimirSaldo() {
		System.out.printf("El saldo de la cuenta es de %.2f €.",saldo);
	}
	
}
