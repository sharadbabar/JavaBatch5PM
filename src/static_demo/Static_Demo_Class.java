package static_demo;

public class Static_Demo_Class {
    public static void main(String[] args) {
        Outer outer= new Outer();
        Outer.Inner inner=outer.new Inner();
    }
}

class Outer{
    int i=20;
    public void show(){
        System.out.println(i);
    }
    class Inner{
        int i=10;
        public void innerShow(){
            System.out.println(i);
        }
    }

}

