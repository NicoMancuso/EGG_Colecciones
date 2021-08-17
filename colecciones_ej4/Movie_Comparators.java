package colecciones_ej4;

import java.util.Comparator;

/**
 *
 * @author N Mancuso
 */
public class Movie_Comparators {

    //sort movies by duration ascending using a comparator
    public static Comparator<Movie_DB> ByDurAsc = new Comparator<Movie_DB>() {
        @Override
        public int compare(Movie_DB o0, Movie_DB o1) {
            return o1.getDuration().compareTo(o0.getDuration());
        }
    };
    //sort movies by duration descending using a comparator
    public static Comparator<Movie_DB> ByDurDesc = new Comparator<Movie_DB>() {
        @Override
        public int compare(Movie_DB t0, Movie_DB t1) {
            return t0.getDuration().compareTo(t1.getDuration());
        }
    };

    //sort movies by title ascending using a comparator
    public static Comparator<Movie_DB> sortByTit = new Comparator<Movie_DB>() {
        @Override
        public int compare(Movie_DB t, Movie_DB t1) {
            return t.getTitle().compareTo(t1.getTitle());
        }
    };
    //sort movies by Director ascending using a comparator
    public static Comparator<Movie_DB> sortByDir = new Comparator<Movie_DB>() {
        @Override
        public int compare(Movie_DB t, Movie_DB t1) {
            return t.getDirector().compareTo(t1.getDirector());
        }
    };

   
}
