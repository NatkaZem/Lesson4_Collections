package ru.digitalleague;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import ru.digitalleague.storage_example.Storage;
import static org.junit.Assert.*;

public class CheckAddObject_Negative {

//я могу добавить минус 2 tomato и тест проходит. Баг!

        @Before()
        public void setUp() {
            Storage.addObject("tomato", -2);
        }

        @Test
        public void checkAddObject() {
            assertNotEquals(-2, Storage.getProductAmount("tomato"));
        }

        @After
        public void cleanStorage() {
            Storage.removeObject("tomato");
        }
    }

