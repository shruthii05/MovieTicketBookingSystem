class Movie {
    private int movieId;
    private String title;
    private int duration;

    public Movie(int movieId, String title, int duration) {
        this.movieId = movieId;
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
}
