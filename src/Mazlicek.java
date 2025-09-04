import java.util.Scanner;

public class Mazlicek {
    private String jmeno;
    private String druh;
    private int vek;
    private double vaha;

    static Scanner in = new Scanner(System.in);

    Mazlicek() {
        System.out.println("Jmeno mazlíčka:");
        jmeno = in.next();
        System.out.println("Druh mazlíčka:");
        druh = in.next();
        System.out.println("Věk mazlíčka:");
        vek = in.nextInt();
        in.nextLine();
        System.out.println("Váha mazlíčka:");
        vaha = in.nextDouble();
        in.nextLine();
    }

    public String getJmeno() {
        return jmeno;
    }

    public String getDruh() {
        return druh;
    }

    public int getVek() {
        return vek;
    }

    public double getVaha() {
        return vaha;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setDruh(String druh) {
        this.druh = druh;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    public void setVaha(double vaha) {
        this.vaha = vaha;
    }

    public void tortString() {
        System.out.println("Jmeno: " + jmeno + ", " + "Druh: " + druh + ", " + "Věk: " + vek + ", " + "Váha: " + vaha + " kg");
    }
}
