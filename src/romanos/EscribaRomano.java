package romanos;

public class EscribaRomano {

	public String copiar(int numero) {

		String romano = "";
		
		if (numero >= 30) {
		
			romano = concatenar("X", numero / 10);
			
		} else if (numero >= 5) {
			
			romano = "V" + concatenar("I", numero - 5);
			
		} else if (numero == 4) {
			
			romano = "IV";
		
		} else {

			romano = concatenar("I", numero);
		}

		return romano;
	}
	
	private String concatenar(String simbolo, int cantidad) {
		
		String cadena = "";
		
		for (int i = 0; i < cantidad; i++) {
			
			cadena = cadena + simbolo;
		}
		
		return cadena;
	}
}
