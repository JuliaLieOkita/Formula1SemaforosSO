package view;

import java.util.concurrent.Semaphore;

import controller.ThreadFormula1;

public class Main {

	public static void main(String[] args) {
		
		int permissoes = 5;
		Semaphore semaforo = new Semaphore(permissoes);
		
		for (int escuderia = 1; escuderia < 8; escuderia++) {
			Thread tFormula1 = new ThreadFormula1(escuderia, semaforo);
			tFormula1.start();
		}

	}

}