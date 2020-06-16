package edu.educacionit.ejemplo4;

public class Contador1 {
    private int x = 1;
    public void generar() {
        for (; x < 10; x++) {
            try {
                // System.out.print(Thread.currentThread().getId());
                // System.out.print("> ");
                System.out.println(x);
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                System.out.println("Thread interrumpido");
            }
        }
    }
}
