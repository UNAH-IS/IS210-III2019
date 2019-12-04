package clases;

import interfaces.Humano;
import interfaces.SerSobrenatural;

public class Ingeniero extends Trabajador implements Humano, SerSobrenatural{

	@Override
	public void nacer() {
		System.out.println("Naciendo");		
	}

	@Override
	public void vivir() {
		System.out.println("Viviendo");
	}

	@Override
	public void reproducir() {
		System.out.println("Poco probable");
	}

	@Override
	public void morir() {
		System.out.println("Haciendo la murision");		
	}

	@Override
	public void caminar() {
		System.out.println("Caminando");		
	}

	@Override
	public void saltar() {
		System.out.println("Saltando");		
	}

	@Override
	public void superPoderes() {
		// TODO Auto-generated method stub
		
	}

}
