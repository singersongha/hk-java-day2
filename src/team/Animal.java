package team;

public abstract class Animal {
    public String name;
    public int age;

    public Animal(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

//    추상적
    public abstract void sound();
}

