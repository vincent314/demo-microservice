package me.vince.service2

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class Service2Controller(
    @Value("\${server.port}") val port: Int
) {

    @GetMapping("/info")
    suspend fun info(): Info {
        return Info("Service2", port)
    }
}
