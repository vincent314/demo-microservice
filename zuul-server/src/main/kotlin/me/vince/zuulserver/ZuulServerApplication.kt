package me.vince.zuulserver

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.client.discovery.EnableDiscoveryClient

@SpringBootApplication
@EnableDiscoveryClient
class ZuulServerApplication

fun main(args: Array<String>) {
	runApplication<ZuulServerApplication>(*args)
}
