package Flowers;

import java.util.Comparator;

public class Flower {
    private Freshness freshness;
    private int StalkLength;
    private int price;

    public Flower(Freshness freshness, int stalkLength, int price) {
        this.freshness = freshness;
        StalkLength = stalkLength;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Flower{" +
                ", freshness=" + freshness +
                ", StalkLength=" + StalkLength +
                ", price=" + price +
                "}\n";
    }

    public static Comparator<? extends Flower> comparator = Comparator.comparingInt((Flower o) -> o.price);

    public Freshness getFreshness() {
        return freshness;
    }

    public void setFreshness(Freshness freshness) {
        this.freshness = freshness;
    }

    public int getStalkLength() {
        return StalkLength;
    }

    public void setStalkLength(int stalkLength) {
        StalkLength = stalkLength;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
