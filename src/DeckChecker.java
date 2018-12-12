public class DeckChecker {
    public static void main(String args[])
    {
        String[] suitList = {"spades","diamonds","clubs","hearts"};
        String[] rankList = {"two","three","four","five","six","seven","eight","nine","ten","jack","queen","king","ace"};
        int [] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
        Deck deckOne = new Deck(rankList,suitList,value);
        int count = 0;
        for(int x=0;x<deckOne.size();x++)
        {
            count++;
            System.out.println(deckOne.getUndealtCard(x));

        }
        System.out.println(count);
        deckOne.shuffle();
        System.out.println(" ");
        for(int x=0;x<deckOne.size();x++)
        {
            System.out.println(deckOne.getUndealtCard(x));

        }
        deckOne.deal();
    }

}
