/**
 * @author Aaron Carpenter - acarpenter5@dmacc.edu
 * CIS175 - Fall 2021
 * Sep 5, 2023
 */

package tests;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import org.junit.Test;
import model.ToDoList;

public class TestAddTask {
    @Test
    public void testAddTask() {
        // Simulate user input for adding a task
        String input = "1\nSample Task\n5\n";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        // Run the To-Do List program
        ToDoList.main(new String[]{});

        // Verify that the task was added successfully
        assertTrue(ToDoList.tasks.contains("Sample Task"));
    }
}