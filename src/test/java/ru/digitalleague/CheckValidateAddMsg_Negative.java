package ru.digitalleague;

import org.junit.Test;
import ru.digitalleague.storage_example.MsgValidator;
import static org.junit.Assert.*;

public class CheckValidateAddMsg_Negative {

    @Test
    public void checkValidateAddMsg_1(){
        String[] comAndValue = new String[]{"add", "cucumber", "5", "3"};
        assertFalse(MsgValidator.validateAddMsg(comAndValue));
    }

    @Test
    public void checkValidateAddMsg_2(){
        String[] comAndValue = new String[]{"add", "5454", "5"};
        assertFalse(MsgValidator.validateAddMsg(comAndValue));
    }

    @Test
    public void checkValidateAddMsg_3(){
        String[] comAndValue = new String[]{"add", "cucumber", "fdfdf"};
        assertFalse(MsgValidator.validateAddMsg(comAndValue));
    }
}
