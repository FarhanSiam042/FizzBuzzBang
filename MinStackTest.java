package TestCases;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import src.MinStack;

public class MinStackTest {

    @Test
    public void testMinStack() {
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        assertEquals(1, minStack.min());

        minStack.pop();
        assertEquals(2, minStack.min());

        minStack.pop();
        minStack.pop();
        assertEquals(3, minStack.min());
    }
}
