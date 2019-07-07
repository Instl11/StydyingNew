package exceptions;

public class Runner {
    public static void main(String[] args) {
        Player ivan = new Player();

        try {
            System.out.println(ivan.rollTheDice());
        } catch (IllegalDiceNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
