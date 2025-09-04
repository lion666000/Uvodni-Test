import java.util.ArrayList;
import java.util.Scanner;

public class SpravaMazlicku {



    static Scanner sc = new Scanner(System.in);

    public void vypocetPrumernehoVeku(ArrayList<Mazlicek>mazlicci){
        int prumerVekStrt = 0;
        int prumerVekEnd;
        for (Mazlicek mazlicek : mazlicci){
            prumerVekStrt = prumerVekStrt + mazlicek.getVek();
        }
        prumerVekEnd = prumerVekStrt / mazlicci.size();
        System.out.println("Průměr věku mazlíčků je: " + prumerVekEnd);
    }

    public void vypocetPrumerneVahy(ArrayList<Mazlicek>mazlicci){
        int prumerVahaStrt = 0;
        int prumerVahaEnd;
        for (Mazlicek mazlicek : mazlicci){
            prumerVahaStrt = prumerVahaStrt + mazlicek.getVek();
        }
        prumerVahaEnd = prumerVahaStrt / mazlicci.size();
        System.out.println("Průměrná váha mazlíčků je: " + prumerVahaEnd + " kg");
    }

    public void hledaSeNemo(ArrayList<Mazlicek>mazlicci){
        System.out.println("Jméno mazlíčka:");
        String Nemo = sc.nextLine();


    }
}
