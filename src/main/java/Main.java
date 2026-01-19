import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        NetflixService service = new NetflixService();
        Scanner sc = new Scanner(System.in);

        System.out.println("=== Netflix Clone ===");
        System.out.print("Register Username: ");
        String username = sc.next();
        System.out.print("Password: ");
        String password = sc.next();

        service.registerUser(username, password);

        System.out.println("\nLogin");
        System.out.print("Username: ");
        String u = sc.next();
        System.out.print("Password: ");
        String p = sc.next();

        User user = service.loginUser(u, p);

        if (user == null) {
            System.out.println("Invalid login!");
            return;
        }

        while (true) {
            System.out.println("\n1. Browse Videos\n2. Watch Video\n3. Watch History\n4. Exit");
            System.out.print("Choose: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    service.showVideos();
                    break;
                case 2:
                    System.out.print("Enter Video ID: ");
                    int id = sc.nextInt();
                    Video video = service.getVideoById(id);
                    if (video != null) {
                        user.watchVideo(video);
                    } else {
                        System.out.println("Video not found!");
                    }
                    break;
                case 3:
                    user.showHistory();
                    break;
                case 4:
                    System.out.println("Thank you for using Netflix Clone!");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
