class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {

        Person[] people = {
                new Person("Ariel", 20, "Manila"),
                new Person("Josh", 19, "Pampanga"),
                new Person("Ice", 17, "Davao"),
                new Person("Terrence", 12, "Quezon City"),
                new Person("Carlo", 29, "Baguio")
        };

        for (Person p : people) {
            p.displayInfo();
        }
    }
}
