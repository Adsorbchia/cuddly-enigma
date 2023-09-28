package java_tasks.server;

import java_tasks.model.Animals;
import java_tasks.model.Camel;
import java_tasks.model.Cat;
import java_tasks.model.Dog;

import java.util.ArrayList;
import java.util.Iterator;

public class CatService implements GeneralMethods {

    protected ArrayList<Cat> cats;

    public CatService() {
        this.cats = new ArrayList<>();}

    @Override
    public void addAnimal(Animals item) {}

    public void addAnimal(Cat item){
        cats.add(item);
    }

    @Override
    public void deleteAnimal(int idAnimals) {
        Iterator<Cat> iterator= cats.iterator();
        while (iterator.hasNext()){
            Cat e=iterator.next();
            if(e.getId()==idAnimals){
                iterator.remove();}}}

    @Override
    public void printAnimal()
    {if(cats.size()==0){
        System.out.println("В данный момент все животные на зимовке в другом питомнике");}
    else {Iterator<Cat> iterator= cats.iterator();
        while (iterator.hasNext()){
            Cat e = iterator.next();
            System.out.println(e);}}}

    @Override
    public void printCommands(int idAnimal) {


}}
