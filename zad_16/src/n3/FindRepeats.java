package n3;

public class FindRepeats {
    int numberOfRepeats(String text, String substring) {
        if (substring == null || substring.isEmpty()) {
            return 0;
        }

        int count = 0;
        while (text != null && text.contains(substring)) {
            count++;
            int index = text.indexOf(substring);
            text = text.substring(index + substring.length());
        }
        return count;
    }
}