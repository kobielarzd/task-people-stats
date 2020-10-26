class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

class PeopleStats {

}

class Person {
    private final String firstName;

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    private final String lastName;

    public Person(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }
}