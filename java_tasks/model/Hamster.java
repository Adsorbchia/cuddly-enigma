package java_tasks.model;

public class Hamster extends Animals {
    protected String typeAnimal ="pet";

    public Hamster(Integer id, String nicknameAnimal, String nameAnimal, String birthday, String commands, String typeAnimal)
    {
        super(id, nicknameAnimal, nameAnimal, birthday, commands);
        this.typeAnimal = typeAnimal;
    }
}

