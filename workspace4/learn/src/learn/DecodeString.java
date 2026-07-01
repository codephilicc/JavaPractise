package learn;

import java.util.Stack;

public class DecodeString {
	    public static String decodeString(String s) {
	        Stack<Integer> countStack = new Stack<>();
	        Stack<StringBuilder> stringStack = new Stack<>();
	        StringBuilder currentString = new StringBuilder();
	        int number = 0;

	        for (char c : s.toCharArray()) {
	            if (Character.isDigit(c)) {
	                // Build the full number (e.g., handle multi-digit numbers like "10")
	                number = number * 10 + (c - '0');
	            } else if (c == '[') {
	                // Push current number and string onto the stack
	                countStack.push(number);
	                stringStack.push(currentString);
	                // Reset for new substring
	                currentString = new StringBuilder();
	                number = 0;
	            } else if (c == ']') {
	                // Pop count and previous string
	                int repeatTimes = countStack.pop();
	                StringBuilder temp = stringStack.pop();
	                // Repeat the currentString and append it
	                while (repeatTimes-- > 0) {
	                    temp.append(currentString);
	                }
	                currentString = temp; // Update current string after expansion
	            } else {
	                // Normal character, just add to current substring
	                currentString.append(c);
	            }
	        }

	        return currentString.toString();
	    }

	    public static void main(String[] args) {
	        System.out.println(decodeString("3[a]2[bc]")); // Output: "aaabcbc"
//	        System.out.println(decodeString("3[a2[c]]"));  // Output: "accaccacc"
	    }
	}



