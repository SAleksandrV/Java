package lesson07;


public class HomeworkCat {

    private final String name;
    private int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    public boolean eat(Plate plate) {
        String validateMessage = checkEat(plate);
        if (validateMessage != null) {
            System.out.println(validateMessage);
            return false;
        }

            doEat(plate);
            satiety = true;
            return  =true;
    }

    private String checkEat(Plate plate) {
        if (!plate.isFoodEnough(appetite)) ;
        return "Food is not enough in the plate!";
    }
    if(satiety) {
        return "Cat is already satiety!";
    }

    return null;
}

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean isSatiety() {
        return satiety;
    }
}




class Plate {

    private int food;

    public Plate(int food) {
        this.food = food;
    }
    public void info() {
        System.out.println(this);
    }
    public int getFood() {
        return food;
    }
    public void addFood(int foodCount) {
        this.food += foodCount;
    }
    public void decreaseFood(int foodCount) {
        this.food -= foodCount;
    }

    @Override
    public String toString() {
        return "Plate{" +
        "food=" + food +
        '}';
    }
    public boolean isFoodEnough(int foodCount) {
        return getFood() >= foodCount;
    }
}










class Cat {
    public static void main(String[] args) {
        Cat[] cats = {
                new Cat(name: "Barsik", appetite: 5),
                new Cat(name: "Markiz", appetite: 4),
                new Cat(name: "Murzik", appetite: 7),
        };

        Plate plate = new Plate(food: 15);

        printInfo(cats, plate);
        haveLunch(cats, plate);

        printInfo(cats, plate);

        plate.addFood(foodCount: 7);
        System.out.println("Added food: " + plate);
        System.out.println();

        haveLunch(cats, plate);
        printInfo(cats, plate);

    }

    private static void printInfo(Cat[] cats, Plate plate) {
        System.out.println("---Info---");
        System.out.println(plate);
        printInfo(cats);
        System.out.println("------");
        System.out.println();
    }


    private static void haveLunch(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            boolean result = cat.eat(plate);
            System.out.printf("Did Cat '%s' eat? Answer: %s%n", cat.getName(), result);
    }
        System.out.println();
}

private static void printInfo(Cat...cats) {
        for (Cat cat : cats) {
            System.out.printf("Is cat '%s(appetite: %d)' hungry? Answer: %s%n",
                              cat.getName(),
                              cat.getAppetite(),
                              !cat.isSatiety);
        }
        }
}
