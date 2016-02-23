package practice003.reversePolishNotation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import java.util.function.BiFunction;

public class ReversePolishNotation {
    public int evaluate(String input) {
        Stack<Integer> numbers = new Stack<>();
        for (String number : input.split(" ")) {
            Sign sign = Sign.find(number);
            if (sign != null) {
                calcSign(numbers, sign);
            } else {
                numbers.push(Integer.valueOf(number));
            }
        }
        return numbers.pop();
    }

    protected Stack<Integer> calcSign(Stack<Integer> numbers, Sign sign) {
        numbers.push((int) sign.apply(numbers.pop(), numbers.pop()));
        return numbers;
    }

    public enum Sign {

        ADD("+") {
            public double apply(double num1, double num2) {
                return num2 + num1;
            }
        },
        REMOVE("-") {
            public double apply(double num1, double num2) {
                return num2 - num1;
            }
        },
        MULTIPLY("*") {
            public double apply(double num1, double num2) {
                return num2 * num1;
            }
        },
        DIVIDE("/") {
            public double apply(double num1, double num2) {
                return num2 / num1;
            }
        };

        private final String operatorText;

        Sign(String operatorText) {
            this.operatorText = operatorText;
        }

        public abstract double apply(double x1, double x2);

        private static final Map<String, Sign> map;

        static {
            map = new HashMap<>();
            for (Sign sign : Sign.values()) {
                map.put(sign.operatorText, sign);
            }
        }

        public static Sign find(String sign) {
            return map.get(sign);
        }

    }

}
    
    
    /*
    public int evaluate(String expression) {
        
        
    
            
            Stack<Integer> numbers = new Stack<>();
            Arrays.asList(expression.split(" ")).stream().forEach(number -> {
                switch(number) {
                    case "+":
                        calcSign(numbers, (n1, n2) -> n2 + n1);
                        break;
                    case "-":
                        calcSign(numbers, (n1, n2) -> n2 - n1);
                        break;
                    case "*":
                        calcSign(numbers, (n1, n2) -> n2 * n1);
                        break;
                    case "/":
                        calcSign(numbers, (n1, n2) -> n2 / n1);
                        break;
                    default:
                        numbers.push(Integer.valueOf(number));
                }
            });
            return numbers.pop();
        }

        protected static Stack<Integer> calcSign(Stack<Integer> numbers, BiFunction<Integer, Integer, Integer> operation) {
            numbers.push(operation.apply(numbers.pop(), numbers.pop()));
            return numbers;
        }
        */

    

