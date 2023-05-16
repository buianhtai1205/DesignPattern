package factory;

import card.Card;

public interface ICardFactory {
    Card createCard(Long price);
}
