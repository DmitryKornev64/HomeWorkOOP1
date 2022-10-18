public class Human {
    // ДЗ 1
    String name ;
    String town;
    int today = 2022;
    int yearOfBirth;
    String job; // ДЗ 2


    Human(String name, String town, int yearOfBirth, String job ) {

        // Имя
        if (name == null) {
            this.name = "|Информация не указана|";
        } else {
            this.name = name;
        }

        // Город
        if (town == null) {
            this.town = "|Информация не указана|";
        }else
            this.town = town;

        // Год рождения
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else {
            this.yearOfBirth = yearOfBirth;
        }

        // Должность
        if (job == null) {
            this.job = "|Информация не указана|";
        } else {
            this.job = job;
        }
    }

    void info() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(ась) в " + (today - yearOfBirth) + " году. Я работаю на должности " + job + ". Будем знакомы!");

    }
}
