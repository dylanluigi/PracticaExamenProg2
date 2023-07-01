package Examen_Extraordinaria.Exc3;

public class Menu {

    private DIES dia;
    public Menu(DIES dia){
        this.dia = dia;
    }
    public int getValue(){
        return switch (dia) {
            case DILLUNS -> 1;
            case DIMARTS -> 2;
            case DIMECRES -> 3;
            case DIJOUS -> 4;
            case DIVENDRES -> 5;
            case DISSABTE -> 6;
            case DIUMENGE -> 7;
        };
    }

    @Override
    public String toString() {
        return "Menu{" +
                "dia=" + dia +
                '}';
    }

    public DIES getDay(){
        return this.dia;
    }
}
