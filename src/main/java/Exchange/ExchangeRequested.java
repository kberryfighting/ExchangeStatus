package Exchange;

public class ExchangeRequested extends AbstractEvent {

    private Long id;
    private Long OwnerID;
    private String userName;
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
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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