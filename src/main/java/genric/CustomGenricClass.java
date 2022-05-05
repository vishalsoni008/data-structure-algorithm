package genric;

public class CustomGenricClass<T> {
    T obj;

    public CustomGenricClass(T o){
        this.obj = o;
    }

    public CustomGenricClass(){
    }

    T getObj(){
        return obj;
    }

    void show(){
        System.out.println("Type of T is "+obj.getClass().getName());
    }
}
