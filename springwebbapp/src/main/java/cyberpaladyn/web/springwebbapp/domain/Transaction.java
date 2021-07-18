package cyberpaladyn.web.springwebbapp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Transaction {
    @Id
    private int transId;
    @Id
    private Date transDate;
    @Id
    private int rtlLocId;
    private List<TransactionLine> transLines = new ArrayList<>();

    public int getTransId() {
        return transId;
    }

    public Date getTransDate() {
        return transDate;
    }

    public int getRtlLocId() {
        return rtlLocId;
    }

    public List<TransactionLine> getTransLines() {
        return transLines;
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

//    public void setTransLines(List<TransactionLine> transLines) {
//        this.transLines = transLines;
//    }

    public void addTransLine(TransactionLine line){
        line.setTransaction(this);
        line.setTransLineId(this.getTransLines().size());
        this.transLines.add(line);
    }

    public void addTransLines(List<TransactionLine> lines){
        lines.stream().forEach(this::addTransLine);
    }
}
