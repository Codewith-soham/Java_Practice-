class Animal{
    void sound(){
        System.out.println("Animal makes sound ");
    }
}

class Dog extends Animal{
    void sound(){                               //Overiding the sound function 
        System.out.println("Dog makes bark sound");
    }
}


public class OverRiding {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}
