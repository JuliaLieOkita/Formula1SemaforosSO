package controller;

import java.util.concurrent.Semaphore;

public class ThreadFormula1 extends Thread {

	private int idCarro;
	// private int i = 7;
	private int j = 14;
	private int escuderia;
	private int carro[] = new int[j];
	private Semaphore semaforo;

	public ThreadFormula1(int escuderia, Semaphore semaforo) {
		this.escuderia = escuderia;
		this.semaforo = semaforo;
	}

	@Override
	public void run() {
		for (idCarro = 1; idCarro < 3; idCarro++) {
			try {
				semaforo.acquire();
				corrida();
			} catch (InterruptedException e) {
				e.printStackTrace();
			} finally {
				semaforo.release();
			}
		}
	}

	private void corrida() {
		System.out.println("O carro #" + idCarro + " da escuderia #" + escuderia + " "
				+ "entrou na corrida!");

	}

}