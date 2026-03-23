import java.util.*;
import java.util.concurrent.*;

public class SimpleSubway {

    static int lane = 1;
    static boolean isJumping = false;
    static boolean isSliding = false;
    static boolean movedLane = false;

    static int lives = 2;
    static int recoveryCounter = 0;

    static int score = 0;
    static boolean gameOver = false;

    static Random rand = new Random();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Game Started!");
        System.out.println("Controls: A=Left, D=Right, W=Jump, S=Slide");

        while (!gameOver) {

            String[] obstacles = generateObstacles();

            printObstacles(obstacles);

            // DYNAMIC TIME LIMIT
            int timeLimit;
            if (score < 10) {
                timeLimit = 5;
            } else if (score < 25) {
                timeLimit = 4;
            } else {
                timeLimit = 3;
            }

            System.out.println("You have " + timeLimit + " seconds...");
            char input = getInputWithTimeout(sc, timeLimit);

            handleInput(input);

            boolean hit = checkCurrentLane(obstacles);

            // SCORING
            if (hit) {
                score -= 5;
            } else {
                score += 1;
            }

            // LIFE RECOVERY
            if (lives == 1) {
                recoveryCounter++;
                if (recoveryCounter >= 7) {
                    lives = 2;
                    recoveryCounter = 0;
                    System.out.println("Life Restored!");
                }
            }

            if (lives <= 0) {
                gameOver = true;
            }

            printState(obstacles);
        }

        System.out.println("\nGame Over!");
        System.out.println("Final Score: " + score);
    }

    // GENERATE OBSTACLES WITH DIFFICULTY
    public static String[] generateObstacles() {

        String[] easy = {"NONE", "LOW_BARRIER", "NONE"};
        String[] medium = {"LOW_BARRIER", "HIGH_BARRIER", "NONE"};
        String[] hard = {"TRAIN", "HIGH_BARRIER", "LOW_BARRIER"};

        String[] result = new String[3];

        for (int i = 0; i < 3; i++) {
            if (score < 10) {
                result[i] = easy[rand.nextInt(easy.length)];
            } else if (score < 25) {
                result[i] = medium[rand.nextInt(medium.length)];
            } else {
                result[i] = hard[rand.nextInt(hard.length)];
            }
        }

        return result;
    }

    // PRINT OBSTACLES
    public static void printObstacles(String[] obs) {
        System.out.println("\nObstacles:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Lane " + i + ": " + obs[i]);
        }
    }

    // INPUT WITH TIME LIMIT
    public static char getInputWithTimeout(Scanner sc, int seconds) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> sc.next());

        try {
            String input = future.get(seconds, TimeUnit.SECONDS);
            return input.toLowerCase().charAt(0);
        } catch (Exception e) {
            System.out.println("Too slow!");
            return 'x'; // treated as no action
        } finally {
            executor.shutdownNow();
        }
    }

    // HANDLE INPUT
    public static void handleInput(char input) {
        isJumping = false;
        isSliding = false;
        movedLane = false;

        switch (input) {
            case 'a':
                if (lane > 0) {
                    lane--;
                    movedLane = true;
                } else {
                    loseLife(1);
                    System.out.println("Invalid left move!");
                }
                break;

            case 'd':
                if (lane < 2) {
                    lane++;
                    movedLane = true;
                } else {
                    loseLife(1);
                    System.out.println("Invalid right move!");
                }
                break;

            case 'w':
                isJumping = true;
                break;

            case 's':
                isSliding = true;
                break;

            default:
                // timeout or no action
                break;
        }
    }

    // CHECK ONLY CURRENT LANE
    public static boolean checkCurrentLane(String[] obstacles) {

        String obstacle = obstacles[lane];
        boolean hit = false;

        switch (obstacle) {

            case "LOW_BARRIER":
                if (!isJumping) {
                    loseLife(1);
                    System.out.println("Hit LOW_BARRIER!");
                    hit = true;
                }
                break;

            case "HIGH_BARRIER":
                if (!isSliding) {
                    loseLife(1);
                    System.out.println("Hit HIGH_BARRIER!");
                    hit = true;
                }
                break;

            case "NONE":
                break;

            case "TRAIN":
                if (isSliding) {
                    loseLife(2);
                    System.out.println("Crashed into TRAIN!");
                    hit = true;
                } else if (!isJumping && !movedLane) {
                    loseLife(2);
                    System.out.println("Crashed into TRAIN!");
                    hit = true;
                }
                break;
        }

        return hit;
    }

    // LIFE MANAGEMENT
    public static void loseLife(int amount) {
        lives -= amount;
        recoveryCounter = 0;
    }

    // PRINT STATE
    public static void printState(String[] obstacles) {
        System.out.println("Current Lane: " + lane +
                " | Lives: " + lives +
                " | Score: " + score);
    }
}