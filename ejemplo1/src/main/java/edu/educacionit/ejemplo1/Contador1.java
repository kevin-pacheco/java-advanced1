package edu.educacionit.ejemplo1;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Contador1 extends Thread {
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
