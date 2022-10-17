public class Main {
    public static void main(String[] args) {
        // ДЗ 1-2
        Human maxim = new Human("Максим", "Москва", 1999, "бренд-менеджером");
        Human anya = new Human("Аня", "Саратов", 1983, "методистом образовательных программ");
        Human katya = new Human("Катя", "Самара", 2003, "продакт-менеджером");
        Human artem = new Human("Артем", "Ростов", 1959, "директором по развитию бизнеса");
        maxim.info();
        anya.info();
        katya.info();
        artem.info();
    }
}