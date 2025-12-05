import java.util.ArrayList;

public class RemoveName {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Harsha");
        names.add("Ravi");
        names.add("Priya");
        names.add("Anil");
        names.add("Sneha");

        names.remove("Anil");

        System.out.println("Final List: " + names);
    }
}
