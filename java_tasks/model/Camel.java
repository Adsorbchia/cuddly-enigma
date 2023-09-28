package java_tasks.model;

public class Camel extends Animals {
    protected String typeAnimal = "pack animal";

    public Camel(Integer id, String nicknameAnimal, String nameAnimal, String birthday, String commands, String typeAnimal)
    {super(id, nicknameAnimal, nameAnimal, birthday, commands);
        this.typeAnimal = typeAnimal;}

    @Override
    public String toString() {
        return "Camel {" +
                "id=" + id +
                ", кличка животного='" + nicknameAnimal + '\'' +
                ", порода='" + nameAnimal + '\'' +
                ", дата рождения='" + birthday + '\'' +
                ", команды ='" + commands + '\'' +
                '}';
    }
}




