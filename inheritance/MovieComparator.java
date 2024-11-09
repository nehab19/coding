package guru.springframework.spring5webapp.inheritance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieComparator implements Comparable<MovieComparator> {
    private double rating;
    private String name;
    private int year;

    public MovieComparator() {
    }

    // Used to sort movies by year
    public int compareTo(MovieComparator m) {
        return this.year - m.year;
    }

    // Constructor
    public MovieComparator(String nm, double rt, int yr) {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    class RatingCompare implements Comparator<MovieComparator> {

        @Override
        public int compare(MovieComparator movieComparator1, MovieComparator movieComparator2) {
            if (movieComparator1.getRating() < movieComparator2.getRating()) {
                return -1;
            }
            if (movieComparator1.getRating() > movieComparator2.getRating()) {
                return 1;
            } else
                return 0;
        }
    }

    class NameCompare implements Comparator<MovieComparator> {

        @Override
        public int compare(MovieComparator movieComparator1, MovieComparator movieComparator2) {
            return movieComparator1.getName().compareTo(movieComparator2.getName());
        }
    }
}

class CompartorMain {
    public static void main(String[] args) {
        ArrayList<MovieComparator> list = new ArrayList<MovieComparator>();
        list.add(new MovieComparator("Force Awakens", 8.3, 2015));
        list.add(new MovieComparator("Star Wars", 8.7, 1977));
        list.add(new MovieComparator("Empire Strikes Back", 8.8, 1980));
        list.add(new MovieComparator("Return of the Jedi", 8.4, 1983));
        System.out.println("List sort after comparing with rating");
        MovieComparator movieComparator = new MovieComparator();
        /** as to access the inner class we need an object of outer class , but when rating compare is made static then we would have written new MovieCompartor.RatingCompare
         * as for static we don't require an object of outer class
         */
        MovieComparator.RatingCompare ratingCompare = movieComparator.new RatingCompare();
        Collections.sort(list, ratingCompare);

        for (MovieComparator movie : list)
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());

        System.out.println("List after name sorting");
        MovieComparator.NameCompare nameCompare = movieComparator.new NameCompare();
        Collections.sort(list, nameCompare);
        for (MovieComparator movie : list)
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
    }
}

