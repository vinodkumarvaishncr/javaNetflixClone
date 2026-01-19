import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String password;
    private List<Video> watchHistory = new ArrayList<>();

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public boolean login(String password) {
        return this.password.equals(password);
    }

    public void watchVideo(Video video) {
        watchHistory.add(video);
        System.out.println("Now watching: " + video.getTitle());
    }

    public void showHistory() {
        System.out.println("Watch History:");
        for (Video v : watchHistory) {
            System.out.println("- " + v.getTitle());
        }
    }
}
