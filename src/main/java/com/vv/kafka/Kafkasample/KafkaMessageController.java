package com.vv.kafka.Kafkasample;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaMessageController {


    KafkaTemplate<String,String> kafkaTemplate;

    @PostMapping("/sendMessage/{name}")
    public void sendStringMessage(@PathVariable("name") String name)
    {
        System.out.println("Name::"+name);
        kafkaTemplate.send("t_test",name);
        System.out.println("Message is Post..");
    }


}
