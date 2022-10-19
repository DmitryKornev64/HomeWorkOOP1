package HomeWorkOOP.Encapsulation.One;

public class Flower {

    String nameFlower;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    Flower(String nameFlower, String flowerColor, String country, double cost, int lifeSpan) {

        // Цвет
        if (flowerColor == null) {
            this.flowerColor = "|белый|";
        } else {
            this.flowerColor = nameFlower;
        }

        // Страна происхождения
        if (country == null) {
            this.country = "|России|";
        } else {
            this.country = country;
        }

        // Стоимость
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }

        // Название цветка
        if (nameFlower == null) {
            this.nameFlower = "|Информация не указана|";
        } else {
            this.nameFlower = nameFlower;
        }
        // Срок стояния
        if (cost <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }

    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // геттер сеттер ЦВЕТ
    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null) {
            this.flowerColor = "|белый|";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // геттер сеттер СТРАНА ПРОИСХОЖДЕНИЯ
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        if (country == null) {
            this.country = "|России|";
        } else {
            this.country = country;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // геттер сеттер СТОИМОСТЬ
    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost <= 0) {
            this.cost = 1;
        } else {
            this.cost = cost;
        }
    }
    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Срок стояния

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setLifeSpan(int lifeSpan) {
        if (cost <= 0) {
            this.lifeSpan = 3;
        } else {
            this.lifeSpan = lifeSpan;
        }
    }

    void infoFlowers() {
        System.out.println(nameFlower + " из " + getCountry() + ", цвет — " + getFlowerColor() + ", стоимость штуки — " + getCost() + " рублей, срок стояния — " + lifeSpan + " дней.");
    }
 }


