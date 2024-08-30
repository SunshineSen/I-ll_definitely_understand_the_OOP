package Lec12_Sem;
/*Класс не зависит от других классов (принцип Dependly inversion) */
public class User {

    private String firstName;
    private String lastName;
    private String middleName;
/*Класс выполняет функцию хранения ФИО, таким образом выполняет только одну задачу (принцип Single responsibility) */
    
    public User(String firstName, String lastName, String middleName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
    }
    
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getMiddleName() {
        return middleName;
    }
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

}
/*Класс возможно расширить, не изменяя уже написанный код (пинцип Open-closed) */
/*Класс содержит только те методы, которые необходимы для реализации его функций (принцип Interface segregation) */
/*Классы teacher и student (https://github.com/SunshineSen/I-ll_definitely_understand_the_OOP/tree/main/Lec8_Sem/Home)
 * могут бфть использованы вместо User без нарушения поведения программы (принцип Liskov substitution)
 */