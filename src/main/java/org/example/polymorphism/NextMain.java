package org.example.polymorphism;

public class NextMain {
    public static void main(String[] args) {
        Movie movie = Movie.getMovie("A","jaws");
        movie.watchMovie();

        //Casting Classes
        Adventure jaws = (Adventure) Movie.getMovie("A", "Jaws");
        jaws.watchMovie();

        Object comedy = Movie.getMovie("C", "Airplane");
        Comedy comedyMovie = (Comedy) comedy;
        comedyMovie.watchingComedy();

        //Using "var"
        var airplane = Movie.getMovie("C", "Airplane");
        airplane.watchMovie();


        //Testing Runtime type
        Object unknownObj = Movie.getMovie("C", "Airplane");
        if(unknownObj.getClass().getSimpleName() == "Comedy"){
            Comedy c = (Comedy) unknownObj;
            c.watchingComedy();
        } else if (unknownObj instanceof Adventure) {
            ((Adventure) unknownObj).watchingAdventure();
        } else if (unknownObj instanceof ScienceFiction syfy) {
            syfy.watchingScienceFiction();
        }
    }
}
