package generic;

// example for multiple bounded/constrained
public class MultipleContraintApp {
    // Data<Manager> manager = new Data<>(new Manager()); // Error, tidk implement CanSayHello
    Data<VicePresident> vicePresident = new Data<>(new VicePresident());

    public static abstract class Employee{}
    public static interface CanSayHello{
        void sayHallo();
    }
    public static class Manager extends Employee{}
    public static class VicePresident extends Employee implements CanSayHello{

        @Override
        public void sayHallo() {
            System.out.println("Hello World");
        }
    }

    public static class Data<T extends Employee & CanSayHello>{
        private T data;

        public Data(T data) {
            this.data = data;
        }

        public T getData() {
            return data;
        }

        public void setData(T data) {
            this.data = data;
        }
    }
}
