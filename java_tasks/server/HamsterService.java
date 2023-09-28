package java_tasks.server;

import java_tasks.model.Animals;
import java_tasks.model.Donkey;
import java_tasks.model.Hamster;

import java.util.ArrayList;
import java.util.Iterator;

public  class HamsterService implements GeneralMethods{

    protected ArrayList<Hamster>hamsters;

    public HamsterService() {
        this.hamsters = new ArrayList<>();}

    @Override
    public void addAnimal(Animals item) {}

    public void addAnimal(Hamster item){
        hamsters.add(item);
    }


    @Override
    public void deleteAnimal(int idAnimals) {
        Iterator<Hamster> iterator= hamsters.iterator();
        while (iterator.hasNext()){
            Hamster e=iterator.next();
            if(e.getId()==idAnimals){
                iterator.remove();}}}

    @Override
    public void printAnimal(){
        if(hamsters.size()==0){
        System.out.println("В данный момент все животные на зимовке в другом питомнике");}
        else {Iterator<Hamster> iterator= hamsters.iterator();
        while (iterator.hasNext()){
            Hamster e = iterator.next();
            System.out.println(e);}}}

    @Override
    public void printCommands(int idAnimal) {

    }


    public void studyCommands(){
        System.out.println("Увы хомяки не обучаемы");
    }
}

