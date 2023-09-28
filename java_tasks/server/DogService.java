package java_tasks.server;

import java_tasks.model.Animals;
import java_tasks.model.Cat;
import java_tasks.model.Dog;

import java.util.ArrayList;
import java.util.Iterator;

public class DogService implements GeneralMethods {
    protected ArrayList<Dog> dogs;


    public DogService() {
        this.dogs = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animals item) {}

    public void  AddAnimal(Dog item){
        dogs.add(item);
    }

    @Override
    public void deleteAnimal(int idAnimals) {
        Iterator<Dog> iterator= dogs.iterator();
        while (iterator.hasNext()){
            Dog e=iterator.next();
            if(e.getId()==idAnimals){
                iterator.remove();}}}

    @Override
    public void printAnimal() {
        {if(dogs.size()==0){
            System.out.println("В данный момент все животные на зимовке в другом питомнике");}
        else {Iterator<Dog> iterator= dogs.iterator();
            while (iterator.hasNext()){
                Dog e = iterator.next();
                System.out.println(e);}}}}

    @Override
    public void printCommands(int idAnimal) {
    }


}
