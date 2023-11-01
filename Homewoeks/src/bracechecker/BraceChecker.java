package bracechecker;

import java.util.*;
public class BraceChecker {
    String text;

    BraceChecker(String text){
        this.text = text;
    }

    public void check(){
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < text.length(); i++) {
            char temp = text.charAt(i);

            if (!(temp == '(' || temp == '{' || temp == '[' || temp == ')' || temp == '}' || temp == ']'))
                continue;

            if (temp == '(' || temp == '{' || temp == '[') {
                stack.push(temp);
                continue;
            }

            if (stack.isEmpty()){
                System.out.println("Error: " + temp + " is closed nothing at " + i);
                return;
            }
            char check;
            switch (temp) {
                case ')':
                    check = stack.pop();

                    break;

                case '}':
                    check = stack.pop();
                    if (check != '{'){
                        System.out.println("Error: opened "+ check + "but closed" + temp + " at " + i);
                        return;
                    }
                    break;

                case ']':
                    check = stack.pop();
                    if (check != '['){
                        System.out.println("Error: opened "+ check + "but closed" + temp + " at " + i);
                        return;
                    }
                    break;
            }
        }
        if(stack.isEmpty()){
            System.out.println("It's true");
        }
    }
}
