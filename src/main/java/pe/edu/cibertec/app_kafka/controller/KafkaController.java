package pe.edu.cibertec.app_kafka.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.app_kafka.kafka.KafkaProducer;

@RequiredArgsConstructor
@RestController
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @GetMapping("/enviar")
    public String enviarMensaje(@RequestParam String mensaje){
        kafkaProducer.enviarMensaje(mensaje);
        return "Mensaje enviado a Kafka";
    }
}
