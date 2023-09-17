import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    public void welcome() {
        System.out.println("Welcome to hero creater!");

        Database database = new Database();
        int optionChoice;
        Scanner scanner = new Scanner(System.in);


        do {
            System.out.println("Do you wish to add a Hero? (1)  " +
                    "\nDo you wis to see your Herolist? (2)" +
                    "\nDo you wish to serch for a Hero? (3)" +
                    "\nDo you wish to Exit? (9)"
            );

            optionChoice = scanner.nextInt();


            if (optionChoice == 1) {
                System.out.println("What name does your hero have? ");
                String name = scanner.next();
                System.out.println("What is your Heros real name? ");
                String realName = scanner.next();
                System.out.println("What is your heroes power? ");
                String superpower = scanner.next();
                System.out.println("What year was your Hero created? ");
                int yearCreated = scanner.nextInt();
                System.out.println("Is your Hero human? ");
                String isHuman = scanner.next();
                System.out.println("How strong is your Hero? ");

                int strenght = scanner.nextInt();

                Hero newHero = new Hero(name, realName, superpower, yearCreated, isHuman, strenght);
                database.addHero(newHero);

                System.out.println(newHero);

            }
            if (optionChoice == 2) {
                System.out.println(database);

            }
            if (optionChoice == 3) {

                scanner = new Scanner(System.in);
                System.out.println("You have decided to call for a specific Hero!" +
                        "\nPlease enter the Heros name: ");
                String name = scanner.nextLine();
                ArrayList<Hero> searchResult = database.searchHeroByName(name);
                if (!searchResult.isEmpty()) {
                    for (int i = 0; i < searchResult.size(); i++) {
                        System.out.println((i + 1) + "" + searchResult.get(i));
                    }
                } else {
                    System.out.println("\u001B[31mHero not found!\u001B[0m");
                }
            }

        } while (optionChoice != 9);
        {
            System.out.println("See you next time!");
        }
    }
}