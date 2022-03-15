package OrderByAge;

public class Person {
    String name;
    String id;
    int age;

    public Person(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getId() {
        return this.id;
    }
}
