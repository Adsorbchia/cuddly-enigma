package java_tasks.model;

public class Cat extends Animals {
    protected String typeAnimal ="pet";

    public Cat(Integer id, String nicknameAnimal, String nameAnimal, String birthday, String commands, String typeAnimal)
    {
        super(id, nicknameAnimal, nameAnimal, birthday, commands);
        this.typeAnimal = typeAnimal;
    }
}
