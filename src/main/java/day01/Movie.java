package day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Movie {
    private String title;
    private int yearFilm;

    // Actor actor1 = new Actor("Kim Basinger", 24);
    // Actor actor2 = new Actor("Danny DeVito", 33);

    // private List<Actor> Actors = Arrays.asList(actor1, actor2);

    private List<Actor> actors = new ArrayList<>() ;

    public Movie(String title, int yearFilm) {
        this.title = title;
        this.yearFilm = yearFilm;
    }

    public void addActor(Actor actor){
        actors.add(actor);
    }


    public int actorsInTheirTwenties(){
        int counter = 0;
        for (Actor actual : actors){
            if((yearFilm-actual.getYear()>=20)  && (yearFilm-actual.getYear()<30)) {
                counter++;
            }
        }
        return  counter;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie movie = new Movie();
        String actorname = scanner.nextLine();
        int actoryear = scanner.nextInt();
        movie.setTitle("Halloween");
        movie.setYearFilm(1999);
        Actors.addActor(actorname, actoryear);


    }
}


