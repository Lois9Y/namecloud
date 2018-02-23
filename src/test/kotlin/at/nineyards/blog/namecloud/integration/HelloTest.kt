package at.nineyards.blog.namecloud.integration

import at.nineyards.blog.namecloud.FirstNameTestFakeDb
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.test.context.junit4.SpringRunner
import kotlin.math.min

@RunWith(SpringRunner::class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloTest{
    @Autowired
    lateinit var restTemplate : TestRestTemplate

    @Test
    fun helloTest(){
        val body = restTemplate.getForObject("/hello",String::class.java)

        assertThat(body).isEqualTo("Hi There")
    }
}