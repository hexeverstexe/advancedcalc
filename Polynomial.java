public class Polynomial {
    private String name;
    private double[] coefficients;


    //The polynomial gets initialized by interpreting the Array as an ordered list of all coefficients
    public Polynomial(double[] coefficients, String name) {
        this.coefficients = coefficients;
        this.name = name;
    }

    //determines the value of a the function at the given point x
    public double valueOf(double x){
        int res = 0;

        for(int i = 0; i < coefficients.length; i++){
            res += coefficients[(coefficients.length-1-i)] * Math.pow(x, i);
        }
        return res;
    }

    public Polynomial integrate(){
        double newCoefficient[] = new double[coefficients.length-1];
        for (int i = coefficients.length-1; i > 1 ; i--) {
            newCoefficient[i-1] = i*coefficients[i];
        }
        return new Polynomial(newCoefficient, name + "'");
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(name + "(x) = ");
        for (int i = 0; i < coefficients.length-1; i++) {
            builder.append(coefficients[i]);
            builder.append("*x^");
            builder.append(coefficients.length - 1 - i);
            builder.append(" + ");
        }
        builder.append(coefficients[0]);
        return builder.toString();
    }
    public int degree(){
        return coefficients.length-1;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getCoefficients() {
        return coefficients;
    }

    public void setCoefficients(double[] coefficients) {
        this.coefficients = coefficients;
    }
}
