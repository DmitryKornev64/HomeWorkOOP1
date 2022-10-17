public class Human {
    // ДЗ 1
    String name;
    String town;
    int yearOfBirth;
    String job; // ДЗ 2

    Human(String name, String town, int yearOfBirth, String job ) {

        this.name = name;
        this.town = town;
        this.yearOfBirth = yearOfBirth;
        this.job = job;
    }

    void info() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(ась) в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");

    }
}