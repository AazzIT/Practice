package practice003.doubles;

public class Doubles {
    StateMachine sm = new StateMachine();

    public Double parse(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sm.next(c);
        }
        return sm.getResult();
    }

    private static class StateMachine {
        private Double result;

        public State next(char c) {
            currentState = currentState.next(c, data);

            return null;
        }
        State currentState = State.INIT;
        ParseData data = new ParseData();

        public Double getResult() {
            if (currentState == State.NUMBER) {
                return (double) data.getNumber();
            }
            return null;
        }

        public enum State {
            INIT {
                @Override
                public State next(char c, ParseData data) {
                    if (((c - '0') >= 0) && ((c - '0') <= 9)) {
                        data.addDigit(c - '0');
                        return NUMBER;
                    }
                    return INVALIDE_END;
                }
            }, NUMBER {
                @Override
                public State next(char c, ParseData data) {
                    if (((c - '0') >= 0) && ((c - '0') <= 9)) {
                        data.addDigit(c - '0');
                        return NUMBER;
                    }
                    return INVALIDE_END;
                }
            }, VALIDE_END {
                @Override
                public State next(char c, ParseData data) {
                    if (c == ' ') return VALIDE_END;
                    return INVALIDE_END;
                }
            }, INVALIDE_END {
                @Override
                public State next(char c, ParseData data) {
                    return null;
                }
            };

            public abstract State next(char c, ParseData data);
        }
    }

    private static class ParseData {
        private int number = 0;

        public int getNumber() {
            return number;
        }

        public void addDigit(int i) {
            number = number * 10 + i;
        }
    }
}
