////////////////////////////////////////////////////////////////////
// [STEFANO] [MANUNZA] [1187642]
////////////////////////////////////////////////////////////////////

package it.unipd.tos.model;

public class MenuItem {
    public enum ItemType {Gelato,Budino,Bevanda}

    private ItemType itemType;
    private String name;
    private double price;

    public MenuItem(ItemType itemType, String name, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Nome vuoto");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("Prezzo non valido");
        }
        if (itemType == null) {
            throw new IllegalArgumentException("Tipo non valido");
        }

        this.itemType = itemType;
        this.name = name;
        this.price = price;

    }

    public ItemType getItemType() {
        return itemType;
    }

    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }


}
