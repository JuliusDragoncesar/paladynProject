package cyberpaladyn.web.springwebbapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class TransUserConnection {
    @Id
    private String transId;
    @Id
    private Date transDate;
    @Id
    private int rtlLocId;
    private String userId;
    private Transaction transaction;
    private User user;

    public String getTransId() {
        return transId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public int getRtlLocId() {
        return rtlLocId;
    }

    public String getUserId() {
        return userId;
    }

    public Transaction getTransaction() {
        return transaction;
    }

    public User getUser() {
        return user;
    }

    public void setTransId(String transId) {
        this.transId = transId;
    }

    public void setTransDate(Date transDate) {
        this.transDate = transDate;
    }

    public void setRtlLocId(int rtlLocId) {
        this.rtlLocId = rtlLocId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setTransaction(Transaction transaction) {
        this.transaction = transaction;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
