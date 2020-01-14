package com.vv.kafka.Kafkasample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaJsonMessageController {

    public static final String TOPIC = "t_test";

    @Autowired
    KafkaTemplate<String,User> kafkaTemplate;
    @PostMapping("/sendJsonMessage/{name}")
    public void sendJsonMessage(@PathVariable ("name") String name)
    {
        System.out.println("Name::"+name);
        kafkaTemplate.send(TOPIC,new User("varanasi","venkatesh","software"));
        System.out.println("Posted");
    }
}
