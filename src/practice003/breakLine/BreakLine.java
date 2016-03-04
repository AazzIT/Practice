package practice003.breakLine;

public class BreakLine {
    public String format(String input, int width) {
        int countSymbols = 0;
        String result = "";
        boolean word = false;
        int endOfLine = input.length() - 1;

        for (int i = 0; i < input.length(); i++) {
            final char currentSymbol = input.charAt(i);
            if (Character.isLetter(currentSymbol) && i != endOfLine) {
                word = true;
                countSymbols++;
                result += currentSymbol;
            } else if (!Character.isLetter(currentSymbol)) {
                if (currentSymbol == '\"') {
                    result += "\"";
                } else if (word && countSymbols > 5) {
                    result += "\n";
                    countSymbols = 0;
                } else {
                    result += " ";
                    countSymbols = 0;
                }
                word = false;
            } else if (Character.isLetter(currentSymbol) && i == endOfLine) {
                result += currentSymbol;
            }
        }
        return result;
        /*
        int countSymbols = 0;
        int prevWordCountSymbols = 0;
        String result = "";
        boolean word = false;
        int endOfLine = input.length() - 1;

        for (int i = 0; i < input.length(); i++) {
            final char currentSymbol = input.charAt(i);
            if (Character.isLetter(currentSymbol) && i != endOfLine && currentSymbol != '\"') {

                countSymbols++;
                result += currentSymbol;
            } else if (!Character.isLetter(currentSymbol)) {
                if (currentSymbol == '\"') {
                    result += "\"";
                    //countSymbols = 0;
                    //countSymbols++;
                } else if (currentSymbol == ' ') {
                  if (prevWordCountSymbols == 0) {
                    if (countSymbols == width) {
                      result += "\n";
                      countSymbols = 0;
                    } else {
                      result += "~";
                      countSymbols++;
                    }
                  } else if (countSymbols + prevWordCountSymbols == width) {
                      result += "\n";
                      countSymbols = 0;
                      prevWordCountSymbols = 0;
                    }
                }

            } else if (Character.isLetter(currentSymbol) && i == endOfLine) {
                result += currentSymbol;
            }
        }
        return result;
         */
    }
}
