package programas.cardgame;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CardGameTest {
    CardGame cardGame = new CardGame();

    @Test
    public void name() {
        assertThat(cardGame.solution(new int[]{3, 2, 5}, new int[]{2, 4, 1})).isEqualTo(7);
    }

// {4,5,6,8} {1,2,3,4}
    //{2,2,2,2} {3,1,1,1}

    //left = [1, 1, 1, 1, 3] //right = [2, 3, 1, 1, 1]
    @Test
    public void name1() {
        assertThat(cardGame.solution(new int[]{1, 1, 1, 1, 3}, new int[]{2, 3, 1, 1, 1})).isEqualTo(3);
    }

    @Test
    public void name2() {
        assertThat(cardGame.solution(new int[]{4,5,6,8}, new int[]{1,2,3,10})).isEqualTo(10);
    }
}