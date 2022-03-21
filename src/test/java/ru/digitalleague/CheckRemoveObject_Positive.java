package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;

public class CheckRemoveObject_Positive {

    @Before
    public void add() {
        Storage.addObject("cucumber", 8);
    }

    @Test
    public void checkRemoveObject() {
        if (Storage.isInStock("cucumber")) {
            Storage.removeObject("cucumber");
        }
        assertFalse(Storage.isInStock("cucumber"));
    }
}
