/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polymorphism;

/**
 *
 * @author egese
 */
class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String speak(){
        return "Animal is speaking now...";
    }
}
class Cat extends Animal{
    
    public Cat(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName()+" meow"; 
    }
    
}
class Dog extends Animal{
    
    public Dog(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return this.getName()+" is barking"; 
    }
}
class Horse extends  Animal{
    
        public Horse(String name) {
            super(name);
        }

        @Override
        public String speak() {
            return super.getName()+" is neighing";
        }
    
}

public class Main {

    public static void tospeak(Animal animal){
        System.out.println(animal.speak());
    }
    public static void main(String[] args) {
        Animal animal1=new Cat("Limon");
        Animal animal2=new Dog("Karabaş");
        Animal animal3=new Horse("Cindy");
        /*
        System.out.println(animal1.speak());
        System.out.println(animal2.speak());
        System.out.println(animal3.speak());*/
        
        tospeak(animal1);
        tospeak(animal2);
        tospeak(animal3);
        
        
    }
    
}
