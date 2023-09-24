package me.vince.service1

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.reactive.function.client.WebClient
import org.springframework.web.reactive.function.client.awaitBody

@RestController
class Service1Controller(val webClient: WebClient) {

    @GetMapping("/greetings")
    suspend fun greetings(): String {
        val (name, port) = webClient.get()
            .uri("/info")
            .retrieve().awaitBody<Info>()
        return "Greetings from $name ($port)"
    }
}
