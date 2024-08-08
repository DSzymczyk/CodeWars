package code.wars.kyu5;

public class CardGame {
    public static void main(String[] args) {
        System.out.println(cardGame(69));
    }

    /**
     * Alice and Bob are playing a game. There are number cards on the table. The aim of the game is to collect the most cards. The rules:
     * if the number of cards is even, the players can either take half of the cards from the stack, or only 1 card -- as they choose;
     * if the number of cards is odd, the players must take 1 card.
     * Alice starts the game.
     *
     * Return the maximum number of cards Alice can collect, if Bob plays optimally (tries to get as many cards as possible for himself).
     * @param number number of cards
     * @return maximum number of cards Alice can collect
     */
    public static long cardGame(long number) {
        long aliceCards = 0;
        boolean aliceTurn = true;

        while (number > 0) {
            if (number % 2 == 0) {
                if ((number / 2) % 2 == 0 && number > 4) {
                    number--;
                    if (aliceTurn) {
                        aliceCards++;
                    }
                } else {
                    number /= 2;
                    if (aliceTurn) {
                        aliceCards += number;
                    }
                }
            } else {
                number--;
                if (aliceTurn) {
                    aliceCards++;
                }
            }
            aliceTurn = !aliceTurn;
        }
        return aliceCards;
    }
}
