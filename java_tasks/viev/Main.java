package java_tasks.viev;

import java_tasks.controller.AnimalController;

public class Main {
    public static void main(String[] args){
        AnimalController animalController = new AnimalController();
        animalController.makeList();
        animalController.makeListCamel();
        animalController.makeListCat();
        animalController.makeListDog();
        animalController.makeListHamster();
        animalController.makeListDonkey();
        animalController.makeListHorse();
        animalController.menu();}}
