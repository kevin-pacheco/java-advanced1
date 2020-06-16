package edu.educacionit.ejemplo3;

public class Init {
    public static void main(String[] args) {
        System.out.println("Primer thread en java");
        new Thread(()->{ new Contador1().generar(); }).start();
        System.out.println("Termino contador 1 generar");
    }
}
