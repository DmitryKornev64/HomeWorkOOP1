package HomeWorkOOP.Encapsulation.One;

public class Bouquet {
    private Flower[] flowers;


    public Bouquet(Flower[] flowers) {
        this.flowers = flowers;
    }

    public double getCost() {

        double sum = 0;
        for (Flower flower : flowers) {
            if (flower != null) {
                sum += flower.getCost();
            }
        }
        return sum + sum * 0.1f;
    }

    public int getLifeSpan() {
        int minLIifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers){
            if (flower != null && flower.getLifeSpan() < minLIifeSpan) {
                minLIifeSpan = flower.getLifeSpan();
            }
        }
        return minLIifeSpan;
    }
}

