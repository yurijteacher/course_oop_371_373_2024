package ua.com.kisit_course.example.test;

import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class Main {

    public static void main(String[] args) {
        try (WebClient webClient = new WebClient()) {
            // Вимкнути непотрібні повідомлення
            webClient.getOptions().setCssEnabled(false);
            webClient.getOptions().setJavaScriptEnabled(true);
            webClient.getOptions().setThrowExceptionOnScriptError(false);

            // Зайти на сторінку Scopus
            HtmlPage page = webClient.getPage("https://www.scopus.com/authid/detail.uri?authorId=57224612829");

            // Очікування для завантаження JavaScript (опціонально)
            webClient.waitForBackgroundJavaScript(20000);

            // Отримати HTML-код сторінки
            String pageContent = page.asXml();
            System.out.println(pageContent);

            // Тут додатково можна реалізувати парсинг конкретних елементів сторінки
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
