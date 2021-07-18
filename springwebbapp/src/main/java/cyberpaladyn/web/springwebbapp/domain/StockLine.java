package cyberpaladyn.web.springwebbapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StockLine {
    @Id
    private String itemId;
    @Id
    private int rtlLocId;
    @Id
    private String bucketId;
    private Item item;
    private int quantity;

    public String getItemId() {
        return itemId;
    }

    public int getRtlLocId() {
        return rtlLocId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getBucketId() {
        return bucketId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setRtlLocId(int rtlLocId) {
        this.rtlLocId = rtlLocId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setBucketId(String bucketId) {
        this.bucketId = bucketId;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        this.itemId = item.getItemId();
    }

    public StockLine() {
    }
}
