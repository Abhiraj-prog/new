package Collection_Interface;

public class Generics_class {
    public static void main(String[] args) {
    box<Integer> intbox = new box<>();
    intbox.set(25);
        System.out.println(intbox.get());
    box<String> Strbox =new box<>();
    Strbox.set("Abhiraj");
        System.out.println(Strbox.get());
    }

}
    class box <T>{
        T value;

        void set(T value){
            this.value =value;
        }
        T get(){
            return value;
        }
    }
