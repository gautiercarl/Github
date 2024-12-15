package Praktikum5;

public class EnhancedForLoopDemo {
  public static void main(String[] args) {
    String[] word = new String[5];
    word[0] = "eins";
    word[1] = "zwei";
    word[2] = "drei";
    word[3] = "vier";
    word[4] = "fünf";
    for(String num:word){
        System.out.println(num);
    }
  }  
}
