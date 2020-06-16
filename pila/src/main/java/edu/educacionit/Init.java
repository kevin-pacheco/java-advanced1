package edu.educacionit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Init {
    public static void main(String[] args) {
        System.out.println("Manejo de errores en java");
        try {
            new Pila().m1(10000);
        }
        catch (Exception ex) {
            System.out.println("La transaccion no pudo se realizada");
        }
    }
}
