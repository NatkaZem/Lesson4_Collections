package ru.digitalleague;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;


public class CheckShowAllStorage_Positive {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void checkShowAllStorage() {
        Storage.showAllStorage();
        Assert.assertEquals("Storage info:\r\n" +
                "Also storage has 3 free places for new items", outputStreamCaptor.toString().trim());
    }

    @After
    public void clean() {
        System.setOut(standardOut);
    }
}
