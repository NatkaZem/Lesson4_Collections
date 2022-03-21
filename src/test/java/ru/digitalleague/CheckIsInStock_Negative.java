package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.assertFalse;

public class CheckIsInStock_Negative {

    @Before
    public void addProduct(){
        Storage.addObject("apple", 2);
    }

    @Test
    public void checkIsInStock() {
        assertFalse(Storage.isInStock("orange"));
    }

    @After
    public void cleanStorage() {
        Storage.removeObject("apple");
    }
}
