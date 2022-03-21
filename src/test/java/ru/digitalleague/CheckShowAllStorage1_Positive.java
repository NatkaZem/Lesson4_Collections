package ru.digitalleague;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CheckShowAllStorage1_Positive {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        Storage.addObject("tomato", 10);
        Storage.addObject("pear", 10);
        Storage.addObject("apple", 10);

    }

    @Test
    public void checkShowAllStorage() {
        System.setOut(new PrintStream(outputStreamCaptor));
        Storage.showAllStorage();
        Assert.assertEquals("Storage info:\r\n" +
                "apple - 10/10\n" +
                "pear - 10/10\n" +
                "tomato - 10/10", outputStreamCaptor.toString().trim());
    }

    @After
    public void clean() {
        Storage.removeObject("tomato");
        Storage.removeObject("pear");
        Storage.removeObject("apple");
        System.setOut(standardOut);
    }
}
