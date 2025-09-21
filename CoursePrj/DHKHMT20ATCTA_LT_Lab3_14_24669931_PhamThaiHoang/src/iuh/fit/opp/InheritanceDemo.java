package iuh.fit.opp;

public class InheritanceDemo {
	// Enum đại diện giới tính
	public enum Gender {
	    MALE("Male"),
	    FEMALE("Female");

	    private final String gender;

	    Gender(String gender) {
	        this.gender = gender;
	    }

	    @Override
	    public String toString() {
	        return gender;
	    }
	}

	// Enum đại diện môi trường sống của cá
	public enum HabitableWater {
	    SALTWATER("Saltwater"),
	    FRESHWATER("Freshwater"),
	    BRACKISHWATER("Brackishwater");

	    private final String habitableWater;

	    HabitableWater(String habitableWater) {
	        this.habitableWater = habitableWater;
	    }

	    @Override
	    public String toString() {
	        return habitableWater;
	    }
	}

	// Enum đại diện màu lông của mèo
	public enum FurColor {
	    SOLID("Solid"),
	    PATTERN("Pattern");

	    private final String furColor;

	    FurColor(String furColor) {
	        this.furColor = furColor;
	    }

	    @Override
	    public String toString() {
	        return furColor;
	    }
	}

	// Lớp trừu tượng đại diện cho động vật
	public abstract class Animal {
	    private Gender gender;
	    private int age;

	    // Constructor mặc định
	    public Animal() {}

	    // Constructor có tham số
	    public Animal(Gender gender, int age) {
	        this.gender = gender;
	        this.age = age;
	    }

	    // Getter và Setter cho gender
	    public Gender getGender() {
	        return gender;
	    }

	    public void setGender(Gender gender) {
	        this.gender = gender;
	    }

	    // Getter và Setter cho age
	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    // Phương thức trừu tượng để phát ra âm thanh
	    public abstract void makeSound();

	    // Kiểm tra xem động vật có già không
	    public boolean isOld() {
	        return age > 10;
	    }
	}

	// Lớp đại diện cho cá, kế thừa từ Animal
	public class Fish extends Animal {
	    private HabitableWater habitableWater;

	    public Fish() {}

	    public Fish(Gender gender, int age, HabitableWater habitableWater) {
	        super(gender, age);
	        this.habitableWater = habitableWater;
	    }

	    public HabitableWater getHabitableWater() {
	        return habitableWater;
	    }

	    public void setHabitableWater(HabitableWater habitableWater) {
	        this.habitableWater = habitableWater;
	    }

	    @Override
	    public void makeSound() {
	        System.out.println("Blub blub");
	    }
	}

	// Lớp đại diện cho mèo, kế thừa từ Animal
	public class Cat extends Animal {
	    private FurColor furColor;

	    public Cat() {}

	    public Cat(Gender gender, int age, FurColor furColor) {
	        super(gender, age);
	        this.furColor = furColor;
	    }

	    public FurColor getFurColor() {
	        return furColor;
	    }

	    public void setFurColor(FurColor furColor) {
	        this.furColor = furColor;
	    }

	    @Override
	    public void makeSound() {
	        System.out.println("Meow");
	    }
	}

	// Lớp kiểm thử chương trình
	public class Test {
	    public static void main(String[] args) {
	        // Tạo một con mèo
	        Cat cat = new Cat(Gender.FEMALE, 3, FurColor.PATTERN);
	        cat.makeSound();
	        System.out.println("Cat gender: " + cat.getGender());
	        System.out.println("Cat fur color: " + cat.getFurColor());

	        // Tạo một con cá
	        Fish fish = new Fish(Gender.MALE, 2, HabitableWater.FRESHWATER);
	        fish.makeSound();
	        System.out.println("Fish gender: " + fish.getGender());
	        System.out.println("Fish water type: " + fish.getHabitableWater());
	    }
	}
}

