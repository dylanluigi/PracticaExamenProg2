package Examen_Extraordinaria.Exc1;

/**
 * Classe que representa una matriu quadrada d'enters.
 */
public class Matriu {

    private int[][] matriu;
    private int dimensio;
    private int n;
    private int filaIndex;
    private int columnaIndex;

    /**
     * Excepció llançada quan s'intenta afegir un element a una matriu completa.
     */
    public static class MatriuCompleta extends Exception{
        public MatriuCompleta(){super("Matriz completa.");}
    }

    /**
     * Crea una nova matriu amb la dimensió especificada.
     *
     * @param n la dimensió de la matriu
     */
    public Matriu(int n){
        dimensio = n;
        this.n = n;
        matriu = new int[this.n][this.n];
        filaIndex = 0;
        columnaIndex = 0;
    }

    /**
     * Afegeix un valor a la matriu.
     *
     * @param value el valor per afegir a la matriu
     * @throws MatriuCompleta si la matriu està completa i no es pot afegir cap valor més
     */
    public void add(int value) throws MatriuCompleta {
        if (filaIndex >= this.n) {
            throw new MatriuCompleta();
        }
        this.matriu[filaIndex][columnaIndex] = value;
        columnaIndex++;
        if (columnaIndex == this.n) {
            filaIndex++;
            columnaIndex = 0;
        }
    }

    /**
     * Crea una submatriu eliminant la fila i la columna especificades.
     *
     * @param filaEliminar la fila per eliminar de la matriu
     * @param columnaEliminar la columna per eliminar de la matriu
     * @return una nova matriu que és una submatriu de la matriu original
     */
    public Matriu obtenirSubmatriu(int filaEliminar, int columnaEliminar){
        Matriu submatriu = new Matriu(dimensio-1);

        for(int i = 0; i < this.n; i++) {
            if(i == filaEliminar)
                continue;

            for(int j = 0; j < this.n; j++) {
                if(j == columnaEliminar)
                    continue;

                try {
                    submatriu.add(this.matriu[i][j]);
                } catch (MatriuCompleta e) {
                    e.printStackTrace();
                }
            }
        }
        return submatriu;
    }

    /**
     * Calcula el determinant de la matriu.
     *
     * @return el determinant de la matriu
     */
    public int calcularDeterminant() {
        if (dimensio == 2) {
            return matriu[0][0] * matriu[1][1] - matriu[0][1] * matriu[1][0];
        }
        int result = 0;
        for (int i = 0; i < dimensio; i++) {
            Matriu submatriu = obtenirSubmatriu(0, i);
            if (i % 2 == 0) {
                result += matriu[0][i] * submatriu.calcularDeterminant();
            } else {
                result -= matriu[0][i] * submatriu.calcularDeterminant();
            }
        }
        return result;
    }

    /**
     * Retorna una representació en cadena de la matriu.
     *
     * @return una cadena que representa la matriu
     */
    @Override
    public String toString(){
        StringBuilder s = new StringBuilder();
        for(int i = 0; i < this.n; i++){
            for(int j = 0; j < this.n; j++){
                s.append(this.matriu[i][j]).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
