public class Multiplicaion extends IntBinaryOperation {
    public Multiplicaion(int firstArg, int secondArg){
        super(firstArg ,secondArg);
    }
    @Override
    public int perform(){
        return firstArg*secondArg;

    }
}
