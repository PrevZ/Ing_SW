package test.java.it.unife.reactive.demo2.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ChatMessageController {

    private final ChatMessageController service;

    public ChatMessageController(ChatMessageController service) {
        this.service = service;
    }

    @GetMapping(value = "/api/messages", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<ChatMessage> streamNewMessages() {
        return service.streamNewMessages();
    }

    @PostMapping(path = "/api/message", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Mono<ChatMessage> saveMessage(@RequestBody ChatMessage message) {
        return service.saveMessage(message);
    }

}
