package ru.digitalleague;

import org.junit.Test;
import ru.digitalleague.storage_example.MsgValidator;

import static org.junit.Assert.*;

public class CheckValidateAddMsg_Positive {

    @Test
    public void checkValidateAddMsg() {
        String[] comAndValue = new String[]{"add", "cucumber", "1"};
        assertTrue(MsgValidator.validateAddMsg(comAndValue));
    }
}
