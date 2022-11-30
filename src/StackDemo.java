import java.util.Stack;


public class StackDemo {
    public static void main(String[] args) {
        // stack = LIFO data structure. Last-in First-out
        // stores objects into a sort of "Vertical tower"
        // push() to add to the top
        // pop() to remove from the top
        Stack<String> stack = new Stack<>();

        stack.push("Valorant");
        stack.push("Minecraft");
        stack.push("Overwatch");
        stack.push("GTA");
        stack.push("Elden Ring");

        String peakedItem = stack.peek(); // Keeps item in stack but returns top item
        String poppedItem = stack.pop(); // removes the top item for the stack


        System.out.println(stack.empty());
        System.out.println(stack);
        System.out.println(peakedItem);
        System.out.println(poppedItem);

        for(int i = 0; i < 100; i++) {
            stack.push("JOJO");
        }
        System.out.println(stack);

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4.  calling functions (call stack)




    }
}
