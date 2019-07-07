package exceptions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Хотел создать что-то чтобы потренироваться с имитациями Mock объектов.
 *
 *
 * @Mock - создаем имитацию объекта Dice, чтобы можно было задать устройчивое поведение.
 *         Это необходимо, т.к. выпадают рандомные числа в методе tryNotToThrowSixOnDice().
 * @InjectMock - внедряем имитированный объект Dice в объект Player
 */

@ExtendWith(MockitoExtension.class)
class PlayerTest {

    @Mock
    Dice dice;

    @InjectMocks
    Player player;


    @Test
    @DisplayName("Negative Test")
    void throwSix() throws IllegalDiceNumberException {
        Mockito.when(dice.tryNotToThrowSixOnDice()).thenThrow(IllegalDiceNumberException.class);
        assertThrows(IllegalDiceNumberException.class, () -> player.rollTheDice());
        Mockito.verify(dice).tryNotToThrowSixOnDice();
    }

    @Test
    @DisplayName("Positive Test")
    void throwOneToFive() throws IllegalDiceNumberException {
        Mockito.when(dice.tryNotToThrowSixOnDice()).thenReturn("You threw One");
        assertEquals("You threw One", player.rollTheDice());
        Mockito.verify(dice).tryNotToThrowSixOnDice();
    }

    @Test
    @DisplayName("Negative Test with try/catch")
    void throwSixAndCatch() throws IllegalDiceNumberException {
        Mockito.when(dice.tryNotToThrowSixOnDice()).thenThrow(IllegalDiceNumberException.class);

        try {
            player.rollTheDice();
        } catch (IllegalDiceNumberException e) {
            System.out.println("You rolled Six, pls try again");
        }
    }
}