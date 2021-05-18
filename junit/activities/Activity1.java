package activities;
import java.util.ArrayList;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Activity1 {
    static ArrayList<String> list;
 
    // Initialize test fixtures before each test method
    @BeforeEach
    void setUp() throws Exception {
        list = new ArrayList<String>();
        list.add("alpha");
        list.add("beta");
    }
 
    // Test method to test the insert operation
    @Test
    public void insertTest() {
        assertEquals(2, list.size(), "Wrong size");
        list.add(2, "charlie");
        assertEquals(3, list.size(), "Wrong size");
 
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("beta", list.get(1), "Wrong element");
        assertEquals("charlie", list.get(2), "Wrong element");
    }
 
    // Test method to test the replace operation
    @Test
    public void replaceTest() {
        list.set(1, "charlie");
 
        assertEquals(2, list.size(), "Wrong size");
        assertEquals("alpha", list.get(0), "Wrong element");
        assertEquals("charlie", list.get(1), "Wrong element");
    }
}
