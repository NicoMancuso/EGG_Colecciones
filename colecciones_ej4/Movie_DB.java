/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_ej4;

import java.util.Scanner;

/**
 *
 * @author N Mancuso
 */
public class Movie_DB {

    private Scanner sc;
    private String Title;
    private String Director;
    private Integer Duration;

    //constructor + scanner
    public Movie_DB() {
        this.sc = new Scanner(System.in).useDelimiter("\n");
    }
//full/filled? constructor

    public Movie_DB(String Title, String Director, Integer Duration) {
        this.Title = Title;
        this.Director = Director;
        this.Duration = Duration;
    }

    //setters & getters
    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getDirector() {
        return Director;
    }

    public void setDirector(String Director) {
        this.Director = Director;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer Duration) {
        this.Duration = Duration;
    }

    //methods
    public Movie_DB Create() {
        System.out.println("  --------Input Movie details--------");
        System.out.println("Title: ");
        Title = sc.next();
        System.out.println("Director: ");
        Director = sc.next();
        System.out.println("Duration: [minutes] ");
        Duration = sc.nextInt();
        double D = (double) Duration;
        return new Movie_DB(Title, Director, Duration);
    }

    @Override
    public String toString() {
        return "Movie_DB{" + Title + ", by " + Director + ", " + Duration + " minutes}";
    }

}
