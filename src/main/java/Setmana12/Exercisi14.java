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

    public static final int NUM_CAMPS = 4; //4 Camps: dorsal, sexe, edat i temps
    public static final int HOME = 0;
    public static final int DONA = 1;

    public static void main(String[] args) {

        //Definim tipus de dades
        int minTempsHome = 0;
        int minTempsDona = 0;
        int posGuanyador = 0, posGuanyadora = 0;

        int[][] corredors = {
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
        };//Conté dorsal, sexe, edat i temps fet) 

        //Mostrem llistat
        System.out.println("Llistat de tots els corredors entrats: ");
        for (int i = 0; i < corredors.length; i++) {
            if (corredors[i][1] == HOME) {
                if (minTempsHome == 0) { // per la primera vegada, assignem el 
                    //primer valor de temps d`home
                    minTempsHome = corredors[i][3];
                    posGuanyador = i;
                } else {
                    if (corredors[i][3] < minTempsHome) {
                        minTempsHome = corredors[i][3];
                        posGuanyador = i;
                    }
                }
            } else { // Per a corredores dones
                if (minTempsDona == 0) {//per la primera vegada, 
                    //assignem el primer valor de temps d`home
                    minTempsDona = corredors[i][3];
                    posGuanyadora = i;
                } else {
                    if (corredors[i][3] < minTempsDona) {
                        minTempsDona = corredors[i][3];
                        posGuanyadora = i;
                    }
                }
            }

        }
        System.out.println("Guanyador: " + corredors[posGuanyador][0] + "" + corredors[posGuanyador][1] + "" + corredors[posGuanyador][2] + " " + corredors[posGuanyador][3]);
        System.out.println("Guanyadora: " + corredors[posGuanyadora][0] + " " + corredors[posGuanyadora][1] + " " + corredors[posGuanyadora][2] + " " + corredors[posGuanyadora][3]);
    }
}
