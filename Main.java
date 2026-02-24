public class Main {

    public static void main(String[] args) {
        Game game = new Game();
        game.readInput();
        game.applyPlayerMoves();
        game.simulate();
        game.printResult();
    }
}
