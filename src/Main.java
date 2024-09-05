import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        int wylosowana = (int) (Math.random() * 100 + 1);
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
        } else {
            System.out.println("nie trafiono, sproboj ponownie");
        }

        String komunikat = wylosowana == wpisanaLiczba ? "Poprawnie" : "Nie poprawnie"; // wyrazenie warunkowe if
        System.out.println(komunikat);

        int roznica = wylosowana > wpisanaLiczba ? wylosowana - wpisanaLiczba : wpisanaLiczba - wylosowana;
        roznica = roznica / 10;  // dzielenie calkowite poniewaz wynik typu int
        switch (roznica) {
            case 0:
                System.out.println("brawo");
                break;
            case 1:
                System.out.println("bardzo blisko");
                break;
            case 2:
                System.out.println("dosc blisko");
                break;
            case 3:
                System.out.println("sprobuj szczescia innym razem");
        }
        // wyrazenie switch
        System.out.println(
                switch (roznica) {
                    case 0 -> "brawo";
                    case 1 -> "bardzo blisko";
                    case 2 -> "dosc blisko";
                    default -> "slabo";
                }
        );
        for (int i = 0; i < 10; i++) {
            System.out.println("zgadnij liczbe, proba numer" + i + 1);
            wpisanaLiczba = klawiatura.nextInt();
            if (wpisanaLiczba == wylosowana) {
                System.out.println("wygrana");
                break;
            } else {
                if (wpisanaLiczba > wylosowana) {
                    System.out.println("wpisano za duzo");
                } else {
                    System.out.println("wpisano za malo");
                }
            }
        }
        System.out.println("zgadnij liczbe");
        wpisanaLiczba = klawiatura.nextInt();
        while (wpisanaLiczba != wylosowana) {
            if (wpisanaLiczba == wylosowana) {
                System.out.println("wygrana");
                break;
            } else {
                if (wpisanaLiczba > wylosowana) {
                    System.out.println("wpisano za duzo");
                } else {
                    System.out.println("wpisano za malo");
                }
                System.out.println("zgadnij liczbe");
                wpisanaLiczba = klawiatura.nextInt();
            }
        }
    }
}