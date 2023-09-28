package java_tasks.server;

import java_tasks.model.*;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AnimalsService implements GeneralMethods{
    public ArrayList<Object> getAnimals() {
        return animals;
    }

    protected ArrayList<Object> animals;

    public AnimalsService() {
        this.animals = new ArrayList<Object>();}


    @Override
    public void addAnimal(Animals item) {
    }

    public void addAnimal(Camel item){
        animals.add(item);
    }
    public void addAnimal(Horse item){
        animals.add(item);
    }
    public void addAnimal(Cat item){
        animals.add(item);
    }
    public void addAnimal(Dog item){
        animals.add(item);
    }
    public void addAnimal(Hamster item){
        animals.add(item);
    }
    public void addAnimal(Donkey item){
        animals.add(item);
    }


    @Override
    public void deleteAnimal(int idAnimals) {
        for (int index =0; index<animals.size(); index++){
            if (idAnimals==index+1){
                animals.remove(index);}}}

    @Override
    public void printAnimal() {
        if(animals.size()==0){
            System.out.println("В данный момент все животные на зимовке в другом питомнике");}
        else {for (int i =0; i <animals.size(); i++){
            System.out.println(animals.get(i));}
        }}

    @Override
    public void printCommands(int idAnimal) {
        for (int index =0; index<animals.size(); index++){
            if (idAnimal==index+1) {
                System.out.println(animals.get(index));}}}

    public void studyCommands(int idA){
            if(animals.get(idA-1) instanceof Cat){
                System.out.println("Кошечка, голос");
                System.out.println("Мяу");}
            if(animals.get(idA-1)instanceof Dog){
                System.out.println("голос");
                System.out.println("гав, гав");}
            else {
                System.out.println("Другие животные пока не готовы к обучению, спасибо за понимание");
            }


    }

    public int foundId(){
       int ID = animals.size()+1;
       return ID;}


}
