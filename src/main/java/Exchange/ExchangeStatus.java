package Exchange;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="ExchangeStatus_table")
public class ExchangeStatus {

        @Id
        @GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;
        private Long exchangeId;
        private Long ownerId;
        private String exchangeDate;
        private String status;
        private String userName;


        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }
        public Long getExchangeId() {
            return exchangeId;
        }

        public void setExchangeId(Long exchangeId) {
            this.exchangeId = exchangeId;
        }
        public Long getOwnerId() {
            return ownerId;
        }

        public void setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
        }
        public String getExchangeDate() {
            return exchangeDate;
        }

        public void setExchangeDate(String exchangeDate) {
            this.exchangeDate = exchangeDate;
        }
        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
        public String getUserName() {
            return userName;
        }

        public void setUserName(String userName) {
            this.userName = userName;
        }

}
