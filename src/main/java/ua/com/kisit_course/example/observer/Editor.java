package ua.com.kisit_course.example.observer;

import java.io.File;

// Конкретний видавець, зміни якого хочуть відстежувати спостерігачі
/* Клас Editor реалізує основну логіку для роботи з файлами, зокрема
їх відкриття та збереження. Крім цього, клас підтримує патерн "Спостерігач"
(Observer) для оповіщення підписників про події, що відбуваються при роботі з файлами.
 */
public class Editor {

    // Поле events є менеджером подій, який управляє підписниками (слухачами) на різні події.
    public EventManager events;
    // Поле file містить інформацію про файл, з яким працює редактор.
    private File file;


    /*
    Конструктор Editor ініціалізує менеджер подій EventManager, передаючи йому типи подій,
    які він може обробляти: "open" (відкриття файлу) та "save" (збереження файлу).
     */
    public Editor() {
        this.events = new EventManager("open", "save");
    }


    /*
    Метод openFile() відкриває файл за вказаним шляхом filePath.
    Створюється новий об'єкт класу File для цього файлу і зберігається в полі file.
    Після відкриття файлу викликається метод events.notify("open", file), який повідомляє
    всіх підписників на подію "open", що файл було відкрито. Усі підписники отримають повідомлення
    разом з інформацією про файл.
     */

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    /*
    Метод saveFile() зберігає файл.
    Перед збереженням перевіряється, чи було файл відкрито (чи file не дорівнює null).
    Якщо файл відкрито, викликається events.notify("save", file), що сповіщає всіх підписників події "save",
    що файл було збережено.
    Якщо файл не відкрито, викидається виняток Exception з повідомленням "Please open a file first",
    вказуючи на те, що для збереження потрібно спершу відкрити файл.
     */
    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Please open a file first.");
        }
    }
}
