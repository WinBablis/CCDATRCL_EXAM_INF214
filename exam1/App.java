import java.util.Stack;
import java.util.LinkedList;
public class App {
    public static void main(String[] args) throws Exception {

    	// ARRAYS
        // ======================================================
        // 1. Create an array of characters of your SURNAME.
        char[] surname = { 'B', 'A', 'B', 'L', 'I', 'S' };

        System.out.println();

        // 2. Print each character of your SURNAME on each line.
        for (int i = 0; i < surname.length; i++) {
            System.out.println(surname[i]);
        }
        System.out.println();

        // 3. Print the first character of your SURNAME.
        System.out.println(surname[0]);

        System.out.println();

        // 4. Print the last character of your SURNAME.
        System.out.println(surname[5]);

        System.out.println();

        // 5. Print the character of your SURNAME in reverse order.
        for (int i = surname.length - 1; i >= 0; i--) {
            System.out.println(surname[i]);
        }
        
        System.out.println();
        // Linked List
        // ======================================================
        // 1. Create a Linked list of the last six numbers of your STUDENT NUMBER.
        LinkedList<String> studentNum = new LinkedList<>();

        studentNum.add("1");
        studentNum.add("0");
        studentNum.add("6");
        studentNum.add("2");
        studentNum.add("4");
        studentNum.add("7");

        	System.out.println(studentNum);

            System.out.println();
        
        // 2. Add an asterisk "*" to the head/front of the Linked list.
        studentNum.addFirst("*");
       
        // 3. Add an asterisk "*" to the tail/end of the Linked list.
        studentNum.addLast("*");
        	System.out.println(studentNum);

        // 4. Print the last character of the Linked list.
        System.out.println(studentNum.get(6));

        System.out.println();

        // 5. Replace the last character of the Linked list with the exclamation symbol "!".
        studentNum.set(6, "!");

        // 6. Remove the first character of the Linked list.
        studentNum.remove(1);

        // // 7. Print the LinkedList
        	System.out.println(studentNum);
        	
            System.out.println();
        	
        	/// Stack
            // ======================================================
            // 1. Create a Stack of characters of your favorite fruit

         Stack<String> surName = new Stack<>();

            surName.push("B");
            surName.push("A");
            surName.push("B");
            surName.push("L");
            surName.push("I");
            surName.push("S");
            

          // 2. Print the Stack
          System.out.println(surName);

         System.out.println();

          // 3. Add a "INF214" to the stack
          surName.push(" ");
          surName.push("I");
          surName.push("N");
          surName.push("F");
          surName.push("2");
          surName.push("1");
          surName.push("4");

          // 4. Print the Stack
          System.out.println(surName);

          System.out.println();

          // 5. Remove "INF214" and add "CCDATRCL-INF214"
          surName.pop();
          surName.pop();
          surName.pop();
          surName.pop();
          surName.pop();
          surName.pop();
          surName.pop();

            surName.push("C");
            surName.push("C");
            surName.push("D");
            surName.push("A");
            surName.push("T");
            surName.push("R");
            surName.push("C");
            surName.push("L");
            surName.push("-");
            surName.push("I");
            surName.push("N");
            surName.push("F");
            surName.push("2");
            surName.push("1");
            surName.push("4");
            

            // 6. Print the Stack
            System.out.println(surName);
        }
    }
