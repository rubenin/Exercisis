/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setmana11;

/**
 *
 * @author ruben
 */
public class Exercisi13_B {

    private static final float APROVAT = 5;

    public static void main(String[] args) {
        //Inicialitzem variables
        int numSuspes = 0;
        //Introduim el array amb les notes
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f};
        for (int i = 0; i < arrayNotes.length; i++) {
            System.out.println(i + ". és: " + arrayNotes[i]);
            if (arrayNotes[i] < APROVAT) {
                numSuspes++;
            }
        }
        System.out.println("El numero de sospesos es: " + numSuspes);
    }
}
