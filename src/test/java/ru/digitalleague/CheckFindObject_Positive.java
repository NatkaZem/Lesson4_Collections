package ru.digitalleague;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CheckFindObject_Positive {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        Storage.addObject("tomato", 6);
    }

    @Test
    public void checkFindObject() {
        System.setOut(new PrintStream(outputStreamCaptor));
        String product = "tomato";
        String amount = "6";
        Storage.findObject(product);
        Assert.assertEquals("Object " + product + " is present in " + amount + " pcs", outputStreamCaptor.toString().trim());
    }

    @After
    public void clean() {
        Storage.removeObject("tomato");
        System.setOut(standardOut);
    }
}
