import java.util.Objects;

public class Person {

    private final String name;
    private final String surname;
    private int age;
    private String address;


    public Person(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        age = -1;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public void happyBirthday() {
        age++;
    }

    public boolean hasAge() {
        return age != -1;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean hasAddress() {
        return address != null;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder(null, surname, 0, address);
        //подойдёт только для новорождённых, усыновлённые начнут свою жизнь заново ))
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Name: ");
        sb.append(name);
        sb.append("\n");
        sb.append("Surname: ");
        sb.append(surname);
        sb.append("\n");
        sb.append("Age: ");
        sb.append(age == -1 ? "unknown" : age);
        sb.append("\n");
        sb.append("Address: ");
        sb.append(address == null ? "unknown" : address);
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name) && surname.equals(person.surname) && Objects.equals(address, person.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, address);
    }
}
