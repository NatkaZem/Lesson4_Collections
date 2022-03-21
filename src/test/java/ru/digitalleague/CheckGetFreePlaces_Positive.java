package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class CheckGetFreePlaces_Positive {

    @Before
    public void setUp() {
        Storage.addObject("grapes", 7);
    }

    @Test
    public void checkGetFreePlaces() {
        assertEquals(2, Storage.getFreePlaces());
    }

    @After
    public void cleanStorage() {
        Storage.removeObject("grapes");
    }
}
