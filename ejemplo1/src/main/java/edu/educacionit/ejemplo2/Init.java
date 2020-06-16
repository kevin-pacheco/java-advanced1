package edu.educacionit.ejemplo2;

public class Init {
    public static void main(String[] args) {
        System.out.println("Primer thread en java");
        Thread t = new Thread(new Contador1());
        t.start();
        System.out.println("Termino contador 1 generar");
    }
}
