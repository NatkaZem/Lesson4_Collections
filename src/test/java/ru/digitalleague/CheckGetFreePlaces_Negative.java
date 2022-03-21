package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import static org.junit.Assert.*;

public class CheckGetFreePlaces_Negative {

    @Before
    public void setUp() {
        Storage.addObject("grapes", 7);
        Storage.addObject("tomato", 7);
        Storage.addObject("potato", 7);
        Storage.addObject("cucumber", 7);
    }

    @Test
    public void checkGetFreePlaces() {
        assertNotEquals(-1, Storage.getFreePlaces());
    }

    @After
    public void cleanStorage() {
        Storage.removeObject("grapes");
        Storage.removeObject("tomato");
        Storage.removeObject("potato");
        Storage.removeObject("cucumber");
    }
}
