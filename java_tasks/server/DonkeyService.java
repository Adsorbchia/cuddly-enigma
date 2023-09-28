package java_tasks.server;

import java_tasks.model.Animals;
import java_tasks.model.Dog;
import java_tasks.model.Donkey;

import java.util.ArrayList;
import java.util.Iterator;

public class DonkeyService implements GeneralMethods{
    protected ArrayList<Donkey> donkeys;

    public DonkeyService() {
        this.donkeys = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animals item) {}

    public void addAnimal(Donkey item){
        donkeys.add(item);
    }

    @Override
    public void deleteAnimal(int idAnimals) {
        Iterator<Donkey> iterator= donkeys.iterator();
        while (iterator.hasNext()){
            Donkey e=iterator.next();
            if(e.getId()==idAnimals){
                iterator.remove();}}}

    @Override
    public void printAnimal()
    {if(donkeys.size()==0){
        System.out.println("В данный момент все животные на зимовке в другом питомнике");}
    else {Iterator<Donkey> iterator= donkeys.iterator();
        while (iterator.hasNext()){
            Donkey e = iterator.next();
            System.out.println(e);}}}

    @Override
    public void printCommands(int idAnimal) {

    }



}

