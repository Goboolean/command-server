package io.goboolean.command.adapter.in.web;

import io.goboolean.command.adapter.out.kafka.KafkaProducer;
import io.goboolean.command.domain.entity.KafkaEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer producer;

    @PostMapping("/kafka/produce/cluster")
    public String sendMessage(@RequestBody KafkaEntity message) {
        producer.send(message);

        return "ok";
    }
}
