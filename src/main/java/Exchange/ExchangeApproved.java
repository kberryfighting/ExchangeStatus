package Exchange;

public class ExchangeApproved extends AbstractEvent {

    private Long id;
    private Long OwnerID;
    private String status;
    private String ExchangeDate;
    private Long ExchangeID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getOwnerId() {
        return OwnerID;
    }

    public void setOwnerId(Long OwnerID) {
        this.OwnerID = OwnerID;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getExchangeDate() {
        return ExchangeDate;
    }

    public void setExchangeDate(String ExchangeDate) {
        this.ExchangeDate = ExchangeDate;
    }
    public Long getExchangeId() {
        return ExchangeID;
    }

    public void setExchangeId(Long ExchangeID) {
        this.ExchangeID = ExchangeID;
    }
}