package cyberpaladyn.web.springwebbapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.Date;

@Entity
public class TransactionLine {
    @Id
    private int transId;
    @Id
    private Date transDate;
    @Id
    private int rtlLocId;
    @Id
    private int transLineId;
    private String itemId;
    private Item item;
    private int quantity;
    private boolean isReturn;
    private Transaction transaction;

    public int getTransId() {
        return transId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public int getRtlLocId() {
        return rtlLocId;
    }

    public int getTransLineId() {
        return transLineId;
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public void setRtlLocId(int rtlLocId) {
        this.rtlLocId = rtlLocId;
    }

    public void setTransLineId(int transLineId) {
        this.transLineId = transLineId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
        this.transId = transaction.getTransId();
        this.transDate = transaction.getTransDate();
        this.rtlLocId = transaction.getRtlLocId();
    }

    public boolean isReturn() {
        return isReturn;
    }

    public void setReturn(boolean aReturn) {
        isReturn = aReturn;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
        this.itemId = item.getItemId();
    }
}
