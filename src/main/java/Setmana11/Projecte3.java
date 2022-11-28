package Setmana11;

import java.util.Scanner;

/**
 *
 * @author ruben
 */
public class Projecte3 {

    //Definim totes les constants
    public static final int MINIM_ID = 111;
    public static final int MAXIM_ID = 999;
    public static final int MINIM_EDAT = 14;
    public static final int MAXIM_EDAT = 120;
    public static final int MINIM_TIPUS = 0;
    public static final int MAXIM_TIPUS = 3;
    public static final int MINIM_IMPORT = 0;
    public static final int MAXIM_IMPORT = 1000;
    public static final int MINIM_TELEFON = 111111111;
    public static final int MAXIM_TELEFON = 999999999;
    public static final int LLI = 0;
    public static final int PEN = 1;
    public static final int JOV = 2;
    public static final int SOC = 3;
    public static final String LLI_NOM = "Venta LLiure";
    public static final String PEN_NOM = "Pensionista";
    public static final String JOV_NOM = "Carnet Jove";
    public static final String SOC_NOM = "Soci";
    public static final int MAX_INTENTS = 3;

    public static final int MAX_REGISTRES = 6;

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        //Definim variables
        int id[] = new int[MAX_REGISTRES];
        int edat[] = new int[MAX_REGISTRES];
        int tipus[] = new int[MAX_REGISTRES];
        int importe[] = new int[MAX_REGISTRES];
        int telefon[] = new int[MAX_REGISTRES];
        int intents = 0;
        int i = 0;
        int j = 0;
        int icanvi;
        int clientsEntrats[] = new int[MAX_REGISTRES];
        int seguir = 0;
        String tipusVenda[] = new String[MAX_REGISTRES];
        Scanner scan = new Scanner(System.in);
        boolean dadaCorrecta = true, introduirMes;

        do {
            introduirMes = false;
            do {
                //Comencem demanant l'id
                System.out.print("Entra el ID: ");
                dadaCorrecta = scan.hasNextInt(); //per analitzar tipus de dada
                if (dadaCorrecta) { //si es un número sencer
                    //LLegim dades
                    id[i] = scan.nextInt();
                    //Avaluem si és válida
                    if ((id[i] < MINIM_ID) || (id[i] > MAXIM_ID)) {
                        dadaCorrecta = false;
                    }
                }
                intents++;
            } while ((!dadaCorrecta) && (intents < MAX_INTENTS));

            if (dadaCorrecta) {
                intents = 0;//Inicialitzem comptador

                do {
                    //Pedim edat, llegim i mirem si és correcta
                    System.out.print("Entra la edat: ");
                    dadaCorrecta = scan.hasNextInt();

                    if (dadaCorrecta) {
                        //Llegim dades
                        edat[i] = scan.nextInt();
                        //Avaluem si és válida
                        if ((edat[i] < MINIM_EDAT) || (edat[i] > MAXIM_EDAT)) {
                            dadaCorrecta = false;
                        }
                    }
                    intents++;
                } while ((!dadaCorrecta) && (intents < MAX_INTENTS));
            }
            if (dadaCorrecta) {
                intents = 0; // Inicialitzem el comptador
                do {

                    //Entrem tipus de venda
                    System.out.print("\tVenda lliure (0)\n"
                            + "\tPensionista (1)\n"
                            + "\tCarnet jove (2)\n"
                            + "\tSoci (3)\n\n"
                            + "Entra el tipus de venda:");
                    dadaCorrecta = scan.hasNextInt();
                    if (dadaCorrecta) {
                        tipus[i] = scan.nextInt();
                        if ((tipus[i] < MINIM_TIPUS) || (tipus[i] > MAXIM_TIPUS)) {
                            dadaCorrecta = false;
                        }
                    }
                    intents++;
                } while ((!dadaCorrecta) && (intents < MAX_INTENTS));
            }
            if (dadaCorrecta) {//Si fins al moment tot es correcte, pedim l'import
                intents = 0;
                do {
                    System.out.print("Entra l'import: ");
                    dadaCorrecta = scan.hasNextInt();
                    if (dadaCorrecta) {//si es un número real  
                        importe[i] = scan.nextInt();
                        if ((importe[i] < MINIM_IMPORT) || (importe[i] > MAXIM_IMPORT)) {
                            dadaCorrecta = false;
                        }
                    }
                    intents++;
                } while ((!dadaCorrecta) && (intents < MAX_INTENTS));
            }
            if (dadaCorrecta) {
                intents = 0;
                //Llegim el telefon
                do {
                    System.out.print("Entra el telefon: ");
                    dadaCorrecta = scan.hasNextInt();
                    if (dadaCorrecta) {
                        telefon[i] = scan.nextInt();
                        if ((telefon[i] < MINIM_TELEFON) || (telefon[i] > MAXIM_TELEFON)) {
                            dadaCorrecta = false;
                        }
                    } else {
                        scan.next(); //buidem el buffer d'entrada per si entren
                        //incorrectament un valor amb decimals.
                    }
                    intents++;
                } while ((!dadaCorrecta) && (intents < MAX_INTENTS));
            }
            if (dadaCorrecta) {
                i++; //Índex. També ens indica el número de registres
            } else {
                System.out.println("Dades incorrectes");
            }
            if (i < MAX_REGISTRES) {
                //avaluem si vol introduir més alumnes
                System.out.println("es vol introduir més clients?");
                dadaCorrecta = scan.hasNextInt();
                if (dadaCorrecta) {//si és un número sencer
                    seguir = scan.nextInt();
                    if (seguir == 1) {
                        introduirMes = true;
                    }
                } else {
                    System.out.println("dadaIncorrecta");
                }
            }
        } while ((introduirMes) && (i < MAX_REGISTRES));
        /*Mostrem dades introduides des de 0 fins a i.
        i conté el nombre de registres.*/

        System.out.println("S'han inscrit " + i + "nous registres");
        System.out.println("ID \t\tEdat \t\tTipusdeVenda \t\tImport \t\tTelefon");
        for (j = 0; j < i; j++) {
            //Obtinc tipus de venda
            switch (tipus[j]) {
                case LLI:
                    tipusVenda[j] = LLI_NOM;
                    break;
                case PEN:
                    tipusVenda[j] = PEN_NOM;
                    break;
                case JOV:
                    tipusVenda[j] = JOV_NOM;
                    break;
                case SOC:
                    tipusVenda[j] = SOC_NOM;
                    break;
            }
            System.out.println(id[j] + "\t\t " + edat[j] + "\t\t " + tipusVenda[j] + "\t\t " + importe[j] + "\t\t " + telefon[j]);
        }

        //Endrecem
        //Avaluem si es vol endreçar
        System.out.println("vols mostrar les vendes endreçats per tipus de venda?");
        dadaCorrecta = scan.hasNextInt();
        if (seguir == 1) { //si volem endreçar
            //Ordenació -------
            for (int k = 0; k < i - 1; k++) {
                //Bucle intern
                //Se cerca entre la resta de posicions quin es él valor mes baix
                for (j = k + 1; j < i; j++) {
                    //La posició tractada té un valor més alt que el de la cerca.
                    //Els intercamviem.
                    if (tipus[k] > tipus[j]) {
                        //per intercanviar valors cal una variable auxiliar.
                        icanvi = tipus[k];
                        tipus[k] = tipus[j];
                        tipus[j] = icanvi;
                        //intercanviem resta de valors de la mateixa manera
                        //ID
                        icanvi = id[k];
                        id[k] = id[j];
                        id[j] = icanvi;
                        //edat
                        icanvi = edat[k];
                        edat[k] = edat[j];
                        edat[j] = icanvi;
                        //import
                        icanvi = importe[k];
                        importe[k] = importe[j];
                        importe[j] = icanvi;
                        //telefon
                        icanvi = telefon[k];
                        telefon[k] = telefon[j];
                        telefon[j] = icanvi;
                    }
                }

                //Fi ordenació ------------
                //Mostrem ordenats ----------------
                System.out.println("ID   EDAT    TIPUS DE VENDA  IMPORTE TELEFON");
                for (j = 0; j < i; j++) {
                    //Obtinc tipus de venda
                    switch (tipus[j]) {
                        case LLI:
                            tipusVenda[j] = LLI_NOM;
                            break;
                        case PEN:
                            tipusVenda[j] = PEN_NOM;
                            break;
                        case JOV:
                            tipusVenda[j] = JOV_NOM;
                            break;
                        case SOC:
                            tipusVenda[j] = SOC_NOM;
                            break;
                    }
                    System.out.println(id[j] + "\t " + edat[j] + "\t " + tipusVenda[j] + "\t " + importe[j] + "\t " + telefon[j]);
                }
                //Fi mostrar-------------

            }
        } else {
            System.out.println("ID  \tEDAT  \tTIPUS DE VENDA    \tIMPORT    \tTELEFON");
            for (int indice = 0; indice < tipus.length; indice++);
            System.out.println(id[j] + "\t " + edat[j] + "\t " + tipusVenda[j] + "\t " + importe[j] + "\t " + telefon[j]);
        }

    }
}
