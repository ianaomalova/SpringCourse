package spring_introduction;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

//    public Person(Pet pet) {
//        System.out.println("Person bean is created");
//        this.pet = pet;
//    }


    //constructor without params
    public Person() {
        System.out.println("Person bean is created");
    }

    //getter pet
    public Pet getPet() {
        return pet;
    }


    //setter pet
    public void setPet(Pet pet) {
        System.out.println("Class Person: Set Pet");
        this.pet = pet;
    }

    //setter surname
    public void setSurname(String surname) {
        System.out.println("Class Person: Set Surname");
        this.surname = surname;
    }

    //setter age
    public void setAge(int age) {
        System.out.println("Class Person: set age");
        this.age = age;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public void callYourPet() {
        System.out.println("Hello, my lovely Pet!");
        pet.say();
    }
}
