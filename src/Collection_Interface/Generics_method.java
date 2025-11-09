package Collection_Interface;

public class Generics_method {
    public static void main(String[] args) {
        Demo d =new Demo();
        d.<String>show("Abhiraj");
        d.<Integer>show(19);
        d.show(5.8);
    }
}
class Demo{
    public <T> void show(T data){
        System.out.println("Data : "+ data);
    }
}
