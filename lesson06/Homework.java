package lesson06;

abstract class Animals {
    protected String name;
    private int run;
    private double jump;


    public Animals(String name, int run, double jump) {
        super();
        this.name = name;
        this.run = run;
        this.jump = jump;
    }
    public String getName() {
        return name;
    }

    public int getRun() {
        return run;
    }
    public void setRun(int run) {
        this.run = run;
    }
    public double getJump() {
        return jump;
    }
    public void setJump(double jump) {
        this.jump = jump;
    }

    public  void printInfo() {
        System.out.printf("Кличка = %s; Дистанция бега = %d; Высота прыжка = %d%n",
                          getName(),
                          getRun(),
                          getJump());
    }
    public void voice() {
        System.out.println("Животное издаёт звуки");
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", run=" + run + '\'' +
                ", jump=" + jump +
                '}';
    }
}



public class Cat extends Animals {
    private int age;

    public Cat(String name, int run, double jamp, int age) {
        super(name, run, jamp);
        this.age = age;
    }
    public Cat(String name, int run, double jamp) {
        this(name, run, jamp, age:0);
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public void printInfo() {
        System.out.printf("Кличка = %s; Дистанция бега = %d; Высота прыжка = %d; Возраст = %d%n",
                          getName(),
                          getRun(),
                          getJump(),
                          getAge());
    }
    @Override
    public void voice() {
        super.voice();
        System.out.println("Мяу");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                '}';
    }
}



public class Dog extends Animals {
    private int swim;

    public Dog(String name, int run, double jamp, int swim) {
        super(name, run, jamp);
        this.swim = swim;
    }

    public Dog(String name, int run, double jamp) {
        this(name, run, jamp, swim:0);
    }

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    @Override
    public void printInfo() {
        System.out.printf("Кличка = %s; Дистанция бега = %d; Высота прыжка = %d; Дистанция плаванья = %d%n",
                          getName(),
                          getRun(),
                          getJump(),
                          getSwim());
    }
    @Override
    public void voice() {
        super.voice();
        System.out.println("Гав");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "swim=" + swim +
                '}';
    }
}

    public static void main(String[] args) {
        Animals animals = new Animals(name:"Кличка животного", run:1000, jump:10);
        Cat cat = new Cat(name:"Барсик", run:200, jump:2, age:5);
        Dog dog = new Dog(name:"Шарик", run:500, jump:0,5, swim:10);

        cat.printInfo();
        dog.printInfo();

    }