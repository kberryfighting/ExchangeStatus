package Exchange;

import Exchange.config.kafka.KafkaProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;
import java.util.Optional;

@Service
public class ExchangeStatusViewHandler {


    @Autowired
    private ExchangeStatusRepository exchangeStatusRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whenExchangeRequested_then_CREATE_1 (@Payload ExchangeRequested exchangeRequested) {
        try {
            if (exchangeRequested.isMe()) {
                // view 객체 생성
                ExchangeStatus exchangeStatus = new ExchangeStatus();
                // view 객체에 이벤트의 Value 를 set 함
                exchangeStatus.setId(exchangeRequested.getId());
                exchangeStatus.setExchangeId(exchangeRequested.getExchangeId());
                exchangeStatus.setOwnerId(exchangeRequested.getOwnerId());
                // view 레파지 토리에 save
                exchangeStatusRepository.save(exchangeStatus);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @StreamListener(KafkaProcessor.INPUT)
    public void whenExchangeDeclined_then_UPDATE_1(@Payload ExchangeDeclined exchangeDeclined) {
        try {
            if (exchangeDeclined.isMe()) {
                // view 객체 조회
                List<ExchangeStatus> exchangeStatusList = exchangeStatusRepository.findByExchangeId(exchangeDeclined.getExchangeId());
                for(ExchangeStatus exchangeStatus : exchangeStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    exchangeStatus.setStatus(exchangeDeclined.getStatus());
                    exchangeStatus.setExchangeId(exchangeDeclined.getExchangeId());
                    // view 레파지 토리에 save
                    exchangeStatusRepository.save(exchangeStatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenExchangeApproved_then_UPDATE_2(@Payload ExchangeApproved exchangeApproved) {
        try {
            if (exchangeApproved.isMe()) {
                // view 객체 조회
                List<ExchangeStatus> exchangeStatusList = exchangeStatusRepository.findByExchangeId(exchangeApproved.getExchangeId());
                for(ExchangeStatus exchangeStatus : exchangeStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    exchangeStatus.setStatus(exchangeApproved.getStatus());
                    exchangeStatus.setExchangeId(exchangeApproved.getExchangeId());
                    // view 레파지 토리에 save
                    exchangeStatusRepository.save(exchangeStatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @StreamListener(KafkaProcessor.INPUT)
    public void whenExchangeApproved_then_UPDATE_3(@Payload ExchangeApproved exchangeApproved) {
        try {
            if (exchangeApproved.isMe()) {
                // view 객체 조회
                List<ExchangeStatus> exchangeStatusList = exchangeStatusRepository.findByExchangeId(exchangeApproved.getExchangeId());
                for(ExchangeStatus exchangeStatus : exchangeStatusList){
                    // view 객체에 이벤트의 eventDirectValue 를 set 함
                    exchangeStatus.setStatus(exchangeApproved.getStatus());
                    exchangeStatus.setExchangeId(exchangeApproved.getExchangeId());
                    // view 레파지 토리에 save
                    exchangeStatusRepository.save(exchangeStatus);
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}