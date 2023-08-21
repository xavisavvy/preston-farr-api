package com.prestonfarr.kotlinserverdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class KotlinServerDemoApplication

fun main(args: Array<String>) {
	runApplication<KotlinServerDemoApplication>(*args)
}
