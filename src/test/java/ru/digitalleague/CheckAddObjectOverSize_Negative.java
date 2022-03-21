package ru.digitalleague;

import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;

public class CheckAddObjectOverSize_Negative {

    @Before()
    public void setUp() {
        Storage.addObject("pear", 12);
    }

    @Test
    public void checkAddProductOverSize() {
        assertFalse(Storage.isInStock("pear"));
    }
}
