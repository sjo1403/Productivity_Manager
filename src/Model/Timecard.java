package Model;

public class Timecard {
    private String cardName;
    private String cardDate;

    public Timecard(String cardName, String cardDate) {
        setCardName(cardName);
        setCardDate(cardDate);
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public String getCardDate() {
        return cardDate;
    }

    public void setCardDate(String cardDate) {
        this.cardDate = cardDate;
    }
}
