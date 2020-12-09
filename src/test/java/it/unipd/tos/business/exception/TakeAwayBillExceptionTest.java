////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business.exception;

import org.junit.Assert;
import org.junit.Test;

public class TakeAwayBillExceptionTest {
    @Test
    public void getMsgTest(){
        String s = "errore";
        Assert.assertEquals("it.unipd.tos.business.exception.TakeAwayBillException: "+s,new TakeAwayBillException(s).toString());
    }
}