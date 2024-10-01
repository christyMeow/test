import java.util.*;

public class Hero {
    public String name;
    public int age;
    public boolean gender;
    public String superpower;
    public int greetingCounts;

    public Hero(String name, int age, boolean gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        if (gender == false) {
            if (age < 40) this.superpower = "TimeTravel";
            else this.superpower = "invulnerability";
        } else {
            if (age < 40) this.superpower = "Precognition";
            else this.superpower = "healing";
        }
    }

    public Hero() {
            Random random = new Random();
            this.name = (char) (random.nextInt(26) + 'A') + "" + (char) (random.nextInt(26) + 'A');
            this.age = random.nextInt(85) + 5;
            this.gender = random.nextBoolean();
            if (gender == false) {
                if (age < 40) this.superpower = "TimeTravel";
                else this.superpower = "invulnerability";
            } else {
                if (age < 40) this.superpower = "Precognition";
                else this.superpower = "healing";
            }

        }

        public void greeting(Hero anotherhero){
            if (!(anotherhero == null || this.equals(anotherhero))) {
                //checks if "this" is the same object as anotherHero;
                // cuz object is a pointer, cannot compare
                System.out.println("Greeting-" + greetingCounts + " from " + "Hero-" + this.name + ": Hi"
                        + "Hero-" + anotherhero.name + ", Im" + this.name
                        + ", my superpower is " + this.superpower);
                this.greetingCounts++;
            }
        }
        public static void main(String[] args){
            Hero hero1 = new Hero("Peter", 18, false);
            Hero anotherhero = new Hero();
            hero1.greeting(anotherhero);
    }


        }







