import java.util.Random;
import java.util.Scanner;

public class SubwaySurfs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int lane = 2; // start in middle lane
        int gameOver = 0;

        System.out.println("=== SIMPLE SUBWAY SURFERS GAME ===");
        System.out.println("Controls: ");
        System.out.println("1 - Move Left");
        System.out.println("2 - Stay");
        System.out.println("3 - Move Right");
        System.out.println("4 - Jump");

        while (gameOver == 0) {

            // Random obstacle lane (1 to 3)
            int obstacleLane = rand.nextInt(3) + 1;

            System.out.println("\nCurrent Lane: " + lane);
            System.out.println("Obstacle in lane: " + obstacleLane);
            System.out.print("Enter your move: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1: // move left
                    if (lane > 1) {
                        lane = lane - 1;
                    }
                    break;

                case 2: // stay
                    // no change
                    break;

                case 3: // move right
                    if (lane < 3) {
                        lane = lane + 1;
                    }
                    break;

                case 4: // jump
                    if (lane == obstacleLane) {
                        System.out.println("You jumped over obstacle!");
                    }
                    break;

                default:
                    System.out.println("Invalid input");
            }

            // Check collision
            if (lane == obstacleLane && choice != 4) {
                System.out.println("~ You hit an obstacle!");
                gameOver = 1;
            } else {
                System.out.println("~ Safe!");
            }
        }

        System.out.println("GAME OVER!");
        sc.close();
    }
}