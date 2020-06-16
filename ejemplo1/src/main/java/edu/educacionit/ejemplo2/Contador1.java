package edu.educacionit.ejemplo2;

public class Contador1 implements Runnable {
    @Override
    public void run() {
        generar();
    }
    public void generar() {
        for (int x = 1; x < 10; x++) {
            try {
                System.out.println(x);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Thread interrumpido");
            }
        }
    }
}
