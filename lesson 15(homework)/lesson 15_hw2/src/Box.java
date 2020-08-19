public class Box<T> {
private T dessert;
    public void put(T dessert) {
        this.dessert = dessert;
    }
    public T get() {
        return this.dessert;
    }
}
