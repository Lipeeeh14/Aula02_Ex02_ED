package controller;

public class ApareceNumeroController {

	public ApareceNumeroController() {}
	
	public int QuantidadeApareceNumero(int numero, int numeroAparece) {
		if (numero == 0)
			return 0;
		else {
			if (numero % 10 == numeroAparece)
				return 1 + QuantidadeApareceNumero(numero / 10, numeroAparece);
			else
				return QuantidadeApareceNumero(numero / 10, numeroAparece);
		}
	}

}
