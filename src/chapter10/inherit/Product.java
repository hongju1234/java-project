package chapter10.inherit;

public class Product<T, M> {
    private T kind;
    private M model;

    public T getKind() {
        return kind;
    }

    public M getModel() {
        return model;
    }

    public Product(T kind, M model) {
        this.kind = kind;
        this.model = model;
    }

}
