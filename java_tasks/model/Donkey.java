package java_tasks.model;

public class Donkey extends Animals{
    protected String typeAnimal= "pack animal";


    public Donkey(Integer id, String nicknameAnimal, String nameAnimal, String birthday, String commands, String typeAnimal)
    {
        super(id, nicknameAnimal, nameAnimal, birthday, commands);
        this.typeAnimal = typeAnimal;
    }
}
