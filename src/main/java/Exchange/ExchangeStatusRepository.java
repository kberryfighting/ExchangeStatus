package Exchange;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ExchangeStatusRepository extends CrudRepository<ExchangeStatus, Long> {

    List<ExchangeStatus> findByExchangeId(Long exchangeId);
    List<ExchangeStatus> findByExchangeId(Long exchangeId);
    List<ExchangeStatus> findByExchangeId(Long exchangeId);

}