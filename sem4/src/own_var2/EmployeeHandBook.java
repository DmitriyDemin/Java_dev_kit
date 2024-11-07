/*Добавить метод, который ищет сотрудника по стажу (может быть список)
    Добавить метод, который возвращает номер телефона сотрудника по имени (может быть список)
    Добавить метод, который ищет сотрудника по табельному номеру
    Добавить метод добавления нового сотрудника в справочник*/

package own;

import java.util.ArrayList;
import java.util.List;

public class EmployeeHandBook {
    private List<Worker> handBook = new ArrayList<>();

    public void setHandBook(List<Worker> handBook) {
        this.handBook = handBook;
    }

    public List<Worker> getHandBook() {
        return handBook;
    }

    public EmployeeHandBook(){

    }
    public Worker searchByExperience(Integer exp){
        Worker worker = null;
        for (Worker worker2: handBook) {
            if (worker2.getExperience() == exp) {
                worker = worker2;
            }
        }
        return worker;
    }

    public Integer getPhoneNumByName(String name){
        Integer phonenum = 0;
        for (Worker worker: handBook){
            if (worker.getName() == name){
                phonenum = worker.getPhoneNumber();
//                return phonenum;
            }
        }
        return phonenum;
    }

    public Worker searchByEmployeeNum (Integer id){
        Worker worker = null;
        for (Worker worker2: handBook) {
            if (worker2.getEmployeeNumber() == id) {
                worker = worker2;
            }
        }
        return worker;
    }

    public void addEmployee (Worker employee){
        handBook.add(employee);
    }


    public void toString2(){
        for (Worker worker: handBook) {
            System.out.println(worker.toString());
        }
    }

}
