/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setmana10;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Exercisi12 {

    public static void main(String[] args) {

        //Definimos datos
        int numUsuarios = 0;
        Scanner scan = new Scanner(System.in);
        boolean correcto;
        int[] id;
        int idAux;

        //Introducimos el número de usuarios
        System.out.print("Quantes persones vols entrar: ");
        correcto = scan.hasNextInt();//per analitzar tipus de dada 
        if (correcto) { // si és un número sencer 
            numUsuarios = scan.nextInt();
            scan.nextLine();
        }
        
        id = new int[numUsuarios];

        //Leemos usuarios
        for (int i = 0; i < numUsuarios; i++) {
            System.out.print("Entra el codi de l'usuari: ");
            id[i] = scan.nextInt();
        }
        //Mostramos los usuarios introducios
        System.out.println("\nLlistat de tots els codis entrats:");
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println(id[i]);
        }
        //Ordenamos el listado
        for (int i = 0; i < id.length - 1; i++) {
            
            for (int j = i + 1; j < id.length; j++) {
                
                if (id[i] > id[j]) { 
                    idAux = id[i];
                    id[i] = id[j];
                    id[j] = idAux;
                }
            }
        }
        //Mostramos listado final
        System.out.println("\nLlistat de los usuarios:");
        for (int i = 0; i < numUsuarios; i++) {
            System.out.println(id[i]);

        }

    }
}
