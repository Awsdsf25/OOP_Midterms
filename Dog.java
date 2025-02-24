class Dog {
    private String name;
    private String breed;


    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void displayInfo() {
        System.out.println("Dog Name: " + name + ", Breed: " + breed);
    }

    public static void main(String[] args) {

        Dog dog1 = new Dog("Doggy", "Labrador");
        Dog dog2 = new Dog("TigerCommando", "Bulldog");


        dog1.displayInfo();
        dog2.displayInfo();


        dog1.setName("Douglas");
        dog1.setBreed("Golden Retriever");

        dog2.setName("Browny");
        dog2.setBreed("Beagle");


        System.out.println("\nAfter updating values:");
        dog1.displayInfo();
        dog2.displayInfo();
    }
}
