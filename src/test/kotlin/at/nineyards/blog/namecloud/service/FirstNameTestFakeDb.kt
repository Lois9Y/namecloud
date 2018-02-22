package at.nineyards.blog.namecloud.service

import at.nineyards.blog.namecloud.model.FirstName
import at.nineyards.blog.namecloud.repository.FirstNameRepository
import com.github.fakemongo.junit.FongoRule
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
abstract class FirstNameTestFakeDb (val initializeTestData: Boolean = true){
    @get:Rule
    val fongoRule = FongoRule()

    @Autowired
    lateinit var firstNameRepository: FirstNameRepository

    @Before
    fun setupFakeDatabase(){
        if(initializeTestData){
            firstNameRepository.save(testData)
        }
    }

    companion object {
        val testData = listOf<FirstName>(
            FirstName(2,"Anna",1,130),
            FirstName(2,"Emma",11,76),//2;Emma;11;76;0
            FirstName(2,"Katharina",15,62),//2;Katharina;15;62;0
            FirstName(2,"Sarah",5,108),//2;Sarah;5;108;1
            FirstName(2,"Lea",12,74)//2;Lea;12;74;0
        )
    }
}