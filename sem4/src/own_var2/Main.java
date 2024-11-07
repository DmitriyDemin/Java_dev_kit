/*Создать справочник сотрудников
Необходимо:
Создать класс справочник сотрудников, который содержит внутри
коллекцию сотрудников - каждый сотрудник должен иметь следующие атрибуты:
        Табельный номер
        Номер телефона
        Имя
        Стаж
    Добавить метод, который ищет сотрудника по стажу (может быть список)
    Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    Добавить метод, который ищет сотрудника по табельному номеру
    Добавить метод добавления нового сотрудника в справочник
*/


package own;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Repository repo = new Repository("sem4/src/own/handBook.txt");

        Worker w1 = new Worker(1, 1, "bob", 1);
        Worker w2 = new Worker(2, 2, "rob", 1);
        Worker w3 = new Worker(3, 3, "lob", 2);
        Worker w4 = new Worker(4, 4, "kob", 3);
//
        EmployeeHandBook e1 = new EmployeeHandBook();
//
        e1.addEmployee(w1);
        e1.addEmployee(w2);
        e1.addEmployee(w3);
        e1.addEmployee(w4);

//        e1.setHandBook(repo.readHandBook());

        e1.toString2();

        repo.writeHandBook(e1.getHandBook());



//        System.out.println(e1.getPhoneNumByName("bob"));





    }



}
