import java.util.Arrays;

public class Methods {
    public static float divide(float x, float y) {
        if (y == 0) {
            return 0;
        }

        return x / y;
    }

    public static String cap(String word) {
        char first = Character.toUpperCase(word.charAt(0));

        String rest = word.substring(1);

        return first + rest;
    }

    public static String capped(String word) {
        String[] splitted = word.split(" ");

        String[] mapped = Arrays.stream(splitted).map(w -> cap(w)).toArray(String[]::new);

        return String.join(" ", mapped);
    }
}
