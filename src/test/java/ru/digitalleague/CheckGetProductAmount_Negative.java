package ru.digitalleague;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class CheckGetProductAmount_Negative {


    @Before()
    public void setUp() {
        Storage.addObject("tomato", 12);
    }

    @Test
    public void checkGetProductAmount() {
        assertNotEquals(12, Storage.getProductAmount("tomato"));
    }

    @After
    public void cleanStorage() {
        Storage.removeObject("tomato");
    }

}
