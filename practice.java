class Armstrong{
  public static void main(String[] args){
    int sumofcubes =0,a,temp;
    int num = 153;
    temp = num;
    while(num > 0){
      a = num %10;
      num = num/10;
      sumofcubes = sumofcubes+ (a*a*a);
    }
    if(sumofcubes == num){
      System.out.println("armstrong number");
    }
    else{
      System.out.println("not a armstrong number");
    }
  }
}
// program on inheritance like inherit the method from another class
class Animal{
    void eat(){
        System.out.println("Animals often eat to survive");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cats says meow!");
    }
}
class Fox extends Animal{
    void eyes(){
        System.out.println("cat eyes shines in the night like ghost");
    }
}
class Bear extends Animal{
    void skin(){
        System.out.println("cat skin is hairy");
    }
}
class Lion extends Animal{
    void nails(){
        System.out.println("nails are very sharp");
    }
}
class Dog extends Animal{
    void sound(){
        System.out.println("dogs  barks");
    }
}
public class Main{
    public static void main(String[] args){
        Cat cat = new Cat();
        Fox fox = new Fox();
        Lion lion = new Lion();
        Bear bear = new Bear();
        Dog dog = new Dog();
        cat.eat();
        cat.sound();
        fox.eyes();
        bear.skin();
        lion.nails();
        dog.sound();
    }
}
// program on polymorphism
class Classic{
  void complaints(){
    System.out.println("waste hostel");
  }
}
class Food extends Classic{
  void complaints(){
    System.out.println("waste food hostel");
  }
}
class Parking extends Classic{
  void complaints(){
    System.out.println("No parking in  hostel");
  }
}
class Rooms extends Classic{
  void complaints(){
    System.out.println("no clean rooms in hostel");
  }
}
class Water extends Classic{
  void complaints(){
    System.out.println("no proper water in hostel");
  }
}
class Management extends Classic{
  void complaints(){
    System.out.println("waste management in  hostel");
  }
}
public class Main{
  public static void main(String[] args){
    Classic food = new Food();
    Classic parking = new Parking();
    Classic rooms = new Rooms();
    Classic water = new Water();
    Classic management = new Management();
    food.complaints();
    parking.complaints();
    rooms.complaints();
    water.complaints();
    management.complaints();
  }
}
// program on encapsulation means wrapping up of adata and code into a single unit is said to be a encapsukation
class Cse{
  private double  balance;
  public void deposit(double amount){
    balance += amount;
  }
public double getBalance(){
  return balance;
}
}
public class Main{
  public static void main(String[] Args){
    Bankaccount account = new Bankaccount();
    account.deposit(100.0);
    System.out.println("balance:"+account.getBalance());
  }
}
    
