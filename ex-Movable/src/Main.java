public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(2 , 5);


      Rectangle t1 = new Rectangle(p1 ,10 ,20);
        System.out.println(t1);
        t1.ScaleUp(2);
        System.out.println(t1);
	    }
}
