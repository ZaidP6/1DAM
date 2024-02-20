package ejemplo08_pasandoreferencia;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
	
	public class Fecha {
		private int dia; // 1-31 con base en el mes
		private int mes; // 1-12
		private int anio; // cualquier año
		public Fecha(int dia, int mes, int anio) {
		this.mes = mes;
		this.dia = dia;
		this.anio = anio;
		}
		public Fecha(int dia, int mes) {
		this.dia = dia;
		this.mes = mes;
		}
		public int getMes() {
		return mes;
		}
		public void setMes(int mes) {
		this.mes = mes;
		}
		public int getDia() {
		return dia;
		}
		public void setDia(int dia) {
		this.dia = dia;
		}
		public int getAnio() {
		return anio;
		}
		public void setAnio(int anio) {
		this.anio = anio;
		}
		@Override
		public String toString() {
		return "día: " + dia + " del " + mes + " de " + anio;
		}
		}

}
