public class Video {
    private int id;
    private String title;
    private String genre;
    private int duration; // minutes

    public Video(int id, String title, String genre, int duration) {
        this.id = id;
        this.title = title;
        this.genre = genre;
        this.duration = duration;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public int getDuration() {
        return duration;
    }

    @Override
    public String toString() {
        return id + ". " + title + " (" + genre + ", " + duration + " mins)";
    }
}
