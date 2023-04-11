package final_work;

public class Main {
    public static void main(String[] args) {

        Person[] people = new Person[]{new Person("Илья", "Иванов", 40, "M", "89164565645"),
                new Person("Константин", "Иванов", 22, "M", "89112331213"),
                new Person("Александра", "Пашкова", 30, "F", "89033453432"),
                new Person("Евгений", "Сидоров", 18, "M", "89774564546"),
                new Person("Мария", "Васильева", 25, "F", "89442346778"),

        };

        for (Person person : people) {
            if (person.getAge() > 20) {
                System.out.println(person);
            }
        }

        for (Person person : people) {
            if (person.getGender() == "M") {
                person.sayHello();
            }
        }
    }
}
