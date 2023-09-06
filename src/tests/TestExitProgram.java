/**
 * @author Aaron Carpenter - acarpenter5@dmacc.edu
 * CIS175 - Fall 2021
 * Sep 5, 2023
 */

package tests;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import model.ToDoList2;

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