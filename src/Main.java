public class Main {
    public static void main(String[] args) {
        // ДЗ 1-2
        Human maxim = new Human("Максим", "Минск", 1987, "бренд-менеджером");
        Human anya = new Human("Аня", "Москва", 1993, "методистом образовательных программ");
        Human katya = new Human("Катя", "Калининград", 1994, "продакт-менеджером");
        Human artem = new Human("Артем", "Москва", 1995, "директором по развитию бизнеса");
        maxim.info();
        anya.info();
        katya.info();
        artem.info();
    }
}