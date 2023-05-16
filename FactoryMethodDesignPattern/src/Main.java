import card.Card;
import factory.BasicCardFactory;

public class Main {
    public static void main(String[] args) {
        BasicCardFactory basicCardFactory = new BasicCardFactory();
        Card card = basicCardFactory.createCard(100000000L);
        card.getName();
    }
}