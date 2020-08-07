public class Rectangle extends Shape {
    private double a;
    protected double b;
    @Override
    public double getPerimeter(){
        return 2*(a+b);
    }
    @Override
    public  double  getArea(){
        return a*b;
    }

}
