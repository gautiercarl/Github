package Praktikum6.test;

import Praktikum6.main.StringArray;

public class StringArrayTestDrive {
    public static void main(String[] args) {
        //pio java programm ... 53 Seite
        StringArray array = new StringArray(5);
        array.set(0, "a");
        array.set(1, "b");
        array.set(2, "c");
        array.add("d");
        array.add("e");
        array.add("f");
        array.add("g");
       
        array.getElement();
        array.getIndexOf("c");
        array.remove(2);
        array.getElement();
        array.getIndexOf("g");
        System.out.println(array.get(7));
    }
   
    
}
