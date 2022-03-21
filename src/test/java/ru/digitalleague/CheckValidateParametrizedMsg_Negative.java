package ru.digitalleague;
import org.junit.Test;
import ru.digitalleague.storage_example.MsgValidator;
import static org.junit.Assert.*;

public class CheckValidateParametrizedMsg_Negative {

    @Test
    public void checkValidateParametrizedMsg_1() {
        String[] comAndValue = new String[]{"delete", "cucumber", "5"};
        assertFalse(MsgValidator.validateParametrizedMsg(comAndValue));
    }

    @Test
    public void checkValidateParametrizedMsg_2() {
        String[] comAndValue = new String[]{"delete", "1251"};
        assertFalse(MsgValidator.validateParametrizedMsg(comAndValue));
    }
}
