package _0627_inherit_deep.deep_q2_inherit;

import java.util.Scanner;

public class SimpleGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int playerHealth = 30;
        int monsterHealth = 20;
        int playerAttack;
        int monsterAttack;

        System.out.println("Welcome to the Simple Game!");
        System.out.println("You encounter a monster!");

        while (playerHealth > 0 && monsterHealth > 0) {
            System.out.println("Your Health: " + playerHealth);
            System.out.println("Monster's Health: " + monsterHealth);
            System.out.print("Choose an action: (1) Attack (2) Heal: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                playerAttack = (int) (Math.random() * 10) + 1;
                monsterHealth -= playerAttack;
                System.out.println("You attacked the monster and dealt " + playerAttack + " damage!");
            } else if (choice == 2) {
                int heal = (int) (Math.random() * 10) + 1;
                playerHealth += heal;
                System.out.println("You healed yourself for " + heal + " health!");
            } else {
                System.out.println("Invalid action. Please choose 1 or 2.");
                continue;
            }

            if (monsterHealth > 0) {
                monsterAttack = (int) (Math.random() * 10) + 1;
                playerHealth -= monsterAttack;
                System.out.println("The monster attacked you and dealt " + monsterAttack + " damage!");
            }
        }

        if (playerHealth > 0) {
            System.out.println("You defeated the monster!");
        } else {
            System.out.println("You were defeated by the monster...");
        }

        scanner.close();
    }
}
