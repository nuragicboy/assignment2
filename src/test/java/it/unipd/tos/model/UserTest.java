////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

import it.unipd.tos.business.exception.TakeAwayBillException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import it.unipd.tos.business.Bill;

public class UserTest {

    private User user;

    @Before
    public void setup() {
        user = new User("Clark", "Kent", "Superman", 34);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failNome() {
        user = new User(null, "Kent", "Superman", 34);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failCognome() {
        user = new User("Clark", null, "Superman", 34);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failUsername() {
        user = new User("Clark", "Kent", null, 34);
    }

    @Test(expected = IllegalArgumentException.class)
    public void failEta() {
        user = new User("Clark", "Kent", "Superman", -1);
    }

    @Test
    public void testMetodoGetNome() {
        Assert.assertEquals("Clark",user.getNome());
    }

    @Test
    public void testMetodoGetCognome() {
        Assert.assertEquals("Kent",user.getCognome());
    }

    @Test
    public void testMetodoGetUsername() {
        Assert.assertEquals("Superman",user.getUsername());
    }

    @Test
    public void TestMetodoGetEta() {
        Assert.assertEquals(34,user.getEta());
    }
}