package at.nineyards.blog.namecloud.integration

import at.nineyards.blog.namecloud.FirstNameTestFakeDb
import at.nineyards.blog.namecloud.extension.typeRef
import at.nineyards.blog.namecloud.model.FirstName
import org.assertj.core.api.Assertions
import org.junit.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.web.client.TestRestTemplate
import org.springframework.http.HttpMethod
import kotlin.math.min

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class FirstNameTest : FirstNameTestFakeDb(){
    @Autowired
    lateinit var restTemplate : TestRestTemplate

    @Test
    fun testTop10(){
        val body = restTemplate.exchange("/top10",HttpMethod.GET,null, typeRef<List<FirstName>>()).body
        val expected = FirstNameTestFakeDb.testData.sortedBy { it.rank }.subList(0, min(testData.size,10))

        Assertions.assertThat(body).isEqualTo(expected)
    }
}