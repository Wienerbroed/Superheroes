import java.util.ArrayList;
import  java.util.List;
import java.util.Arrays;

public class Database {
    private ArrayList<Hero> heroList;


//private Hero[] herolist;
//int count;



public Database() {
    //this.herolist = new Hero[5];

    heroList = new ArrayList<>();
    populateDatabase();

}
    private void populateDatabase(){
        Hero superman = new Hero("Superman","Clark Kent",
                "Super strength, flight, xray vision",
                1938,"No",9999);
        Hero spiderman = new Hero("Spider-Man","Peter Parker",
                "Wall-climbing, web-shooting, danger sense",
                1962,"Yes",629);
        heroList.add(superman);
        heroList.add(spiderman);
    }
public void addHero(Hero hero) {
    //herolist[count++] = hero;

    heroList.add(hero);

}
    public ArrayList<Hero> getHeroes() {
        return heroList;
    }
    public void setHeroes(ArrayList<Hero> superheroes) {
        this.heroList = superheroes;
    }


    public ArrayList<Hero> searchHeroByName(String name){
    ArrayList<Hero> herolist = new ArrayList<>();
    for (Hero hero: heroList) {
        if (hero.getName().toLowerCase().contains(name.toLowerCase()) ||
            hero.getRealName().toLowerCase().contains(name.toLowerCase())){
            herolist.add(hero);
        }
    }
    return herolist;
    }




/*public ArrayList<Superhero> searchHeroByName(String name){
        ArrayList<Superhero> heroList = new ArrayList<>();
        for (Superhero hero: superheroes) {
            if(hero.getName().toLowerCase().contains(name.toLowerCase()) ||
                    hero.getRealName().toLowerCase().contains(name.toLowerCase())){
                heroList.add(hero);
            }
        }
        return heroList;
    } */

    @Override
    public String toString() {
        return "\n" + heroList +
                '}';
    }






}

