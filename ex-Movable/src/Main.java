public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(2 , 5);
        Point p2 = new Point(5 , 5);
        Point p3 = new Point(5 , 10);

       Triangle t1 = new Triangle(p1 ,p2 ,p3);
        System.out.println(t1);
        t1.ScaleUp(4);
        System.out.println(t1);
	    }
}
