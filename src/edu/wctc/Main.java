package edu.wctc;

import java.util.HashSet;
import java.util.Set;

/*
https://www.template.net/design-templates/print/sample-funny-venn-diagram/
https://www.baeldung.com/java-set-operations
 */
public class Main {

    public static void main(String[] args) {
        Set<String> carby = new HashSet<>();
        Set<String> tomatoey = new HashSet<>();
        Set<String> cheesey = new HashSet<>();

        carby.add("Croissant");
        carby.add("Roll");
        carby.add("Toast");
        carby.add("Grilled Cheese");
        carby.add("Mac and Cheese");
        carby.add("Cheese and Crackers");
        carby.add("Bagel and Cream Cheese");
        carby.add("Spaghetti Marinara");
        carby.add("Tomato Sandwich");
        carby.add("Lasagna");
        carby.add("Tomato Soup and Goldfish Crackers");
        carby.add("Pizza Margherita");
        carby.add("Tomato and Mozzarella Sandwich");

        tomatoey.add("Tomato Slices");
        tomatoey.add("Tomato Wedges");
        tomatoey.add("Grape Tomatoes");
        tomatoey.add("Spaghetti Marinara");
        tomatoey.add("Tomato Sandwich");
        tomatoey.add("Lasagna");
        tomatoey.add("Tomato Soup and Goldfish Crackers");
        tomatoey.add("Pizza Margherita");
        tomatoey.add("Tomato and Mozzarella Sandwich");
        tomatoey.add("Caprese Salad");
        tomatoey.add("Greek Salad");

        cheesey.add("Mozzarella Sticks");
        cheesey.add("String Cheese");
        cheesey.add("Cheese Cubes");
        cheesey.add("Fresh Mozzarella");
        cheesey.add("Caprese Salad");
        cheesey.add("Greek Salad");
        cheesey.add("Grilled Cheese");
        cheesey.add("Mac and Cheese");
        cheesey.add("Cheese and Crackers");
        cheesey.add("Bagel and Cream Cheese");
        cheesey.add("Lasagna");
        cheesey.add("Tomato Soup and Goldfish Crackers");
        cheesey.add("Pizza Margherita");
        cheesey.add("Tomato and Mozzarella Sandwich");

        // Foods that are both cheesey and tomatoey
        // The intersection of both sets
        Set<String> cheeseyAndTomatoey = new HashSet<>(cheesey);
        cheeseyAndTomatoey.retainAll(tomatoey);
        System.out.println(cheeseyAndTomatoey.toString());

        // Foods that are either carby or tomatoey (or both)
        // The union of both sets
        Set<String> carbyOrTomatoey = new HashSet<>(carby);
        carbyOrTomatoey.addAll(tomatoey);
        System.out.println(carbyOrTomatoey.toString());

        // Foods that are cheesey but not carby
        // The difference (or relative complement) of both sets
        Set<String> cheeseyButNotCarby = new HashSet<>(cheesey);
        cheeseyButNotCarby.removeAll(carby);
        System.out.println(cheeseyButNotCarby.toString());

        // Foods that are cheesey, carby, and tomatoey
        // The center of the Venn diagram
        Set<String> allThree = new HashSet<>(cheesey);
        allThree.retainAll(carby);
        allThree.retainAll(tomatoey);
        System.out.println(allThree.toString());
    }
}
