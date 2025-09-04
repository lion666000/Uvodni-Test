import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Mazlicek> mazlicci = new ArrayList<Mazlicek>();

        for (int i = 0; i < 10; i--) {
            System.out.println("1 - Přidat mazlíčka");
            System.out.println("2 - Výpisy");
            int x = sc.nextInt();
            sc.nextLine();

            switch (x) {
                case 1:
                    mazlicci.add(new Mazlicek());
                    break;
                case 2:
                    System.out.println("1 - Vypsat všechny mazlíčky");
                    System.out.println("2 - Vypsat průměr věku mazlíčků");
                    System.out.println("3 - Vypsat průměr váhy mazlíčků");

                    int y = sc.nextInt();
                    sc.nextLine();

                    switch (y) {
                        case 1:
                            for (Mazlicek m : mazlicci) {
                                m.tortString();
                            }
                            break;
                        case 2:
                            SpravaMazlicku mlem = new SpravaMazlicku();
                            mlem.vypocetPrumernehoVeku(mazlicci);
                            break;
                        case 3:
                            SpravaMazlicku mlem2 = new SpravaMazlicku();
                            mlem2.vypocetPrumerneVahy(mazlicci);
                            break;
                    }
                    break;
            }
        }


    }
}