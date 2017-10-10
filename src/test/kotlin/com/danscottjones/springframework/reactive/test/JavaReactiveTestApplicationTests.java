package com.danscottjones.springframework.reactive.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.security.test.web.reactive.server.SecurityMockServerConfigurers;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavaReactiveTestApplicationTests {

    @Autowired
    private ApplicationContext context;

    private WebTestClient webTestClient;

    @Before
    public void contextLoads() {
        this.webTestClient = WebTestClient
                .bindToApplicationContext(context)
                .apply(SecurityMockServerConfigurers.springSecurity())
                .configureClient()
                .build();
    }

    @Test
    public void test() {
        webTestClient.get().exchange().expectStatus().isOk();
    }

}
