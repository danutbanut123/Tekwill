public class ComplexNumber {
    private final double re;
    private final double im;
    public ComplexNumber(double re, double im) {
        this.re = re;
        this.im = im;
    }
    public double getRe() {
        return re;
    }
    public double getIm() {
        return im;
    }
    @Override
    public boolean equals(Object other){
        return other.equals(re ) && other.equals(im);



    }
    @Override
    public int hashCode(){
        int result = 17;

        result = (int) (31 * result + re);
        result = (int) (31 * result +im);
        return result;
    }
}

