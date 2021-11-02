package day01;

public class MovieMain {

    public static void main(String[] args) {


        Movie movie = new Movie("Titanic", 1997);

        movie.addActor(new Actor( "DiCaprio",1968));
        movie.addActor(new Actor( "John Doe",1993));
        movie.addActor(new Actor( "Jack DOe",1974));
        movie.addActor(new Actor( "Jack DOe",1975));

        System.out.println("Színészek a 20-as éveikben: " + movie.actorsInTheirTwenties());

    }
}
