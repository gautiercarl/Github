package Praktikum6;

public class StringArrayListTestDrive {
    public static void main(String[] args) {
        StringArrayList array= new StringArrayList();
        array.set(0, "a");
        array.set(1, "b");
        array.set(2, "c");
        array.set(3, "d");
        array.set(4, "e");
        array.set(5, "f");
        array.set(6, "g");
       
       array.getElement();
       System.out.println("Array content a :"+ array.contains("a"));
       array.clear();
      
       System.out.println("Array content a :"+ array.contains("a"));
       System.out.println( "Array is empty: "+array.isEmpty());
    }
}
