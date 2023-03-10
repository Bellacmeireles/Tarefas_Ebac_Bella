package Modulo11.TarefaMod11;

import java.util.ArrayList;
import java.util.List;

public class MaleAndFemale {

    public static void main(String[] args) {
        gendersTogether();
        separatingByGender();
    }

    private static void gendersTogether() {
        System.out.println("****** Group of genders together ******");
        List<NameAndGender> group1 = new ArrayList<NameAndGender>();
        NameAndGender a = new NameAndGender("Ana", "Female");
        NameAndGender b = new NameAndGender("Bella", "Female");
        NameAndGender c = new NameAndGender("Caio", "Male");
        NameAndGender d = new NameAndGender("Samuel", "Male");
        group1.add(a);
        group1.add(b);
        group1.add(c);
        group1.add(d);
        
        System.out.println("Genders Together: " + group1);
        System.out.println("");

    }

    private static void separatingByGender() {
        System.out.println("****** Separating by gender ******");
        List<NameAndGender> group1 = new ArrayList<NameAndGender>();
        NameAndGender a = new NameAndGender("Ana", "Female");
        NameAndGender b = new NameAndGender("Bella", "Female");
        NameAndGender c = new NameAndGender("Caio", "Male");
        NameAndGender d = new NameAndGender("Samuel", "Male");
        group1.add(a);
        group1.add(b);
        group1.add(c);
        group1.add(d);

        List<NameAndGender> male = new ArrayList<NameAndGender>();
        List<NameAndGender> female = new ArrayList<NameAndGender>();
        for (NameAndGender ng : group1) {
            if (ng.getGender().equals("Female")) {
                female.add(ng);
            } else if (ng.getGender().equals("Male")) {
                male.add(ng);
            }
        }
        
        System.out.println("By gender Male: " + male);
        System.out.println("");
        System.out.println("By gender Female: " + female);
        System.out.println("");
    }

}
