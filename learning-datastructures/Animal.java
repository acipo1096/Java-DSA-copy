public class Animal {
    
    String name;
    String type;
    String gender;
    int age;
    int weight;

    public Animal(String name,String type,String gender,int age,int weight) {
        super();
        this.name = name;
        this.type = type;
        this.gender = gender;
        this.age = age;
        this.weight = weight;
    }

    public void sign(){
        System.out.println("This is " + name);
        System.out.println(name + " is a " + type);
        System.out.println(name + " is " + gender);
        System.out.println(name + " is " + age + " years old.");
        System.out.println(name + " weighs " + weight + " pounds.");
    }

    public void eat(){
        System.out.println(name + ", the " + type + ", is hungry! Nom nom nom.");
    }

    public void sleep(){
        System.out.println(name + " is tired. Zzzzzzzzzzz...");
    }

    public void swim(){
        System.out.println(name + " can swim!");
    }

    public void fly(){
        System.out.println(name + " can fly! Woah!");
    }
}
