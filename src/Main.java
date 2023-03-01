import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";
    static Map<Character, Integer> map = new HashMap<>();

    public static void main(String[] args) {

        for (int i = 0; i < text.length(); i++) {
            char c = text.toLowerCase().charAt(i);
            if (Character.isLetter(c)) {
                if (!map.containsKey(c)) {
                    map.put(c, 1);
                } else {
                    map.put(c, map.get(c) + 1);
                }
            }
        }
        int max = Collections.max(map.values());
        int min = Collections.min(map.values());
        for (Map.Entry<Character, Integer> kv : map.entrySet()) {
            if (kv.getValue() == max) {
                System.out.println("Буква " + "'" + kv.getKey() + "'" + " встречается в тексте чаще всего: " + max + " раз(а).");
            }
            if (kv.getValue() == min) {
                System.out.println("Буква " + "'" + kv.getKey() + "'" + " встречается в тексте реже всего: " + min + " раз(а).");
            }
        }
    }
}