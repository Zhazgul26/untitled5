package Flowers;

import java.util.ArrayList;
import java.util.List;

public class Bouqet {
    private List<Flower> flowers =new ArrayList<>();

    public void addFlower(Flower flower){
      flowers.add(flower);
    }
}
