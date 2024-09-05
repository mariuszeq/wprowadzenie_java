import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int wylosowana = (int)(Math.random()*10+1);
        System.out.println(wylosowana);

                /*
                typy proste z malej litery maja tylko wartosci
                logiczny : boolean
                calkowite : byte, short, int, long
                rzeczywiste : float, double
                znakowy : char

                typy zlozone zawsze pisane wielka litera
                obiekty ktore maja wlasnosci i metody
                 */
        System.out.println("zgadnij liczbe z zakresu 1-10");
        Scanner klawiatura = new Scanner(System.in);
        int wpisanaLiczba = klawiatura.nextInt();
        System.out.println("Wpisano z klawiatury" + wpisanaLiczba);
        if (wpisanaLiczba == wylosowana) {
            System.out.println("Trafiona liczba");
        }else {
            System.out.println("nie trafiono, sproboj ponownie");
        }

        String komunikat = wylosowana == wpisanaLiczba ? "Poprawnie" : "Nie poprawnie"; // wyrazenie warunkowe if
        System.out.println(komunikat);
    }
}