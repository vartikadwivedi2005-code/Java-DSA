package lect_39;


import java.util.Stack;

public class index {
    public static int callPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        
        for (String op : ops) {
            if (op.equals("+")) {
                int a = st.pop();
                int b = st.peek();
                
                st.push(a);
                st.push(a + b);
            } 
            else if (op.equals("D")) {
                st.push(2 * st.peek());
            } 
           
            else if (op.equals("C")) {
                st.pop();
            } 
            
            else {
                st.push(Integer.parseInt(op));
            }
        }
       
        int totalSum = 0;
        for (int score : st) {
            totalSum += score;
        }
        
        return totalSum;
    }

    public static void main(String args[]) {
        // Test case: ["5", "2", "C", "D", "+"]
        // 5 -> push(5)
        // 2 -> push(2)
        // C -> pop() (removes 2)
        // D -> push(2 * 5) -> push(10)
        // + -> push(5 + 10) -> push(15)
        // Total: 5 + 10 + 15 = 30
        String[] testOps = {"5", "2", "C", "D", "+"};
        int result = callPoints(testOps);
        System.out.println("Total Score: " + result); // Output: 30
    }
}




/*
 * HOW IT WORKS UNDER THE HOOD:
 * Input Operations: {"5", "2", "C", "D", "+"}
 * * TRACE TABLE:
 * +-----------+-----------------------+------------------+---------------+
 * | Operation | Action                | Stack State      | Current Total |
 * +-----------+-----------------------+------------------+---------------+
 * |    "5"    | Push integer 5        | [5]              | 5             |
 * |    "2"    | Push integer 2        | [5, 2]           | 7             |
 * |    "C"    | Pop (invalidate '2')  | [5]              | 5             |
 * |    "D"    | Double 5 -> Push 10   | [5, 10]          | 15            |
 * |    "+"    | Sum 5+10 -> Push 15   | [5, 10, 15]      | 30            |
 * +-----------+-----------------------+------------------+---------------+
 * * FINAL STEP (Summing up the remaining elements in the stack):
 * -> 5 + 10 + 15 = 30
 */
