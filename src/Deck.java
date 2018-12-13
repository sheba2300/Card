import java.util.ArrayList;
import java.util.List;

public class Deck {
  ArrayList<Card> undealt;
    ArrayList<Card> dealt;
    public Deck(String[] rankList, String[] suitList, int[] pointValList)
    {
        undealt = new ArrayList<Card>();
        dealt = new ArrayList<Card>();
        for(int a = 0; a<suitList.length;a++)
        {
            for(int b = 0; b<rankList.length;b++)
            {
                    Card newCard = new Card(rankList[b],suitList[a],pointValList[b]);
                    undealt.add(newCard);
            }
        }
    }
    public boolean isEmpty()
    {
        if(undealt.size() == 0)
            return true;
        return false;
    }
    public int size()
    {
        return undealt.size();
    }
    public Card getUndealtCard(int idx)
    {
        return undealt.get(idx);
    }
    public Card getDealtCard(int idx)
    {
        return dealt.get(idx);
    }
    public Card deal()
    {
        if(undealt.size() <0) {
            return null;
        }
        else
        {
            Card chosenCard = undealt.get(0);
            dealt.add(chosenCard);
            undealt.remove(0);
            return chosenCard;
        }

    }
    public void shuffle()
    {
        int count =0;
        if(dealt.size()>0)
        {
            while(count<52)
            {
                undealt.add(dealt.get(0));
                dealt.remove(0);
                count++;
            }
        }

        for(int x = 0; x< undealt.size();x++)
        {
            int idx = (int) (Math.random() * 51) + 1;
            Card temp = undealt.get(x);
            undealt.set(x,undealt.get(idx));
            undealt.set(idx,temp);
        }

    }


}
