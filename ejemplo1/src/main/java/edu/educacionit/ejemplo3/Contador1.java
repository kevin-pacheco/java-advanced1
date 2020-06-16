package edu.educacionit.ejemplo3;

public class Contador1 {
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
