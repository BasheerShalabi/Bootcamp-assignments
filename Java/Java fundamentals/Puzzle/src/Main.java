//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();
        for(int num : puzzle.getTenRolls()){
            System.out.println(num);
        }
        System.out.println(puzzle.getRandomLetter());
        System.out.println(puzzle.generatePassword());
        System.out.println(puzzle.getNewPasswordSet(8));
        System.out.println(puzzle.shuffleArray(puzzle.getNewPasswordSet(8)));

    }
}