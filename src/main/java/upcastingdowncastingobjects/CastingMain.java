/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package upcastingdowncastingobjects;

/**
 *
 * @author Ishmael
 */
public class CastingMain {

    public static void main(String args[]) {
        Animal myAnimal = new Dog();  //  Upcasting new Dog to parent: Animal    
        doAnimalStuff(myAnimal);
    }

    public static void doAnimalStuff(Animal animal) {
        if (animal instanceof Cat) {   // Avoid class cast exception
            Cat mycat = (Cat) animal; //Downcasting  Animal to Cat
            mycat.makeNoise();
            mycat.meow();             //do what Cats do
        } 
        else if (animal instanceof Dog) {   
            Dog mydog = (Dog) animal;
            mydog.makeNoise();
            mydog.growl();           //do what Dogs do
        }
    }
}
