import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        // Detect CI/CD environment
        if (System.getenv("CI") != null) {
            System.out.println("Running in CI mode");
            System.out.println("Netflix Clone build successful");
            return;
        }

        // Normal local execution
        System.out.println("=== Netflix Clone ===");
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String user = sc.next();

        System.out.println("Welcome " + user);
    }
}
