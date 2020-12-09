////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;
import it.unipd.tos.business.exception.TakeAwayBillException;

public class Bill implements TakeAwayBill{
    public double getOrderPrice(List<MenuItem> itemsOrdered, User user) throws TakeAwayBillException{
        double orderTotal = 0.0;

        if(itemsOrdered == null) {
            throw new TakeAwayBillException("L'ordine è vuoto");
        }
        if(itemsOrdered.contains(null)) {
            throw new TakeAwayBillException("L'ordine contiene un elemento inesistente");
        }

        for(MenuItem item : itemsOrdered) {
            orderTotal += item.getPrice();
        }

        return orderTotal;
    }
}