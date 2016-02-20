package practice003.unixpath;

import java.util.LinkedList;

public class UnixPath {
    public static String simplify(String input) {
        LinkedList<String> path = new LinkedList<>();
        StringBuilder wordBuffer = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char letter = input.charAt(i);
            String word = wordBuffer.toString();
            if (letter == '/') {
                if ("..".equals(word)) {
                    if (!path.isEmpty()) {
                        path.pop();
                    }
                } else if (".".equals(word) || word.length() == 0) {

                } else {
                    path.push(word);
                }
                wordBuffer = new StringBuilder();
            } else {
                wordBuffer.append(letter);
            }
        }
        String word = wordBuffer.toString();
        if (!".".equals(word) && word.length() > 0 && !"..".equals(word)) {
            path.push(word);
        }

        StringBuilder result = new StringBuilder();
        while (!path.isEmpty()) {
            result.append("/");
            String fileName = path.removeLast();
            result.append(fileName);
        }
        if (result.length() == 0) {
            result.append("/");

        }
        return result.toString();
    }
}
