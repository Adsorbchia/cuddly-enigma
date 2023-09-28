package java_tasks.server;

import java_tasks.model.Animals;
import java_tasks.model.Hamster;
import java_tasks.model.Horse;

import java.util.ArrayList;
import java.util.Iterator;

public class HorseService implements GeneralMethods{


    protected ArrayList<Horse>horses;

    public HorseService() {
        this.horses = new ArrayList<>();}

    @Override
    public void addAnimal(Animals item) {}

    public void addAnimal(Horse item){
        horses.add(item);}

    @Override
    public void deleteAnimal(int idAnimals){
        Iterator<Horse> iterator= horses.iterator();
        while (iterator.hasNext()){
        Horse e=iterator.next();
        if(e.getId()==idAnimals){
            iterator.remove();}}}

    @Override
    public void printAnimal() {
        if(horses.size()==0){
            System.out.println("В данный момент все животные на зимовке в другом питомнике");}
        else {Iterator<Horse> iterator= horses.iterator();
            while (iterator.hasNext()){
                Horse e = iterator.next();
                System.out.println(e);}}}

    @Override
    public void printCommands(int idAnimal) {

    }
}
