class Book {
    private String title;
    private int price;

    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book[title=" + title + ", price=" + price + "]";
    }
}

class Car {
    private String model;

    public Car(String model) {
        this.model = model;
    }
}

class Student {
    private int rollNumber;
    private String name;

    public Student(int rollNumber, String name) {
        this.rollNumber = rollNumber;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Student)) return false;
        Student s = (Student) obj;
        return this.rollNumber == s.rollNumber;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(rollNumber);
    }
}

class Movie {
    private String title;
    private String director;
    private int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Movie[title=" + title + ", director=" + director + ", year=" + year + "]";
    }
}

class Player {
    private String name;
    private int age;

    public Player(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(age);
    }

    @Override
    public String toString() {
        return "Player[name=" + name + ", age=" + age + "]";
    }
}

public class EntitiesDemo {
    public static void main(String[] args) {
        Book b = new Book("Java", 500);
        System.out.println(b);

        Car c = new Car("Tesla");
        System.out.println("Runtime class of Car object: " + c.getClass());

        Student s1 = new Student(101, "Alice");
        Student s2 = new Student(101, "Bob");
        System.out.println("Are students equal? " + s1.equals(s2));
        System.out.println("HashCode of s1: " + s1.hashCode());
        System.out.println("HashCode of s2: " + s2.hashCode());

        Movie m = new Movie("Inception", "Christopher Nolan", 2010);
        System.out.println(m);

        Player p1 = new Player("Virat", 30);
        Player p2 = new Player("Rohit", 30);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println("HashCode of p1: " + p1.hashCode());
        System.out.println("HashCode of p2: " + p2.hashCode());
    }
}
