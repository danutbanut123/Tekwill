public class Triangle extends Shape {
    protected double a;
    protected double b;
    protected double c;
    @Override
    public  double getPerimeter(){
        return a+b+c;
    }
@Override
    public  double  getArea(){
        return (a+b+c)/2;

    }




}
