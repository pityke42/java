package org.example.polymorphism;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Movie movie = new Movie("Star wars");
//        movie.watchMovie();
//        Movie movie = new Adventure("Star wars");
//        movie.watchMovie();

//        Adventure adventure = new Adventure("jones indian");
//        adventure.watchMovie();

//        Movie movie = Movie.getMovie("Science", "Star wars");
//        movie.watchMovie();


        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a, b, c, q");
            String type = scanner.nextLine();
            if(("Qq").contains(type)){
                break;
            }
            System.out.println("Enter movie title: " );
            String title = scanner.nextLine();
            Movie movie = Movie.getMovie(type, title);
            movie.watchMovie();
        }

    }
}
