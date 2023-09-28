package java_tasks.model;

public class Horse extends Animals {
    protected String typeAnimal ="pack animal";

    public Horse(Integer id, String nicknameAnimal, String nameAnimal, String birthday, String commands, String typeAnimal)
    {
        super(id, nicknameAnimal, nameAnimal, birthday, commands);
        this.typeAnimal = typeAnimal;
    }
}
