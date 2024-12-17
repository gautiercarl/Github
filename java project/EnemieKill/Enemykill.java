import java.util.ArrayList;
import java.util.Scanner;

public class EnemyKill {
    private ArrayList<Integer> enemyLocation = new ArrayList<>();
    private int leftShots = 5;
    private int numberHit = 0;
    private ArrayList<Integer> choiceList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public int getNumberHit() {
        return numberHit;
    }

    public int getLeftShots() {
        return leftShots;
    }

    public void setEnemyLocation() {
        int m = (int) (Math.random() * 5);
        for (int i = 0; i < 3; i++) {
            enemyLocation.add(m + i);
        }
        System.out.println("DEBUG: Enemy positions are: " + enemyLocation);
    }

    public void setChoice() {
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println("Enter the coordinates for your shot (0-7):");
                int choice = scanner.nextInt();
                if (choice < 0 || choice > 7) {
                    System.out.println("Coordinates must be between 0 and 7.");
                } else {
                    if (choiceList.contains(choice)) {
                        System.out.println("You've already tried this position.");
                    } else {
                        validInput = true;
                        choiceList.add(choice);
                        compareChoice(choice);
                    }
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 0 and 7.");
                scanner.nextLine(); // Clear scanner buffer
            }
        }
    }

    public void compareChoice(int choice) {
        if (enemyLocation.contains(choice)) {
            System.out.println("Bingo! You hit an enemy.");
            enemyLocation.remove((Integer) choice);
            numberHit++;
        } else {
            System.out.println("Nothing here. Try again.");
        }
        leftShots--;
    }

    public void playGame() {
        setEnemyLocation();
        while (!enemyLocation.isEmpty() && leftShots > 0) {
            setChoice();
            System.out.println("Remaining shots: " + leftShots);
        }

        if (enemyLocation.isEmpty()) {
            System.out.println("Congratulations! You've killed all the enemies.");
        } else {
            System.out.println("Out of missiles! Game over.");
        }
    }

    public static void main(String[] args) {
        EnemyKill game = new EnemyKill();
        game.playGame();
    }
}
