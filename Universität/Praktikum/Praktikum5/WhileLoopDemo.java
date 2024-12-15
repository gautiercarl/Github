package Praktikum5;

public class WhileLoopDemo {
    public static void main(String[] args) {
        String[] word = new String[5];
        word[0] = "eins";
        word[1] = "zwei";
        word[2] = "drei";
        word[3] = "vier";
        word[4] = "fünf";

        int i = 0;
        while (i < word.length) {
            System.out.println(word[i]);
            i++;
        }
i=(word.length - 1);
while (i >=0) {
    System.out.println(word[i]);
    i--;
}
    }
}
