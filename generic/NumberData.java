package generic;

// contoh bounded type generic
public class NumberData<T extends Number> {
    public NumberData(T data) {
        this.data = data;
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
