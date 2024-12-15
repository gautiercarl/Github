package Praktikum5;

public class ForLoopDemo {
    public static void main(String[] args) {
        String[] word = new String[5];
        word[0] = "eins";
        word[1] = "zwei";
        word[2] = "drei";
        word[3] = "vier";
        word[4] = "fünf";
        for (int i = 0; i < (word.length); i++) {
            System.out.println(word[i]);
        }

        for (int i = (word.length - 1); i >= 0; i--) {
            System.out.println(word[i]);
        }
    }
}
