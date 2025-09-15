package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Restaurante tradion antigua");
        System.out.println("****************************");

        String verde="\u001B[32m";
        System.out.println(verde+"Menu del dia:");
        System.out.println("1. Entradas🍟:");
        System.out.println("*** Empanadas de iglesia ----> $10000");
        System.out.println("*** Picada antioqueña (morcilla, chorizo, patacon ----> $33000");
        System.out.println("*** Arepa de mote con quesito ----> $15000");
        System.out.println("*** Salchipapa paisa (papa criolla, papa capira, chicharron, salchicha ranchera, queso ----> $35000");

        String azul="\u001B[34m";
        System.out.println(azul+"2. sobremesa🍹:");
        System.out.println("*** Aguapanela con limon ----> $6000");
        System.out.println("*** Chocolate migao ----> $12500");
        System.out.println("*** Shot de tapa roja ----> $8000");
        System.out.println("*** Shot de tapa azul ----> $11000");
        System.out.println("*** Shot de taoa verde ----> $12000");
        System.out.println("*** Coctel cucaracho ----> $38500");
        System.out.println("*** Coctel BlodyMary ----> $40000");
        System.out.println("*** Cervene savugnon ----> $850000");

        String purpura="\u001B[35m";
        System.out.println(purpura+"3. Platos fuertes🍽:");
        System.out.println("*** Sancocho trifasico ----> $48000");
        System.out.println("*** Bandeja paisa ----> $62000");
        System.out.println("*** Mondongo de la abuela ----> $52000");
        System.out.println("*** Sopa del obispo ----> $40000");
        System.out.println("*** Sopa de la JUANFE ----> $42000");

        String rojo="\u001B[31m";
        System.out.println(rojo+"4. Postres🍨:");
        System.out.println("*** Arroz con leche ----> $19500");
        System.out.println("*** Brevas con arequipe y queso ----> $20000");
        System.out.println("*** Dulce de vitoria ----> $18000");

        //Creando un ciclo para seleccionar el pedido
        Scanner leerteclado= new Scanner(System.in);
        Integer opcionMenu = 0;
        while (opcionMenu !=5 ){
            System.out.println("Digita una opcion: ");
            opcionMenu=leerteclado.nextInt();

        }
    }
}