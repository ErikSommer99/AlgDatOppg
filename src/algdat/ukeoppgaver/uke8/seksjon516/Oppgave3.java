package algdat.ukeoppgaver.uke8.seksjon516;

import algdat.datastrukturer.BinTre;
import algdat.datastrukturer.Oppgave;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] posisjon = {1,2,3,4,5,6,7,10,11,13,14,22,23,28,29};
        String[] verdi = "EIBGAHKLODNMCJF".split("");
        BinTre<String> tre = new BinTre<>(posisjon, verdi);
        tre.nivaOrden(Oppgave.konsollutskrift());
    }
}
