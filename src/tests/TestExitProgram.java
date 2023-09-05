package tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import model.ToDoList2; // Was having issues getting 



public class TestExitProgram {
    @Test
    public void testExitProgram() {
        InputStream originalSystemIn = System.in;
        String input = "5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        ToDoList2.main(new String[]{});
        System.setIn(originalSystemIn);

    }
}