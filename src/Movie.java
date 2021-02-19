import javax.sound.midi.Soundbank;

public class Movie {

    private String title;
    private String date;
    private String director;
    private String studioName;
    private String announce;
    private int allPeopleCount;
    private int minutes;
    private double rating;
    private double budget;
    private boolean subtitles;

    public Movie() {
    }

    public Movie(String title, String date, String director, String announce, boolean subtitles) {
        this.title = title;
        this.date = date;
        this.director = director;
        this.announce = announce;
        this.subtitles = subtitles;
    }

    public Movie(String title, String date, String director, String studioName, String announce, int allPeopleCount, int minutes, double rating, double budget, boolean subtitles) {
        this.title = title;
        this.date = date;
        this.director = director;
        this.studioName = studioName;
        this.announce = announce;
        this.allPeopleCount = allPeopleCount;
        this.minutes = minutes;
        this.rating = rating;
        this.budget = budget;
        this.subtitles = subtitles;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getStudioName() {
        return studioName;
    }

    public void setStudioName(String studioName) {
        this.studioName = studioName;
    }

    public String getAnnounce() {
        return announce;
    }

    public void setAnnounce(String announce) {
        this.announce = announce;
    }

    public int getAllPeopleCount() {
        return allPeopleCount;
    }

    public void setAllPeopleCount(int allPeopleCount) {
        this.allPeopleCount = allPeopleCount;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public boolean isSubtitles() {
        return subtitles;
    }

    public void setSubtitles(boolean subtitles) {
        this.subtitles = subtitles;
    }


    public String toDisplay() {
        return "-*-" +
                "\n Film - " + title +
                "\n Rating - " + rating +
                "\n Regie - " + director +
                "\n Lange - " + minutes +
                "\n Price - " + budget
                + "\n -*-";
    }

    public static void movieArrayToDisplay(Movie[] films) {
        for (int i = 0; i < films.length; i++) {
            System.out.println(films[i].toDisplay());
        }
    }
}

