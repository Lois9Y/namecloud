package at.nineyards.blog.namecloud.service

import org.assertj.core.api.Assertions.assertThat
import org.springframework.beans.factory.annotation.Autowired
import kotlin.test.Test

class FirstNameServiceTest :FirstNameTestFakeDb() {
    @Autowired
    lateinit var firstNameService: FirstNameService

    @Test
    fun testTop10(){
        val top10 = firstNameService.getTop10()
        assertThat(top10[0]).isEqualTo(FirstNameTestFakeDb.testData[0])
    }
}