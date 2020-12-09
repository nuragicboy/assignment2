////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////
package it.unipd.tos.business;

import java.util.List;
import it.unipd.tos.model.MenuItem;
import it.unipd.tos.model.User;
import it.unipd.tos.business.exception.TakeAwayBillException;

public class Bill implements TakeAwayBill {
    public double getOrderPrice(List<MenuItem> itemsOrdered, User user) throws TakeAwayBillException {
        double totale = 0.0;
        int numeroGelati = 0;
        MenuItem menoCaro = null;

        if (itemsOrdered == null) {
            throw new TakeAwayBillException("L'ordine è vuoto");
        }
        if (itemsOrdered.contains(null)) {
            throw new TakeAwayBillException("L'ordine contiene un elemento inesistente");
        }

        for (MenuItem i : itemsOrdered) {
            totale += i.getPrice();
            if (MenuItem.ItemType.Gelato == i.getItemType()) {
                numeroGelati++;
                if (menoCaro == null || menoCaro.getPrice() > i.getPrice()) menoCaro = i;


            }


            if (numeroGelati > 5) {
                totale -= 0.5 * menoCaro.getPrice();
            }
        }

    return totale;


    }
}