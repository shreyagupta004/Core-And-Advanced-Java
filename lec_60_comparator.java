import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;

public class lec_60_comparator {
    public static void main(String[] args) {
        ArrayList<Movie> list = new ArrayList<Movie>();
        list.add(new Movie(8.8,"golmaal" , 2002));
        list.add(new Movie(9.1,"inception" , 2020));
        list.add(new Movie(7.2,"spiderman" , 2011));
        list.add(new Movie(6.9,"dilwale" , 2018));
        list.add(new Movie(7.4,"wednesday" , 2024));

        System.out.println("sorted based on rating :");

        ratingComparator rc = new ratingComparator();
        Collections.sort(list , rc);
        for(Movie movie : list){
            System.out.println(movie.getRating() + " " + movie.getName() + " " + movie.getYear());
        }

        System.out.println("sorted based on name : ");

        nameComparator nc = new nameComparator();
        Collections.sort(list , nc);
        for(Movie movie : list){
            System.out.println(movie.getName() + " " + movie.getRating() + " " + movie.getYear());
        }
        
        System.out.println("sorted based on year : ");

        yearComparator yc = new yearComparator();
        Collections.sort(list , yc);
        for(Movie movie : list){
            System.out.println(movie.getYear() + " " + movie.getName() + " " + movie.getRating());
        }

    }
    public static class Movie implements Comparator<Movie>{
        private double rating;
        private String name;
        private int year;

        public double getRating(){
            return rating;
        }

        public String getName(){
            return name;
        }

        public int getYear(){
            return year;
        }

        public Movie(double rating , String name , int year){
            this.rating = rating;
            this.name = name;
            this.year = year;
        }

        @Override
        public int compare(Movie o1, Movie o2){
            return o1.year - o2.year;
        }
    }
    public static class nameComparator implements Comparator<Movie>{
        @Override
        public int compare(Movie m1 , Movie m2){
            return m1.getName().compareTo(m2.getName());
        }

    }
    public static class ratingComparator implements Comparator<Movie>{
        @Override
        public int compare(Movie m1 , Movie m2){
            if(m1.getRating() < m2.getRating()){
                return -1;
            }else if(m1.getRating() > m2.getRating()){
                return 1;
            }else{
                return 0;
            }
        }
    }

    public static class yearComparator implements Comparator<Movie>{
        @Override
        public int compare(Movie m1 , Movie m2){
            if(m1.getYear() < m2.getYear()){
                return -1;
            }
            else if(m1.getYear() > m2.getYear()){
                return 1;
            }
            else{
                return 0;
            }
        }
    }
}
