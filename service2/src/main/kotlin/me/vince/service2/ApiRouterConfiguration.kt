package me.vince.service2

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.web.reactive.function.server.bodyValueAndAwait
import org.springframework.web.reactive.function.server.coRouter

@Configuration
class ApiRouterConfiguration {
    @Bean
    fun routes(): RouterFunction<ServerResponse> {
        return coRouter {
            GET("/name") {
                ServerResponse.ok().bodyValueAndAwait("Service 2")
            }
        }
    }
}
