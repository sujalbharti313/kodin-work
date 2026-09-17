class Animal 
{
    String name;

    void show()
    {
        System.out.println("Inside show method");
        System.out.println("Name:"+name);
    }
}
class Dog extends Animal
{
    int age;
    void Eat()
    {
        System.out.println("Eats Dog food");
    }
}

class untitled
{
    public static void main(String[] args)
    {
        Animal a1=new Animal();
        a1.name="Big Animal";

        Dog d1=new Dog();
        d1.name="Dog";
        d1.show();
        d1.Eat();
    }
}