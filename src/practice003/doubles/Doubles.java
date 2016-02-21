package practice003.doubles;

public class Doubles {
    StateMachine sm = new StateMachine();
    public Double parse(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            sm.next(c);
        }
        return null;
    }

    private class StateMachine {
        public State next(char c) {
            State = State.next();
            return null;
        }

        private class State {
            ININT, NUMBER, VALIDE_END
        }
    }
}
