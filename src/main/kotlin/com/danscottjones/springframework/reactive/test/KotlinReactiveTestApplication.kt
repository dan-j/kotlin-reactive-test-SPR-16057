package com.danscottjones.springframework.reactive.test

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class KotlinReactiveTestApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinReactiveTestApplication::class.java, *args)
}
