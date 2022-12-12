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
        String password = "";
        String[] datosUsuario;
        Random rand = new Random();

        System.out.println("Introduce nombre y apellidos: ");
        String text = lector.nextLine();

        datosUsuario = text.split(" ");

        for (int i = 0; i < HALF_LEN / 2; i++) {
            password += (datosUsuario[0].charAt(i));
            password += (datosUsuario[1].charAt(i));
        }

        for (int i = 0; i < HALF_LEN; i++) {
            password += rand.nextInt(MAX_VAL);
        }
        System.out.println("El password es: " + password);
    }

}
