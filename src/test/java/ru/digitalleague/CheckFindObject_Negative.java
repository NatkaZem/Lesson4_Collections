package ru.digitalleague;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CheckFindObject_Negative {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void checkFindObject() {
        String product = "pear";
        Storage.findObject(product);
        Assert.assertEquals("Object " + product + " not found.", outputStreamCaptor.toString().trim());
    }

    @After
    public void clean() {
        System.setOut(standardOut);
    }
}
