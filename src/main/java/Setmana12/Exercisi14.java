/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setmana12;

/**
 *
 * @author ruben
 */
public class Exercisi14 {

    //Definimos constantes
    public static final int CAMPOS = 4;
    public static final int HOMBRES = 0;
    public static final int MUJERES = 1;

    public static void main(String[] args) {

        //Inicializamos variables
        int tiempoMinimoHombres = 0;
        int tiempoMinimoMujeres = 0;
        int ganador = 0, ganadora = 0;

        int[][] participantes = {
            {3457, 1, 51, 52},
            {3467, 1, 32, 41},
            {3568, 0, 14, 57},
            {3570, 0, 12, 63},
            {3571, 1, 45, 63},
            {3572, 0, 17, 46},
            {3573, 0, 12, 44},
            {3574, 0, 30, 42},
            {3575, 1, 24, 77},
            {3576, 0, 57, 48}
        };

        //Mostrem llistat
        System.out.println("Listado de participantes: ");
        for (int i = 0; i < participantes.length; i++) {
            if (participantes[i][1] == HOMBRES) {
                if (tiempoMinimoHombres == 0) {
                    tiempoMinimoHombres = participantes[i][3];
                    ganador = i;
                } else {
                    if (participantes[i][3] < tiempoMinimoHombres) {
                        tiempoMinimoHombres = participantes[i][3];
                        ganador = i;
                    }
                }
            } else { // comenzamos con corredoras
                if (tiempoMinimoMujeres == 0) {
                    tiempoMinimoMujeres = participantes[i][3];
                    ganadora = i;
                } else {
                    if (participantes[i][3] < tiempoMinimoMujeres) {
                        tiempoMinimoMujeres = participantes[i][3];
                        ganadora = i;
                    }
                }
            }

        }
        System.out.println("Ganador: " + participantes[ganador][0] + "" + participantes[ganador][1] + "" + participantes[ganador][2] + " " + participantes[ganador][3]);
        System.out.println("Ganadora: " + participantes[ganadora][0] + " " + participantes[ganadora][1] + " " + participantes[ganadora][2] + " " + participantes[ganadora][3]);
    }
}
