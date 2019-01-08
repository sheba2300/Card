/**Mir Shahiduzzaman
 * Sheba Sow*/
public class Card {
    private String rank, suit;
    private int pointVal;
    public Card(String rank, String suit, int pointVal)
    {
            this.rank = rank;
            this.suit = suit;
            this.pointVal = pointVal;
    }
    public String getRank()
    {
        return this.rank;
    }
    public String getSuit()
    {
        return this.suit;
    }
    public int getPointVal()
    {
        return this.pointVal;
    }
    public void setRank(String rank)
    {
        this.rank = rank;
    }
    public void setSuit(String suit)
    {
        this.suit = suit;
    }public void setPointVal(int pointVal)
    {
        this.pointVal = pointVal;
    }
    public boolean checkValue(Card other)
    {
        return(this.pointVal == other.pointVal);
    }
    public String toString()
    {
        return(this.rank + " of " + this.suit + " value: " + this.pointVal);
    }
}
