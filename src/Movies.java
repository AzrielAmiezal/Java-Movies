public class Movies {

    // Declare variables
    private String movieTitle;
    private String date;
    private String directorNames;
    private char categories;
    private boolean isMembership;

    // constructor with parameter
    public Movies(String movieTitle,String date, String directorNames,char categories,boolean isMembership){

        this.movieTitle = movieTitle;
        this.date = date;
        this.directorNames = directorNames;
        this.categories = categories;
        this.isMembership = isMembership;
    }

    // Mutators (Setter) methods
    public void setMovieTitle(String movieTitle) {
        this.movieTitle = movieTitle;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setDirectorNames(String directorNames) {
        this.directorNames = directorNames;
    }

    public void setCategories(char categories) {
        this.categories = categories;
    }

    public void setMembership(boolean membership) {
        isMembership = membership;
    }

    // Accessors (Getter) methods
    public String getMovieTitle() {
        return movieTitle;
    }

    public String getDate() {
        return date;
    }

    public String getDirectorNames() {
        return directorNames;
    }

    public char getCategories() {
        return categories;
    }

    public boolean isMembership() {
        return isMembership;
    }

    @Override
    public String toString() {
        String membership = isMembership ? "Yes" : "No";
        return "Movies{" +
                "movieTitle='" + movieTitle + '\'' +
                ", date='" + date + '\'' +
                ", directorNames='" + directorNames + '\'' +
                ", categories=" + categories +
                ", isMembership=" + membership +
                '}';
    }
}
