class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
    public long count() {
        return people.size();
    }
}

class PeopleStats {
    private final List<Person> people;

    public PeopleStats(Path inputFilePath) {
        try {
            people = Files.lines(inputFilePath)
                    .map(line -> line.split("\t"))
                    .map(chunks -> new Person(chunks[0], chunks[1]))
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new IllegalStateException(e);
        }
    }

    public static void main(String[] args) {
        PeopleStats peopleStats = new PeopleStats(Paths.get("śćieżka", "do", "pliku"));

        System.out.println(String.format("Liczba osób: %d", peopleStats.count()));
    }
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