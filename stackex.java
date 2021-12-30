import java.util.*;
public class stackex {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<Integer>();
        Scanner s = new Scanner(System.in);
        for(int i = 0; i < 10; i++){
                int input = s.nextInt();
                stack.push(input);
            

        }
        
        for(int j = stack.size() -1; j >= 0; j--){

            System.out.println(stack.get(j));
            stack.remove(j);
        }
        
    }
    
}
