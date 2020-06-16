package edu.educacionit.ejemplo4;

public class Init {
    public static void main(String[] args) {
        System.out.println("Primer thread en java");
        Contador1 contador = new Contador1();
        new Thread(()->{ contador.generar(); }).start();
        new Thread(()->{ contador.generar(); }).start();
    }
}
