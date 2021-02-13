public class Main {

    public static void main(String[] args) {
        Polynomial f = new Polynomial(new double[]{1,0,0}, "f");
        System.out.println(f.toString());
        //System.out.println(f.valueOf(-1));
        System.out.println(f.integrate(0.0).toString());
    }

}
