# kotlin-reactive-test-SPR-16057

Demo app reproducing issue [SPR-16057](https://jira.spring.io/browse/SPR-16057)

The code fails to compile in Kotlin but works fine in Java. If 
`org.springframework.test.web.reactive.server.ApplicationContextSpec` had public visibility then everything
would be workable because we can force Kotlin to infer the type but since it's visibility is 'default' 
we're a little stuck
