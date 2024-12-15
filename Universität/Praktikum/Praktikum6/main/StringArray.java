package Praktikum6.main;

public class StringArray {
    private int size;
   private String[] StringArray; //pio klein geschreiben
   private String[] NewStringArray; //pio kein Attribut
   private int indexOf; // persönliche implementierung //pio keine Attribut
   private int indexCounter = 0;

    public StringArray(int size) {
        this.size = size;
        StringArray = new String[size];

    }

    public boolean getIndexOf(String value) { // persönliche implementierung
        //pio get 
        //pio return boolean ist falsch

        for (int i = 0; i < StringArray.length; i++) {
            String b = StringArray[i]; //pio a b c .... sprechende Namen ...
            if (b != null && b.equals(value)) {
                indexOf = i;
                //pio System.out in der Fachklasse.
                System.out.println("index of " + value + " :" + indexOf);
                return true;
            }

        }
        System.out.println("No value with that index ");
        return false;
    }

    /**
     * 
     * @param index
     * @return
     */
    public String get(int index) {
        if (index < size && index >= 0) {
            return StringArray[index];
        } else {
            return null;
        }
    }

    public void set(int index, String value) {
        //pio value kann null sein ... "" oder "    "
        if (index < size && index >= 0) {
            StringArray[index] = value;
            this.indexCounter++;
        } 

    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < size) {
            StringArray[index] = null;
        }
        //pio
        //shiften
    }

    public int add(String value) {
        if (indexCounter < size) {
            StringArray[indexCounter] = value;

            indexCounter++;
        } else {
            int newSize= size+size/2;
            NewStringArray= new String[newSize]; 

            //NewStringArray = new String[size];
            NewStringArray[indexCounter] = value;
            for (int i = 0; i < (size); i++) {
                NewStringArray[i] = StringArray[i];
            }
            StringArray = NewStringArray;// selbe Referenz setzen für weitere durchläufe
            size=newSize;
            indexCounter++;
            NewStringArray[indexCounter] = null;

        }
        return (indexCounter);// index des wertes

    }

    public void getElement() {
        for (int i = 0; i < indexCounter; i++) {
            System.out.println(StringArray[i]);
        }
    }

}
