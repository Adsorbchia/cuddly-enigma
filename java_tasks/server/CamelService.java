package java_tasks.server;

import java_tasks.model.Animals;
import java_tasks.model.Camel;

import java.util.ArrayList;
import java.util.Iterator;

public class CamelService implements GeneralMethods{
    protected ArrayList<Camel> camels;

    public CamelService() {
        this.camels = new ArrayList<>();
    }

    @Override
    public void addAnimal(Animals item) {}
    public void addAnimal(Camel item) {
        camels.add(item);}

    @Override
    public void deleteAnimal(int idAnimals) {
        Iterator<Camel> iterator= camels.iterator();
        while (iterator.hasNext()){
            Camel e=iterator.next();
            if(e.getId()==idAnimals){
                iterator.remove();}}}


    @Override
    public void printAnimal() {
        if(camels.size()==0){
            System.out.println("В данный момент все животные на зимовке в другом питомнике");}
        else {
            Iterator<Camel> iterator= camels.iterator();
            while (iterator.hasNext()){
                Camel e = iterator.next();
                System.out.println(e);}}}



    public void printCommands(int idAnimal){
        Iterator<Camel> iterator= camels.iterator();
        while (iterator.hasNext()){
            Camel e=iterator.next();
            if(e.getId()==idAnimal){
                System.out.println(e.getCommands());}

    }
}}
