package ru.digitalleague;

import org.junit.Test;
import ru.digitalleague.storage_example.MsgValidator;
import static org.junit.Assert.*;

public class CheckValidateParametrizedMsg_Positive {

    @Test
    public void checkValidateParametrizedMsg(){
        String[] comAndValue = new String[]{"delete", "cucumber"};
        assertTrue(MsgValidator.validateParametrizedMsg(comAndValue));
    }
}
