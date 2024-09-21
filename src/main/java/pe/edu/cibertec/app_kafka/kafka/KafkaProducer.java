package pe.edu.cibertec.app_kafka.kafka;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Slf4j
@RequiredArgsConstructor
@Service
public class KafkaProducer {

    private final KafkaTemplate<String, String> kafkaTemplate;
    private static final String TOPIC = "topic_cibertec-app";

    public void enviarMensaje(String mensaje){
        kafkaTemplate.send(TOPIC, mensaje);
        log.info("Mensaje construido listo para enviar a Kafka");
    }
}
