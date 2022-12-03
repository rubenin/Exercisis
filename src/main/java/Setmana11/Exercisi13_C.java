/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Setmana11;

/**
 *
 * @author ruben
 */
public class Exercisi13_C {
    
    private static final float APROVAT = 5;
    private static final float EXELENT = 9;
    private static final float MIN_NOTA = 0;
    private static final float MAX_NOTA = 10;
    
    public static void main (String[] args){
        //Inicialitzem variables
        int suspes = 0;
        float sumaNota = 0;
        float mitjaNota = 0;
        float maxNota = 0;
        float minNota = 0;
        
        //començem amb el array
        float[] arrayNotes = {2f, 5.5f, 9f, 10f, 4.9f, 8f, 8.5f, 7f};
        for(int i=0; i<arrayNotes.length; i++){
            System.out.println(i+". és: "+arrayNotes[i]);
            if(arrayNotes[i]<APROVAT){
                suspes++;
            }
            //calculem la nota maxima
            if (arrayNotes[i]>MAX_NOTA){
                maxNota = arrayNotes[i];
            }
            System.out.println("La nota maxima es: "+maxNota);
            //Calculem la nota minima
            if (arrayNotes[i]<MIN_NOTA){
                minNota = arrayNotes[i];
            }
            //sumem totes les notes
            sumaNota = sumaNota+arrayNotes[i];
        }
        //fem la nota mitja
        mitjaNota = sumaNota/8;
        //mostrem resultats
        System.out.println("La nota maxima es: "+maxNota);
        System.out.println("La nota minima es: "+minNota);
        System.out.println("La nota mitjana es: "+mitjaNota);
        System.out.println("El num de suspes es: "+suspes);
        
        for (int i = 0; i < arrayNotes.length; i++){
            if (arrayNotes[i]>=EXELENT){
                System.out.println("La nota maxima "+arrayNotes[i]+ " al puesto "+i);
            }
        }
    }
}
