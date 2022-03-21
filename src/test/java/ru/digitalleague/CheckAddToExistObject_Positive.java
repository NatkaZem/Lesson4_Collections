package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckAddToExistObject_Positive {

    @Before()
    public void setUp() {
        Storage.addObject("pear", 7);
    }

    @Test
    public void checkAddToExistObject() {
        Storage.addObject("pear", 3);
        assertEquals(10, Storage.getProductAmount("pear"));
        assertTrue(Storage.isInStock("pear"));
    }

    @After
    public void cleanStorage() {
        Storage.removeObject("pear");
    }
}
