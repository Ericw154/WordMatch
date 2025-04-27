public class Main {
    public static void main(String[] args){
        WordMatch w = new WordMatch("Mississippi");
        System.out.println(w.scoreGuess("i"));
        System.out.println(w.scoreGuess("iss"));
        System.out.println(w.scoreGuess("issipp"));
        System.out.println(w.scoreGuess("Mississippi"));
        System.out.println();
        WordMatch game = new WordMatch("aaaabb");
        System.out.println(game.scoreGuess("a"));
        System.out.println(game.scoreGuess("aa"));
        System.out.println(game.scoreGuess("aaa"));
        System.out.println(game.scoreGuess("aabb"));
        System.out.println(game.scoreGuess("c"));
        System.out.println();
        game = new WordMatch("concatenation");
        System.out.println(game.scoreGuess("ten"));
        System.out.println(game.scoreGuess("nation"));
        System.out.println(game.findBetterGuess("ten", "nation"));
        System.out.println(game.scoreGuess("con"));
        System.out.println(game.scoreGuess("cat"));
        System.out.println(game.findBetterGuess("con", "cat"));

    }
}