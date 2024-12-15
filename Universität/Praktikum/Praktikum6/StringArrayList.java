package Praktikum6;

import java.util.ArrayList;

public class StringArrayList {
   
   private ArrayList<String>StringArray;  


    public StringArrayList(){
        
        StringArray= new ArrayList<>();

    }
    public int getIndexOf(String value){ // persönliche implementierung 
        
       return StringArray.indexOf(value);
    }


    public String getFrom(int index){

        return StringArray.get(index);
    }

    public void set(int index, String value){
        StringArray.add(index,value);
       
    }

    public int size(){
        return StringArray.size();
    }
    public void remove(int index){
        StringArray.remove(index);
       
    }

    
    public void getElement(){
        for(int i=0; i<StringArray.size();i++){ 
            System.out.println(StringArray.get(i));
        }
    }

    public boolean contains(String value){
        //pio return StringArray.contains(value)
        if(StringArray.contains(value)){
            return true;
        }
        return false;
    }

    public void clear(){
        StringArray.clear();
    }

    public String[] toArray(){
        return StringArray.toArray(new String[0]);
    }


    public boolean isEmpty(){
        if(StringArray.isEmpty()){
            return true;
        }
        return false;
    }
    
}
