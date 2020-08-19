public class Main {

    public static void main(String[] args) {

	Box<CakeBox> cake1 = new Box<>();
        CakeBox americanCake=new CakeBox();
	cake1.put(americanCake);
        System.out.println(cake1);
    }
}
