
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String string = "Hello Hello bye Hello bye Inno Hello bye bye bye Inno bye";
        HashMap<String, Integer> stringMap = new HashMap<String, Integer>();
        String[] currentWord = string.split(" ");
        String maxString = null;
        int max = 0;

        int current = 0;
        for (int i = 0; i < currentWord.length; i++) {
            if (stringMap.containsKey(currentWord[i])) {
                current = stringMap.get(currentWord[i]) + 1;
                stringMap.put(currentWord[i], current);
                if (max < current) {
                    maxString = currentWord[i];
                    max = current;
                }
            } else {
                stringMap.put(currentWord[i], 1);
            }
        }
        System.out.println(maxString + " " + stringMap.get(maxString));
    }
}
