package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;


public class CheckAddToExistObject_Negative {

    @Before()
    public void setUp() {
        Storage.addObject("pear", 7);
    }

    @Test
    public void checkAddToExistObject() {
        Storage.addObject("pear", 4);
        assertNotEquals(11, Storage.getProductAmount("pear"));
    }

    @After
    public void cleanStorage() {
        Storage.removeObject("pear");
    }
}
