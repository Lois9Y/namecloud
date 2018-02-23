package at.nineyards.blog.namecloud.service

import at.nineyards.blog.namecloud.FirstNameTestFakeDb
import org.assertj.core.api.Assertions.assertThat
import org.springframework.beans.factory.annotation.Autowired
import kotlin.math.min
import kotlin.test.Test

class FirstNameServiceTest : FirstNameTestFakeDb() {
    @Autowired
    lateinit var firstNameService: FirstNameService

    @Test
    fun testTop10(){
        val top10 = firstNameService.getTop10()
        val expected = FirstNameTestFakeDb.testData.sortedBy { it.rank }.subList(0,min(FirstNameTestFakeDb.testData.size,10))
        assertThat(top10).isEqualTo(expected)
    }
}