/*каждый сотрудник должен иметь следующие атрибуты:
    Табельный номер
    Номер телефона
    Имя
    Стаж
*/
package own;

public class Worker {

    private Integer employeeNumber;
    private Integer phoneNumber;
    private String name;
    private Integer experience;

    public Worker(Integer employeeNumber, Integer phoneNumber, String name, Integer experience) {
        this.employeeNumber = employeeNumber;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;

    }

    public Integer getExperience() {
        return experience;
    }

    public void setExperience(Integer experience) {
        this.experience = experience;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Integer phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(Integer employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    @Override
    public String toString(){
        return ("Имя -" + name+';' + "таб номер" + getEmployeeNumber()+';' + "номер телефона -" + getPhoneNumber()+';'+ "стаж -" + getExperience()+';');
    }


 }

