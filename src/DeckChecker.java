public class DeckChecker {
    public static void main(String args[])
    {
        String[] suitList = {"spades","diamonds","clubs","hearts"};
        String[] rankList = {"one","two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
        int [] value = {1,2,3,4,5,6,7,8,9,10,11,12,13};
        Deck deckOne = new Deck(rankList,suitList,value);
        System.out.println(deckOne.getUndealtCard(0));
    }

}
