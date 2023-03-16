public class Haromszog {
    private int a;
    private int b;
    private int c;

    public Haromszog() {
    }

    public Haromszog(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void kiir() {
        if (ervenyes()) {
            System.out.println("A háromszög oldalai: A: " + a + ", B: " + b + ", C: " + c);
            System.out.println(" Kerülete: " + kerulet());
            System.out.println(" Területe: " + terulet());
        } else {
            System.out.println("Ezekből az adatokból nem szerkeszthető háromszög.");
        }
    }

    public boolean ervenyes() {

        if (a + b > c && b + c > a && a + c > b) {
            return true;
        } else {
            return false;
        }
    }

    public double kerulet() {
        if (ervenyes()) {
            return a + b + c;
        }
        return 0;
    }

    public double terulet() {
        double s = kerulet() / 2;
        if(ervenyes()) {
            return Math.sqrt((double) s * (s - a) * (s - b) * (s - c));
        }
        return 0;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
