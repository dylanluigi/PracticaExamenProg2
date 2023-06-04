package NumerosReales;

import java.io.*;


/**
 * Un programa que llegeix valors des d'un fitxer de text, els
 * valors es suposa que són de tipus real. Cada tres valors considera que és una
 * equació de segon grau, la resol i el resultat l'escriu a un altre fitxer. Es
 * suposa que al fitxer origen no hi ha errors i es pot llegir sense cap problema.
 */
public class Professor {

    // Per poder llegir el nom dels fitxers des del teclat és necessari utilitzar
    // un BufferedReader.
    public static BufferedReader entradaTeclat;

    // Subprograma que llegeix el nom d'un fitxer.
    public static String llegirNomFitxer(String missatge) throws Exception {
        System.out.print(missatge);
        return entradaTeclat.readLine();
    }
    /* Suprograma que resol una equació de segon grau rep com a paràmetre
     * el valor dels tres coeficients de l'equació, ax^2 + bx + c = 0, i un
     * PrintWriter on haurà d'escriure les solucions de l'equació.
     */
    public static  void resoldreEquacio(double a, double b, double c, PrintStream out) {
        double discriminant;
        double component1, component2;
        boolean solComplexa;

        // Càlculs

        if (a == 0.0) {
            // Es tracta d'una equació de primer grau
            if (b == 0.0) {
                out.println("NO HAS INTRODUIT CAP EQUACIO");
            } else {
                out.println("La solucio de l'equacio de primer grau " +
                        b + " x + " + c + " = 0 és " + (-c / b));
            }
        } else {
            // És realment una equació de segon grau
            discriminant = b * b - 4.0 * a * c;

            solComplexa = discriminant < 0.0;
            if (solComplexa) {
                discriminant = -discriminant;
            }
            discriminant = Math.sqrt(discriminant);

            out.print("Les solucions de l'equacio de segon grau " +
                    a + " x^2 + " + b + " x + " + c + " = 0 ");

            component1 = -b / (2.0 * a);
            component2 = discriminant / (2.0 * a);

            if (solComplexa) {
                out.println("son complexes!!");

                out.println("\tSolucio 1: " + component1 + " + " + component2 + " i ");
                out.println("\tSolucio 2: " + component1 + " - " + component2 + " i ");
            } else {
                out.println("son reals!!");

                out.println("\tSolucio 1: " + (component1 + component2));
                out.println("\tSolucio 2: " + (component1 - component2));
            }
        }
    }

    // Presentació, descriu la funcionalitat del programa.
    public static void presentacio() {

        // Presentació i lectura dels valors de l'equació
        System.out.println("Equation solver v1.0");
        System.out.println("====================\n");
        System.out.println("Aquest programa és capaç de resoldre equacions de" +
                " segon grau, de la forma ax^2 + bx + c = 0\n\n" +
                "Les equacions es llegeixen des d'un fitxer de text on hi ha" +
                " escrits el terme de segon grau, el de primer grau i el terme" +
                " independent, en aquest ordre. Pot haver-hi més d'una equació" +
                " al mateix fitxer.\n" +
                "Els resultats s'emmagatzemen en un altre fitxer de text\n\n" +
                "Primerament has d'indicar els noms dels fitxers\n\n");

    }

    // Programa principal
    public static void main(String[] args) {
        try {
            // Declaració de variables
            double a, b, c; // Per emmagatzemar els coeficients
            String valorStr; // per llegir els valors

            String nomFitxerEntrada, // Nom del fitxer d'entrada.
                    nomFitxerSortida; // Nom del fitxer de sortida.

            FileInputStream entrada; // Fitxer d'entrada
            FileOutputStream sortida;// Fitxer de sortida.

            BufferedReader in;       // Per llegir amb facilitat els valors
            // reals des del fitxer d'entrada.
            PrintStream out;         // Per escriure amb facilitat els valors
            // al fitxer de sortida.

            presentacio();

            // Inicialitzacio
            // Per poder llegir fàcilment del teclat el nom dels fitxers
            entradaTeclat = new BufferedReader(new InputStreamReader(System.in));

            // Llegir el noms dels fitxers origen i destí
            System.out.print("\n\nIntrodueix els noms dels fitxer:");
            nomFitxerEntrada = llegirNomFitxer("Indica el fitxer origen::> ");
            nomFitxerSortida = llegirNomFitxer("Indica el fitxer destí::> ");
            // Preparar-se per llegir del fitxer d'entrada.
            entrada = new FileInputStream(nomFitxerEntrada);
            in = new BufferedReader(new InputStreamReader(entrada));

            // Preparar-se per escriure al fitxer de sortida.
            sortida = new FileOutputStream(nomFitxerSortida);
            out = new PrintStream(sortida);

            // Tractament seqüencial, llegir tres valors numèrics i
            // resoldre la corresponent equació de segon grau.
            do {
                valorStr = in.readLine();
                // Si aconsegueix llegir significa que hi ha tres valors
                // disponibles, llegir-los i resoldre l'equació.
                if (valorStr != null) {
                    a = Double.parseDouble(valorStr);

                    b = Double.parseDouble(in.readLine());

                    c = Double.parseDouble(in.readLine());

                    resoldreEquacio(a, b, c, out);
                }
            } while (valorStr != null);

            out.println("\nFins una altre ocasio");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
