////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

import static org.junit.Assert.assertEquals;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class OrderTest {

    private User utente;
    private List<MenuItem> lista;
    private Order ordine;

    @Before
    public void setup(){
        utente = new User("Harry", "Potter", "erripotte", 19);
        lista = new ArrayList<>();
        lista.add(new MenuItem(MenuItem.ItemType.Bevanda, "Cola", 3.00));
        ordine = new Order(lista, utente, LocalTime.NOON, 3.00);

    }

    @Test
    public void getOrarioTest() {
        assertEquals(43200,ordine.getOrario().toSecondOfDay());
    }

    @Test
    public void getUtenteTest() {
        assertEquals(utente, ordine.getUtente());
    }

    @Test
    public void getArticoliTest() {
        assertEquals(lista, ordine.getArticoli());
    }

    @Test
    public void getPrezzoTest() {
        assertEquals(3.00,ordine.getPrezzo(),0.01);
    }





}