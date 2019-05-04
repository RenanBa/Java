// Card class represents a playing card

public class Card
{
    private String face; // face of card ("Ace", "Deuce", ...)
    private string suit; // suit of card ("Hearts", "Diamonds", ...)

    // two arguments constructor initializer card's face and suit
    public Card( String cardFace, String cardSuit )
    {
        face = cardFace; // initialize face of card
        suit = cardSuit; // initialize suit of card
    } // end constructor

    // return String representation of Card
    public String toString()
    {
        return face + " of " + suit;
    } // end method toString
} // end class Card