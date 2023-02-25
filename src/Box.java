public class Box<A, B> {
    private A height;
    private B length;

    public Box(A height, B length) {
        this.height = height;
        this.length = length;
    }

    public Box() {
    }

    public static <A> A method(A rma) {
        return rma;
    }

    public A getHeight() {
        return height;
    }

    public void setHeight(A height) {
        height = height;
    }

    public B getLength() {
        return length;
    }

    public void setLength(B length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Box{" +
                "Height=" + height +
                ", length=" + length +
                '}';
    }


}
