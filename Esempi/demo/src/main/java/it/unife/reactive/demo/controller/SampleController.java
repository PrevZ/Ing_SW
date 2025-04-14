package it.unife.reactive.demo.controller;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import org.springframework.http.MediaType;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class SampleController {
    @GetMapping("/sample")
    public String sampleEndpoint() {
        return "Hello, World!";
    }

    @GetMapping(value = "/sample2", produces = { MediaType.TEXT_EVENT_STREAM_VALUE })
    public Flux<Integer> sampleEndpoint2() {
        return Flux.range(1, 5)
                .map(n -> n * 2)
                .filter(n -> n % 4 == 0)
                .delayElements(Duration.of(2, ChronoUnit.SECONDS));
    }
}
