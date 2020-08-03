public class Triangle extends Shape {
    double height;
    double base;
    public double area(double height ,double base){
        this.height=height;
        this.base=base;
        return (height *base)/2;
    }
}
