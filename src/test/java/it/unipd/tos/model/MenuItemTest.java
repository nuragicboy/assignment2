////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class MenuItemTest {

    private MenuItem menuItem;

    @Before
    public void setup() {
        menuItem = new MenuItem(MenuItem.ItemType.Bevanda, "Lenticchie", 42.00);
    }

    @Test
    public void TestMetodoGetItemType(){
        Assert.assertEquals(MenuItem.ItemType.Bevanda,menuItem.getItemType());
    }

    @Test
    public void TestMetodoGetName(){
        Assert.assertEquals("Lenticchie",menuItem.getName());
    }

    @Test
    public void TestMetodoGetPrice(){
        Assert.assertEquals(42.00,menuItem.getPrice(),0);
    }

}