package ejercicio02;

public class Conversor{

	//Métodos

		public double convertirAFahrenheit (double gradosCelsius) throws TempValueException{

			if (gradosCelsius <= -273) {
				throw new TempValueException();
			}

			return (gradosCelsius * (9/5)) + 32;

		}

		public double convertirACelsius (double gradosFahrenheit) throws TempValueException {

			double gradosCelsius;

			gradosCelsius = (gradosFahrenheit - 32) * 5/9;

			if (gradosCelsius <= -273) {
				throw new TempValueException();
			}

			return gradosCelsius;
		}
}

//NumberFormatException con la clase Leer.
//InputMisMatchException, NoSuchElementException, y otra saltaría con la clase Scanner.