package code.wars.kyu5;

public class CardGame {
    public static void main(String[] args) {
        System.out.println(cardGame(69));
    }

    /**
     * Alice and Bob are playing a game. There are numberOfCards cards on the table. The aim of the game is to collect the most cards. The rules:
     * if the number of cards is even, the players can either take half of the cards from the stack, or only 1 card -- as they choose;
     * if the number of cards is odd, the players must take 1 card.
     * Alice starts the game.
     *
     * Return the maximum number of cards Alice can collect, if Bob plays optimally (tries to get as many cards as possible for himself).
     * @param numberOfCards number of cards
     * @return maximum number of cards Alice can collect
     */
    public static long cardGame(long numberOfCards) {
        long aliceCards = 0;
        boolean aliceTurn = true;

        while (numberOfCards > 0) {
            if (numberOfCards % 2 == 0) {
                if ((numberOfCards / 2) % 2 == 0 && numberOfCards > 4) {
                    numberOfCards--;
                    if (aliceTurn) {
                        aliceCards++;
                    }
                } else {
                    numberOfCards /= 2;
                    if (aliceTurn) {
                        aliceCards += numberOfCards;
                    }
                }
            } else {
                numberOfCards--;
                if (aliceTurn) {
                    aliceCards++;
                }
            }
            aliceTurn = !aliceTurn;
        }
        return aliceCards;
    }
}
