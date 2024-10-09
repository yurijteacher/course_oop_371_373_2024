package ua.com.kisit_course.example.observer1;

// https://projectreactor.io/docs/core/release/reference/

// Пошук роботи
public class JobSearch {

    public static void main(String[] args) {

        JavaDeveloperJobSite jobSite = new JavaDeveloperJobSite();

        jobSite.addVacancy("First Java Position");
        jobSite.addVacancy("Second Java Position");

        Observer firstSubscriber =
                new Subscriber("Vasya Pypkin");
        Observer secondSubscriber =
                new Subscriber("Ivanka Pypkina");

        // Додаємо підписників до сайту
        jobSite.addObserver(firstSubscriber);
        jobSite.addObserver(secondSubscriber);

//        jobSite.addVacancy("Third Java Position");
        jobSite.removeVacancy("First Java Position");

        jobSite.removeObserver(secondSubscriber);
        jobSite.addVacancy("Fourth Java Position");

    }




}
