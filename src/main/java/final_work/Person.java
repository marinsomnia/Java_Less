package final_work;

//Создать класс Person.
// У класса должны быть поля:
// 1. Имя (String)
//2. Фамилия (String)
// 3. Возраст (продумать тип)
//4. Пол
// 5*. Придумать свои собственные поля

//Для этого класса
// 1. Реализовать методы toString, equals и hashCode.
//2*. Придумать собственные методы и реализовать их

import java.util.Objects;

//В мейне создать массив Person'ов. В цикле отобрать Person'ов старше 20 лет и вывести их на экран.
public class Person {
    String name;
    String surname;
    int age;
    String gender;
    String phone_number;

    public Person(String name, String surname, int age, String gender,  String phone_number) { // конструктор класса
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
        this.phone_number = phone_number;
    }
    public String getName() { // метод класса
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void sayHello() {
        System.out.println("Привет! Меня зовут " + name + " " + surname);
    }
    @Override
    public boolean equals(Object obj) {

        if (obj == null) {
            return false;
        }
        boolean objIsPerson = obj instanceof Person;
        if (!objIsPerson) {
            return false;
        }

        Person anotherPerson = (Person) obj;
        return Objects.equals(name, anotherPerson.name)
                && Objects.equals(surname, anotherPerson.surname)
                && Objects.equals(gender, anotherPerson.gender)
                && Objects.equals(phone_number, anotherPerson.phone_number)
                && age == anotherPerson.age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender, phone_number);
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %s %s", name, surname, age, gender, phone_number);
    }
}
