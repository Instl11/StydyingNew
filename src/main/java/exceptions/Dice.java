package exceptions;

import java.util.Random;

/**
 * Этот класс имитирует вброс игральной кости, но при выпадании
 * ребра с номером 6, выпадает исключение IllegalDiceNumberException.
 */

public class Dice {

    public String tryNotToThrowSixOnDice() throws IllegalDiceNumberException {
        Random random = new Random();
        int side = random.nextInt(6) + 1;
        switch (side) {
            case 1:
                return "You threw One";
            case 2:
                return "You threw Two";
            case 3:
                return "You threw Three";
            case 4:
                return "You threw Four";
            case 5:
                return "You threw Five";
            case 6:
                throw new IllegalDiceNumberException("You threw Six. Try again not to throw it!");
        } return null;
    }
}
