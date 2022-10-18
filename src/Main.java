public class Main {
    public static void main(String[] args) {
        // ДЗ 1-2
        //Human maxim = new Human("Максим", "Минск", 35, "бренд-менеджером");
        Human maxim = new Human(null, null, -35, null);
        Human anya = new Human("Аня", "Москва", 29, "методистом образовательных программ");
        Human katya = new Human("Катя", "Калининград", 28, "продакт-менеджером");
        Human artem = new Human("Артем", "Москва", 27, "директором по развитию бизнеса");
        maxim.info();
        anya.info();
        katya.info();
        artem.info();
    }
}