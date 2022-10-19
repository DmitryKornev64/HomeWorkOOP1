package HomeWorkOOP.Encapsulation.One;

import HomeWorkOOP.Encapsulation.One.Human;

public class Main {
    public static void main(String[] args) {

        //HomeWorkOOP.Encapsulation.One.Human maxim = new HomeWorkOOP.Encapsulation.One.Human("Максим", "Минск", 35, "бренд-менеджером");
        Human maxim = new Human(null, null, -35, null);
        Human anya = new Human("Аня", "Москва", 29, "методистом образовательных программ");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджером");
        Human artem = new Human("Артем", "Москва", 27, "директором по развитию бизнеса");
        maxim.info();
        anya.info();
        katya.info();
        artem.info();
        //ДЗ 1 Задние 1
        HomeWorkOOP.Encapsulation.One.Human vladimir = new HomeWorkOOP.Encapsulation.One.Human("Владимир", "Казань", 21, "сейчас нигде не работаю");
        //Human vladimir = new Human(null, null, -21, null);
        vladimir.infoSetGet();
        System.out.println();
        //ДЗ 1 Задние 2

        //Flower commonRose = new Flower(null, null, null, -32.42, -2);
        Flower commonRose = new Flower("Роза обыкновенная", null, "Голландии", 35.59, 0);
        Flower chrysanthemum = new Flower("Хризантема", null, null, 15, 5 );
        Flower peony = new Flower ("Пион", null,  "Англии", 69.9, 1 );
        Flower gypsophila = new Flower ("Гипсофила", null,  "Турция", 19.5, 10  );

        commonRose.infoFlowers();
        chrysanthemum.infoFlowers();
        peony.infoFlowers();
        gypsophila.infoFlowers();

        // Дополнительная часть задания.
        Bouquet bouquet = new Bouquet(new Flower[] {commonRose, commonRose, commonRose, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, chrysanthemum, gypsophila});
        System.out.println(bouquet.getCost() + " - cтоимость букета ");
        System.out.println("простоит - " + bouquet.getLifeSpan());
    }
}