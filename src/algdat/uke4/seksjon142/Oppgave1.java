package algdat.uke4.seksjon142;

import algdat.Tabell;

public class Oppgave1 {
    public static void main(String[] args) {
        String[] s = {"Sohil","Per","Thanh","Fatima","Kari","Jasmin"};
        int k = Tabell.maks(s); // hvilken maks-metode? Svar: Metode med String som parameter.
        System.out.println(s[k]);
    }
}