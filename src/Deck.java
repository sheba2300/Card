import java.util.ArrayList;
import java.util.List;

public class Deck {
  ArrayList<Card> undealt;
    ArrayList<Card> dealt;
    public Deck(String[] rankList, String[] suitList, int[] pointValList)
    {
        undealt = new ArrayList<Card>();
        for(int a = 0; a<rankList.length;a++)
        {
            for(int b = 0; b<suitList.length;b++)
            {
                for(int c = 0; c<pointValList.length;c++)
                {
                    Card newCard = new Card(rankList[a],suitList[b],pointValList[c]);
                    undealt.add(newCard);
                }
            }
        }
    }
    public boolean isEmpty()
    {
        if(undealt.size() == 0)
            return true;
        return true;
    }
    public int size()
    {
        return undealt.size();
    }
    public Card deal()
    {
        if(undealt.size() <0)
            return null;
        else
        {
            Card chosenCard = undealt.get(0);
            undealt.remove(0);
            return chosenCard;
        }
    }
    public void shuffle()
    {

    }

}
