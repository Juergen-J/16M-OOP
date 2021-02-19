public class Test {
    public static void main(String[] args) {
        Movie movie1 = new Movie("Titan", "02.03.2015", "Goot Boy", "ahn", true);
        Movie movie2 = new Movie("Titanus", "02.03.2015", "Go", "FUUUUU", false);


//        System.out.println(movie1.toDisplay());
        Movie[] kinos = new Movie[]{movie1, movie2};

        Movie.movieArrayToDisplay(kinos);
    }
}
