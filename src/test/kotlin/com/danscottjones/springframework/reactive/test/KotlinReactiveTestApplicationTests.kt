package com.danscottjones.springframework.reactive.test

import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import org.springframework.security.test.web.reactive.server.SecurityMockServerConfigurers
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.reactive.server.WebTestClient

@RunWith(SpringRunner::class)
@SpringBootTest
class KotlinReactiveTestApplicationTests {

	@Autowired
    lateinit var context: ApplicationContext

    lateinit var webTestClient: WebTestClient

	@Before
	fun contextLoads() {
        webTestClient = WebTestClient
                .bindToApplicationContext(context)
                .apply(SecurityMockServerConfigurers.springSecurity())
                .configureClient()
                .build()
	}

    @Test
    fun test() {

    }

}
