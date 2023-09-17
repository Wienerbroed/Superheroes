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
                    "\nDo you wish to edit a Hero? (4)" +
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
                    System.out.println("Hero not present");
                }

            }
            if (optionChoice == 4) {
                    scanner = new Scanner(System.in);
                    ArrayList<Hero> heroList = database.getHeroes();
                    System.out.print("Please choose the Hero you would like to edit");
                    for (int i = 0; i < heroList.size(); i++) {
                        System.out.println((i+1)+""+heroList.get(i));
                    }
                    System.out.print("\n");
                    int selection = scanner.nextInt();
                    Hero selectedHero = heroList.get(selection-1);

                    System.out.printf("Please fill out new information about your Hero",selectedHero);
                    System.out.print("\n Hero name: "+selectedHero.getName()+"\nNew name: ");
                    scanner.nextLine();
                    String name = scanner.nextLine();
                    if(name.isEmpty()){
                        name = selectedHero.getName();
                    }
                    System.out.print("\nReal name: "+selectedHero.getRealName()+"\nNew real name: ");
                    String realName = scanner.nextLine();
                    if(realName.isEmpty()){
                        realName = selectedHero.getRealName();
                    }
                    System.out.print("\nHero power: "+selectedHero.getSuperpower()+"\nNew hero power: ");
                    String superPower = scanner.nextLine();
                    if(superPower.isEmpty()){
                        superPower = selectedHero.getSuperpower();
                    }
                    System.out.print("\nYear created: "+selectedHero.getYearCreated()+"\nNew year created: ");
                    String newYear = scanner.nextLine();
                    if(newYear.isEmpty()){
                        newYear = ""+selectedHero.getYearCreated();
                    }
                    int yearCreated = Integer.parseInt(newYear);
                    System.out.print("\nIs the hero human? "+selectedHero.getIsHuman()+"\nStill human? ");
                    String isHuman = scanner.nextLine();
                    if(isHuman.isEmpty()){
                        isHuman = selectedHero.getIsHuman();
                    }
                    System.out.print("\nStrength value: "+selectedHero.getStrength()+"\nNew strength value: ");
                    String newStrength = scanner.nextLine();
                    if(newStrength.isEmpty()){
                        newStrength = ""+selectedHero.getStrength();
                    }
                    double strength = Double.parseDouble(newStrength);

                    Hero newHero = new Hero(name, realName,superPower,yearCreated,isHuman,strength);

                    heroList.set((selection-1),newHero);
                    database.setHeroes(heroList);
                    System.out.printf("""
                ------------------------------------------
                \u001B[32mEdit complete!\u001B[0m
                %s
                ------------------------------------------
                """,newHero);
                }
            }

         while (optionChoice != 9);
        {
            System.out.println("See you next time!");
        }
    }
}