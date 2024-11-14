public class ReversePolishNotation {
    static int evaluatePostfix(String input) {
        Stack stack = new Stack();
        //make an array that starts at 0, then adds the first two numbers
        //do something with input
        while (input.length() > 0) {

            if (input.substring(0, 1).equals("*")) {
                int num = Integer.parseInt(stack.pop()) * Integer.parseInt(stack.pop());//makes the string an int
                stack.push(num + ""); //put result back on stack
                if (input.length() < 3) {
                    break;
                }
                else {
                    input = input.substring(2);
                }        }
            else if (input.substring(0, 1).equals("/")) {
                int x = Integer.parseInt(stack.pop());
                //System.out.print(x);
                int y = Integer.parseInt(stack.pop()) / x;
                stack.push(y + "");
                if (input.length() < 3) {
                    break;
                }
                else {
                    input = input.substring(2);
                }            }
            else if (input.substring(0, 1).equals("+")) {
                int num = Integer.parseInt(stack.pop()) + Integer.parseInt(stack.pop());
                stack.push(num + "");
                if (input.length() < 3) {
                    break;
                }
                else {
                    input = input.substring(2);
                }
            }
            else if (input.substring(0, 1).equals("-")) {
                int x = Integer.parseInt(stack.pop());
                int y = Integer.parseInt(stack.pop()) - x;
                stack.push(y + "");

                if (input.length() < 3) {
                    break;
                }
                else {
                    input = input.substring(2);
                }
            }
            else {
                stack.push(input.substring(0, input.indexOf(" ")));
                input = input.substring(input.indexOf(" ") + 1);

            }
        }
        return (Integer.parseInt(stack.pop()));
    }

    static String infixToPostFix(String input) {
        String[] s = input.split(" ");

        Stack stack = new Stack();
        String output = "";
        String[] operators = {"+", "-", "*", "/", "(", ")", "^"};

        for (int i = 0; i < s.length; i++) {
            boolean op = false;
            for (int j = 0; j < operators.length; j++) {
                if (s[i].equals(operators[j])) {
                    op = true;
                }
            }
            if (op) {
                if (stack.isEmpty()) {
                    stack.push(s[i]);
                }
                else if (precedence(s[i]) <= precedence(stack.peek())) {

//                    while(boolean x = true) {
//                        if (stack.peek().equals("(")) {
//                            stack.pop();
//                            stack.push(s[i]);
//                        }
//                        else {
//                            output += stack.pop();
//                        }
//                        else if (stack.peek().equals(")")) {
//                            stack.pop();
//                            if (stack.peek().equals("(")) {
//                                stack.pop();
//                            } else {
//                                output += stack.pop() + " ";
//                                stack.push(s[i]);
//                            }
//                        }
                    }

                    else {
                        output += stack.pop() + " ";
                        stack.push(s[i]);
                    }

                }
                else if (precedence(s[i]) > precedence(stack.peek())) {
                    stack.push(s[i]);
                }
            }
            if (!op) {
                output += s[i] + " ";

            }
        }
        for (int i = stack.size(); i > 0; i--) {
            if (stack.peek().equals(")")) {
                stack.pop();
            }
            else if (stack.peek().equals("(")) {
                stack.pop();
            }
            else {
                output += stack.pop() + " ";
            }
        }
        return output;
    }

    public static int precedence(String operators) {
        if (operators.equals("+") || operators.equals("-")) {
            return 1;
        }
        else if (operators.equals("/") || operators.equals("*")) {
            return 2;
        }
        else if (operators.equals("^")) {
            return 3;
        }
        else if (operators.equals("(")) {
            return 0;
        }
        else if (operators.equals(")")) {
            return 0;
        }
        else {
            return -1;
        }
    }

}