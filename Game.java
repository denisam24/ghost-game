import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class Game {

    private int n;
    private int playerX;
    private int playerY;
    private int moves;

    private ArrayList<Ghost> redGhosts = new ArrayList<>();
    private ArrayList<Ghost> blueGhosts = new ArrayList<>();
    private ArrayList<String> directions = new ArrayList<>();

    public void readInput() {

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        playerX = scan.nextInt();
        playerY = scan.nextInt();

        int redCount = scan.nextInt();
        for (int i = 0; i < redCount; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            redGhosts.add(new Ghost(x, y, "R"));
        }

        int blueCount = scan.nextInt();
        for (int i = 0; i < blueCount; i++) {
            int x = scan.nextInt();
            int y = scan.nextInt();
            blueGhosts.add(new Ghost(x, y, "B"));
        }

        moves = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < moves; i++)
            directions.add(scan.nextLine());
    }

    public void applyPlayerMoves() {

        for (String move : directions) {

            switch (move) {
                case "U":
                    playerX++;
                    break;
                case "D":
                    playerX--;
                    break;
                case "R":
                    playerY++;
                    break;
                case "L":
                    playerY--;
                    break;
            }
        }
    }

    public void simulate() {

        for (int step = 0; step < moves; step++) {

            for (Ghost g : redGhosts)
                g.move(n);

            for (Ghost g : blueGhosts)
                g.move(n);

            for (Ghost g : redGhosts)
                if (g.getX() == playerX && g.getY() == playerY)
                    return;

            for (Ghost g : blueGhosts)
                if (g.getX() == playerX && g.getY() == playerY)
                    return;
        }
    }

    public void printResult() {

        System.out.println(playerX + " " + playerY);

        ArrayList<Ghost> all = new ArrayList<>();
        all.addAll(redGhosts);
        all.addAll(blueGhosts);

        all.sort(Comparator.comparingInt(Ghost::getX)
                .thenComparingInt(Ghost::getY)
                .thenComparing(Ghost::getColor));

        for (Ghost g : all)
            System.out.println(g.getColor() + " " + g.getX() + " " + g.getY());
    }
}
