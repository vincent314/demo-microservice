package me.vince.service1

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.client.WebClient

@Configuration
class WebClientConfiguration(@Value("\${service2.baseUrl}") val baseUrl: String) {
    @Bean
    @LoadBalanced
    fun webClientBuilder():WebClient.Builder {
        return WebClient.builder()
            .baseUrl(baseUrl)
    }

    @Bean
    fun webClient():WebClient{
        return webClientBuilder().build()
    }
}
