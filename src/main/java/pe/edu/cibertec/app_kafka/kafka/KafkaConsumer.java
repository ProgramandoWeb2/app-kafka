package pe.edu.cibertec.app_kafka.kafka;

import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class KafkaConsumer {

    @KafkaListener(topics = "topic_cibertec-app", groupId = "group_cibertec")
    public void obtenerMensaje(String mensaje){
        log.info("Mensaje recibido desde Kafka " + mensaje);
    }
}
