/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setmana13;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author ruben
 */
public class Exercisi15 {

    public static final int HALF_LEN = 4;
    public static final int MAX_VAL = 10;

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        String passwd = "";
        String[] dadesUsuari;
        Random rand = new Random();

        System.out.println("Escriu els teus nom i cognoms i pitja retorn: ");
        String text = lector.nextLine();
        //Create an array from data entered.
        //Creem un array amb nom i cognom.
        dadesUsuari = text.split(" ");

        //Build first part of the passwd.
        //Construeix la primera part de la contrasenya.
        for (int i = 0; i < HALF_LEN / 2; i++) {
            passwd += (dadesUsuari[0].charAt(i));
            passwd += (dadesUsuari[1].charAt(i));
        }

        //Add random numbers.
        //Afegeix 4 digits més: números generats aleatoriament.
        for (int  = 0; i < HALF_LEN;i++){
            passwd += rand.nextInt(MAX_VAL);
        }
        System.out.println("Contrasenya és: " + passwd);
    }

}
