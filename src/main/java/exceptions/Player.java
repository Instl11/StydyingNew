package exceptions;

/**
 * Этот класс создает игрока, бросающего игральные кости,
 * его цель не выбросить ребро с номером 6.
 */

public class Player {
    private Dice dice;

    public Player() {
        this.dice = new Dice();
    }

    public String rollTheDice() throws IllegalDiceNumberException {
        return dice.tryNotToThrowSixOnDice();
    }
}
