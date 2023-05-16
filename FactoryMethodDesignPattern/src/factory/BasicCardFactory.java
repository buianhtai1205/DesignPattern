package factory;

import card.*;

public class BasicCardFactory implements ICardFactory {

    @Override
    public Card createCard(Long price) {
        if (price >= 100000000000L) {
            return new DiamondCard();
        } else if (price >= 1000000000L) {
            return new GoldCard();
        } else if (price >= 100000000L) {
            return new SliverCard();
        } else if (price >= 10000000L) {
            return new BronzeCard();
        }
        return new BasicCard();
    }
}
