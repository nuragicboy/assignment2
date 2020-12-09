////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import it.unipd.tos.business.exception.TakeAwayBillException;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;


import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;

import java.util.ArrayList;
import java.util.List;

public class BillTest {

    Bill conto;
    List<MenuItem> lista;
    User utente;
    double prezzo;


    @Before
    public void setup() {
        conto = new Bill();
        prezzo = 0.0;
        lista = new ArrayList<>();
        utente = new User("Carlo", "Cracco", "CarlCracker", 69);
    }


    @Test
    public void testSomma() throws TakeAwayBillException{
        List<MenuItem> lista = new ArrayList<>();

        lista.add(new MenuItem(MenuItem.ItemType.Bevanda, "Bepis", 2.00));
        lista.add(new MenuItem(MenuItem.ItemType.Budino, "Caramello", 4.00));
        lista.add(new MenuItem(MenuItem.ItemType.Gelato, "Spritz", 6.00));

        prezzo = conto.getOrderPrice(lista,utente);

        Assert.assertEquals(12.00,prezzo,0);
    }

    @Test(expected = TakeAwayBillException.class)
    public void testItemNulloInLista() throws TakeAwayBillException{
        List<MenuItem> lista = new ArrayList<>();

        lista.add(null);
        lista.add(new MenuItem(MenuItem.ItemType.Gelato, "gorgonzola", 24.00));

        prezzo = conto.getOrderPrice(lista,utente);
    }

    @Test(expected = TakeAwayBillException.class)
    public void testListaNulla() throws TakeAwayBillException{
        List<MenuItem> lista = null;

        prezzo = conto.getOrderPrice(lista,utente);
    }

    @Test
    public void TestScontoSuPiuDi5Gelati() throws TakeAwayBillException{
        lista.add(new MenuItem(MenuItem.ItemType.Gelato, "Coppa bella", 42.00));
        lista.add(new MenuItem(MenuItem.ItemType.Gelato, "Coppa brutta", 41.00));
        lista.add(new MenuItem(MenuItem.ItemType.Gelato, "Coppa da povery", 21.00));
        lista.add(new MenuItem(MenuItem.ItemType.Gelato, "Coppola", 44.00));
        lista.add(new MenuItem(MenuItem.ItemType.Gelato, "Cappolo", 45.00));
        lista.add(new MenuItem(MenuItem.ItemType.Gelato, "Coppa Nafta", 46.00));
        prezzo = conto.getOrderPrice(lista,utente);
        Assert.assertEquals(228.5,prezzo,0);
    }




}