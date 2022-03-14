import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class Thanos {

    public static void main(String[] args) {

        Hero hulk = new Hero("Hulk", 49);
        Hero blackWidow = new Hero("Black Widow", 34);
        Hero captainAmerica = new Hero("Captain America", 100);
        Hero thor = new Hero("Thor", 1501);
        Hero vision = new Hero("Vision", 3);
        Hero scarletWitch = new Hero("Scarlet Witch", 29);
        Hero doctorStrange = new Hero("Doctor Strange", 42);
        
        Flower lily = new Flower("Lily");
        Flower tulip = new Flower("Tulip");
        Flower begonia = new Flower("Begonia");
        Flower violet = new Flower("Violet");
        Flower rose = new Flower("Rose");

       // Create a TreeMap ....
        Comparator<Hero> comparator = new Comparator<Hero>() {  
          @Override  
           public int compare(Hero orig, Hero compare) {  
          return orig.getName().compareTo(compare.getName());  
            }  
        };   
        
        Map<Hero, Flower> party = new TreeMap<Hero, Flower>(comparator);

        // Hulk, Thor and Scarlet Witch have a Rose
        party.put(hulk,rose);
        party.put(thor,rose);
        party.put(scarletWitch,rose);

        // Vision has a Tulip
        party.put(vision,tulip);

        // Captain America has a Lily
        party.put(captainAmerica,lily);

        // Doctor Strange and Black Widow have a Violet
        party.put(doctorStrange,violet);
        party.put(blackWidow,violet);


        // Print if `begonia` is contained in the TreeMap...
        System.out.println(party.containsValue(begonia));


        // For each hero, alphabetically, print the corresponding flower
        for (Hero myHero : party.keySet()) {
         Flower flower = party.get(myHero);
         System.out.println(flower.getName());
        }

    }
}
