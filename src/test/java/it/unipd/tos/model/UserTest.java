////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.model;

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