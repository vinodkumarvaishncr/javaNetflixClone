import java.util.ArrayList;
import java.util.List;

public class NetflixService {
    private List<User> users = new ArrayList<>();
    private List<Video> videos = new ArrayList<>();

    public NetflixService() {
        videos.add(new Video(1, "Stranger Things", "Sci-Fi", 50));
        videos.add(new Video(2, "Money Heist", "Crime", 45));
        videos.add(new Video(3, "Breaking Bad", "Drama", 55));
    }

    public void registerUser(String username, String password) {
        users.add(new User(username, password));
        System.out.println("User registered successfully!");
    }

    public User loginUser(String username, String password) {
        for (User u : users) {
            if (u.getUsername().equals(username) && u.login(password)) {
                return u;
            }
        }
        return null;
    }

    public void showVideos() {
        System.out.println("Available Videos:");
        for (Video v : videos) {
            System.out.println(v);
        }
    }

    public Video getVideoById(int id) {
        for (Video v : videos) {
            if (v.getId() == id) {
                return v;
            }
        }
        return null;
    }
}
