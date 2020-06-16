package edu.educacionit.ejemplo1;

public class Init {
    public static void main(String[] args) {
        System.out.println("Primer thread en java");
        new Contador1().start();
        System.out.println("Termino contador 1 generar");
    }
}
