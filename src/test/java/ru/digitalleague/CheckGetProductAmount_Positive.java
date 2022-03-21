package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class CheckGetProductAmount_Positive {

    @Before()
    public void setUp() {
        Storage.addObject("tomato", 5);
    }

    @Test
    public void checkGetProductAmount() {
        assertEquals(5, Storage.getProductAmount("tomato"));
    }

    @After
    public void cleanStorage() {
        Storage.removeObject("tomato");
    }
}
