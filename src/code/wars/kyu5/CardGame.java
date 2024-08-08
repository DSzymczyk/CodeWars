package code.wars.kyu5;

public class CardGame {
    public static void main(String[] args) {
        System.out.println(cardGame(69));
    }

    /**
     * Alice and Bob are playing a game. There are n cards on the table. The aim of the game is to collect the most cards. The rules:
     * if the number of cards is even, the players can either take half of the cards from the stack, or only 1 card -- as they choose;
     * if the number of cards is odd, the players must take 1 card.
     * Alice starts the game.
     *
     * Return the maximum number of cards Alice can collect, if Bob plays optimally (tries to get as many cards as possible for himself).
     * @param n number of cards
     * @return maximum number of cards Alice can collect
     */
    public static long cardGame(long n) {
        long aliceCards = 0;
        boolean aliceTurn = true;

        while (n > 0) {
            if (n % 2 == 0) {
                if ((n / 2) % 2 == 0 && n > 4) {
                    n--;
                    if (aliceTurn) {
                        aliceCards++;
                    }
                } else {
                    n /= 2;
                    if (aliceTurn) {
                        aliceCards += n;
                    }
                }
            } else {
                n--;
                if (aliceTurn) {
                    aliceCards++;
                }
            }
            aliceTurn = !aliceTurn;
        }
        return aliceCards;
    }
}
