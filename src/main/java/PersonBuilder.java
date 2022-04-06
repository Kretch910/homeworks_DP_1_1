public class PersonBuilder {

    private String name;
    private String surname;
    private int age;
    private String address;

    public PersonBuilder() {
        age = -1;
    }

    public PersonBuilder(String name, String surname, int age, String address) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.address = address;
    }

    public PersonBuilder setName(String name) {
        this.name = name;

        return new PersonBuilder(name, surname, age, address);
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;

        return new PersonBuilder(name, surname, age, address);
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new NegativeAgeException();
        }
        this.age = age;

        return new PersonBuilder(name, surname, age, address);
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;

        return new PersonBuilder(name, surname, age, address);
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new FewOptionsException();
        }
        if (age == -1 && address == null) {
            return new Person(name, surname);
        }
        if (address == null) {
            return new Person(name, surname, age);
        }
        return new Person(name, surname, age, address);
    }

}
