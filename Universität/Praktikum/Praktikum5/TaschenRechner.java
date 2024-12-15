package Praktikum5;

import java.util.*;

public class TaschenRechner {
    private double a;
    private double b;
    private String operator;
    private double result;
    Scanner scanner = new Scanner(System.in);

    public void setNumber() {
        System.out.println("Geben Sie die erste Zahl ein:");
        a = scanner.nextInt();

        System.out.println("Geben Sie die zweite Zahl ein:");
        b = scanner.nextInt();
       scanner.nextLine();
    }

    public void setOperator() {
        ArrayList<String> operatorList = new ArrayList<>();
        operatorList.add("+");
        operatorList.add("-");
        operatorList.add("/");
        operatorList.add("*");
        System.out.println("choose an operator between (+,-,/,*)");
        String operator=scanner.nextLine();
        if (operatorList.contains(operator)) {
        this.operator=operator;
            
        }
        else{
            System.out.println("enter valabel operator between (+,-,/,*)");
        }
    }

    public void calculate() {
        
if (operator.equals("+")) {
    add();
    
}
if (operator.equals("-")) {
    subs();
    
}
if (operator.equals("*")) {
   mult();
    
}
if (operator.equals("/")) {
    div();
    
}
    }

    public void add() {
        result = a + b;
        System.out.println("Ergebnis:" + result);

    }

    public void subs() {
        result = a - b;
        System.out.println("Ergebnis:" + result);

    }
    public void mult() {
        result = a*b;
        System.out.println("Ergebnis:" + result);

    }

    public void div() {
        if (b == 0) {
            System.out.println("a division with 0 is not possible");
        } else {
            result = a / b;
            System.out.println("Ergebnis:" + result);
        }

    }
}
