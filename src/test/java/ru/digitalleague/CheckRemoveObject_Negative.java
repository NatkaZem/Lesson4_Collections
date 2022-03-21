package ru.digitalleague;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;
import static org.junit.Assert.assertFalse;


public class CheckRemoveObject_Negative {

    @Before()
    public void setUp() {
        Storage.addObject("tomato", 10);
    }

    @Test
    public void checkRemoveObject() {
        assertFalse(Storage.removeObject("cucumber"));
    }

    @After
    public void cleanStorage() {
        Storage.removeObject("tomato");
    }
}


