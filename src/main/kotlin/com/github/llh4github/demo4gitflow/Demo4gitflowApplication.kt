package com.github.llh4github.demo4gitflow

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.time.LocalDateTime

@SpringBootApplication
class Demo4gitflowApplication

fun main(args: Array<String>) {
    runApplication<Demo4gitflowApplication>(*args)
}

@RestController
class DemoAPI {
    @GetMapping("")
    fun now(): Map<String, Any> {
        return mapOf("now" to LocalDateTime.now())
    }

    @GetMapping("hello")
    fun hello(name: String): Map<String, Any> {
        return mapOf("hello" to "你好呀，$name")
    }
}