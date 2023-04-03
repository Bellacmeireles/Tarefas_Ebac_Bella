package Modulo11e12.TarefaMod11;

public class NameAndGender {
    private String name;
    private String gender;

    public NameAndGender(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    // get&set de name
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // get&set de gender
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    @Override
    public String toString() {
        return "name: '" + name + '\'' + 
               ", gender: '" + gender + '\'';       
    }

}
