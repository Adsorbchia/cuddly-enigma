package java_tasks.model;

public class Animals {
    protected Integer id;
    protected String nicknameAnimal;
    protected String nameAnimal;
    protected String birthday;
    protected String commands;

    public Animals(Integer id, String nicknameAnimal, String nameAnimal, String birthday, String commands) {
        this.id = id;
        this.nicknameAnimal = nicknameAnimal;
        this.nameAnimal = nameAnimal;
        this.birthday = birthday;
        this.commands = commands;}


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNicknameAnimal() {
        return nicknameAnimal;
    }

    public void setNicknameAnimal(String nicknameAnimal) {
        this.nicknameAnimal = nicknameAnimal;
    }

    public String getNameAnimal() {
        return nameAnimal;
    }

    public void setNameAnimal(String nameAnimal) {
        this.nameAnimal = nameAnimal;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getCommands() {
        return commands;
    }

    public void setCommands(String commands) {
        this.commands = commands;
    }


    @Override
    public String toString() {
        return "Animals{" +
                "id=" + id +
                ", кличка животного='" + nicknameAnimal + '\'' +
                ", порода='" + nameAnimal + '\'' +
                ", дата рождения='" + birthday + '\'' +
                ", команды ='" + commands + '\'' +
                '}';
    }
}



