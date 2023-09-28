package java_tasks.controller;

import java_tasks.model.*;
import java_tasks.server.*;

import java.util.Scanner;

public class AnimalController {

    protected AnimalsService animalsService = new AnimalsService();
    protected CamelService camelService = new CamelService();
    protected CatService catService = new CatService();
    protected DogService dogService = new DogService();
    protected DonkeyService donkeyService = new DonkeyService();
    protected HamsterService hamsterService = new HamsterService();
    protected HorseService horseService = new HorseService();

    Camel camel1 = new Camel(1, "Вася", "верблюд", "2021.01.23", "лежать, бег",
            "pack animal");
    Camel camel2 = new Camel(2, "ася", "верблюд", "2019.05.03", "лежать, бег",
            "pack animal");

    Camel camel3 = new Camel(3, "Петя", "верблюд", "2023.05.03", "лежать",
            "pack animal");

    Cat cat1 = new Cat(4, "Барсик", "кошка", "2011.05.03", "голос",
            "pet");

    Cat cat2 = new Cat(5, "Том", "кошка", "2016.05.03", "голос",
            "pet");

    Cat cat3 = new Cat(6, "Мурка", "кошка", "2006.09.03", "голос",
            "pet");


    Dog dog1 = new Dog(7, "Мухтар", "собака","2006.09.03",
            "голос, сидеть, лежать", "pet" );

    Dog dog2 = new Dog(8, "Шарик", "собака","2021.09.01",
            "голос, сидеть", "pet" );

    Hamster hamster1 = new Hamster(9, "Хома", "хомяк","2023.09.01","не знает",
            "pet");

    Hamster hamster2 = new Hamster(10, "Зина", "хомяк","2023.04.01","не знает",
            "pet");
    Horse horse1 = new Horse(11,"Карина", "лошадь","2019.06.08","направо(налево),марш",
            "pack animal");
    Horse horse2 = new Horse(12,"Арина", "лошадь","2019.08.08","направо(налево),марш",
            "pack animal");
    Donkey donkey1 = new Donkey(13,"Иа","осел","2009.09.08","марш",
            "pack animal");


public void makeList(){
    animalsService.addAnimal(camel1);
    animalsService.addAnimal(camel2);
    animalsService.addAnimal(camel3);
    animalsService.addAnimal(cat1);
    animalsService.addAnimal(cat2);
    animalsService.addAnimal(cat3);
    animalsService.addAnimal(dog1);
    animalsService.addAnimal(dog2);
    animalsService.addAnimal(hamster1);
    animalsService.addAnimal(hamster2);
    animalsService.addAnimal(horse1);
    animalsService.addAnimal(horse2);
    animalsService.addAnimal(donkey1);
}
    public void makeListDog(){
    dogService.AddAnimal(dog1);
    dogService.AddAnimal(dog2);
    }

    public void  makeListCat(){
    catService.addAnimal(cat1);
    catService.addAnimal(cat2);
    catService.addAnimal(cat3);
    }

    public void  makeListCamel(){
    camelService.addAnimal(camel1);
    camelService.addAnimal(camel2);
    camelService.addAnimal(camel3);
    }

    public void makeListHamster(){
    hamsterService.addAnimal(hamster1);
    hamsterService.addAnimal(hamster2);}

    public void makeListHorse(){
    horseService.addAnimal(horse1);
    horseService.addAnimal(horse2);
    }
    public void makeListDonkey(){
    donkeyService.addAnimal(donkey1);
    }

    public void printCamel(){
    camelService.printAnimal();
    }
    public void printAnimals(){animalsService.printAnimal();}
    public void printHorse(){horseService.printAnimal();}
    public void printDonkey(){donkeyService.printAnimal();}
    public void printDog(){dogService.printAnimal();}
    public void printHamster(){hamsterService.printAnimal();}
    public void printCat(){catService.printAnimal();}
    public int foundID(){
    return animalsService.foundId();}
    public void printCommands(){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    animalsService.printCommands(num);
    sc.close();}
    public void study(){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    animalsService.studyCommands(num);
    sc.close();
    }


    public void addNewAnimals(){
        System.out.println("Выберите цифру от 1 до 6");
        System.out.println("1 - верблюд");
        System.out.println("2 - лошадь");
        System.out.println("3 - осел");
        System.out.println("4 - кошка");
        System.out.println("5 - собака");
        System.out.println("6 - хомяк");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        if (num1==1){
            System.out.println("животное относиться к классу -Camel");
            System.out.println("Введите кличку животного nickname:");
            String nickname = scanner.next();
            System.out.println("Введите дату рождения birthday: ");
            String birthday = scanner.next();
            System.out.println("Введите команды,которые животное выполняет ");
            String commands = scanner.next();
            Integer id = foundID();

            Camel c = new Camel(id,nickname,"Camel",birthday,commands,
                    "pack animal" );
            camelService.addAnimal(c);
            animalsService.addAnimal(c);
            System.out.println("запись успешна создалась, посмотрите");
            animalsService.printAnimal();
        }


        if (num1==2){
            System.out.println("животное относиться к классу -Horse");
            System.out.println("Введите кличку животного ");
            String nickname = scanner.next();
            System.out.println("Введите дату рождения  ");
            String birthday = scanner.next();
            System.out.println("Введите команды,которые животное выполняет ");
            String commands = scanner.next();
            Integer id =foundID() ;

            Horse c = new Horse(id,nickname,"Horse",birthday,commands,
                    "pack animal" );
            horseService.addAnimal(c);
            animalsService.addAnimal(c);
            System.out.println("запись успешна создалась, посмотрите");
            animalsService.printAnimal();
    }

        if (num1==3){
            System.out.println("животное относиться к классу -Donkey");
            System.out.println("Введите кличку животного ");
            String nickname = scanner.next();
            System.out.println("Введите дату рождения  ");
            String birthday = scanner.next();
            System.out.println("Введите команды,которые животное выполняет ");
            String commands = scanner.next();
            Integer id =foundID() ;

            Donkey c = new Donkey(id,nickname,"Donkey",birthday,commands,
                    "pack animal" );
            donkeyService.addAnimal(c);
            animalsService.addAnimal(c);
            System.out.println("запись успешна создалась, посмотрите");
            animalsService.printAnimal();
        }
        if (num1==4){
            System.out.println("животное относиться к классу -Cat");
            System.out.println("Введите кличку животного ");
            String nickname = scanner.next();
            System.out.println("Введите дату рождения  ");
            String birthday = scanner.next();
            System.out.println("Введите команды,которые животное выполняет ");
            String commands = scanner.next();
            Integer id =foundID() ;

            Cat c = new Cat(id,nickname,"Cat",birthday,commands,
                    "pet" );
            makeList();
            animalsService.addAnimal(c);
            System.out.println("запись успешна создалась, посмотрите");
            animalsService.printAnimal();
        }
        if (num1==5){
            System.out.println("животное относиться к классу -Dog");
            System.out.println("Введите кличку животного ");
            String nickname = scanner.next();
            System.out.println("Введите дату рождения  ");
            String birthday = scanner.next();
            System.out.println("Введите команды,которые животное выполняет ");
            String commands = scanner.next();
            Integer id =foundID() ;
            Dog c = new Dog(id,nickname,"Dog",birthday,commands,
                    "pet" );
            dogService.addAnimal(c);
            animalsService.addAnimal(c);
            System.out.println("запись успешна создалась, посмотрите");
            animalsService.printAnimal();
        }
        if (num1==6){
            System.out.println("животное относиться к классу -hamster");
            System.out.println("Введите кличку животного ");
            String nickname = scanner.next();
            System.out.println("Введите дату рождения  ");
            String birthday = scanner.next();
            System.out.println("Введите команды,которые животное выполняет ");
            String commands = scanner.next();
            Integer id =foundID();


            hamsterService.addAnimal(new Hamster(id,nickname,"Hamster", birthday, commands,
                    "pet" ));
            animalsService.addAnimal(new Hamster(id,nickname,"Hamster", birthday, commands,
                    "pet" ));
            System.out.println("запись успешна создалась, посмотрите");
            animalsService.printAnimal();
        }
}
public  void menu (){
    System.out.println("добро пожаловать в питомник для животных");
    System.out.println("В нашем питомнике проживают такие виды животных как:");
    System.out.println("Лошади, Верблюды, Ослы, Кошки , собаки, хомяки");
    System.out.println("Введите цифру от 1 до 10 где ");
    System.out.println("1.Просмотреть всех животных, которые есть в питомнике ");
    System.out.println("2. Посмотреть Лошадей");
    System.out.println("3. Посмотреть Верблюдов");
    System.out.println("4. Посмотреть Ослов");
    System.out.println("5. Посмотреть Кошек");
    System.out.println("6. Посмотреть Собак");
    System.out.println("7. Посмотреть Хомяков");
    System.out.println("8. Посмотреть список комманд, которое может выполнить животное");
    System.out.println("9. Обучить животное командам");
    System.out.println("10. Завести новое животное");
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    switch (num){
        case 1:
            printAnimals();
            break;
        case 2:
            printHorse();
            break;
        case 3:
            printCamel();
            break;
        case 4:
            printDonkey();
            break;
        case 5:
            printCat();
            break;
        case 6:
            printDog();
            break;
        case 7:
            printHamster();
            break;
        case 8:
            System.out.println("Из появившегося списка выберите id животного");
            printAnimals();
            printCommands();
            break;
        case 9:
            System.out.println("На данный момент в нашем питомнике можно обучить новым командам только кошек и собак");
            System.out.println("В появившехся таблицах выберите id животного");
            printAnimals();
            System.out.println("Введите номер");
            study();
            break;

        case 10:
            addNewAnimals();
            break;}

    sc.close();
}
}


