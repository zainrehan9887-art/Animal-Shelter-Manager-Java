public class Animal {
    String name;
    String species;
    int age;
    boolean isVacinated;
    public Animal(String name, String species, int age, boolean isVacinated) {
        this.name = name;
        this.species = species;
        this.age = age;
        this.isVacinated = isVacinated;
    }
    void display(){
        System.out.println("---Shelter Resident--");
        System.out.println("Name: " + name);
        System.out.println("Species: " + species);
        System.out.println("Age: " + age + " years old");
        System.out.println("Vaccinated: " + (isVacinated ? "Yes" : "No"));
     } 
     public static void main(String[] args){
        Animal pet1 = new Animal("Buddy", "Dog",3 , true);
        Animal pet2 = new Animal("Tiger", "Cat",2 , false);
        pet1.display();
        pet2.display();
     }
}
