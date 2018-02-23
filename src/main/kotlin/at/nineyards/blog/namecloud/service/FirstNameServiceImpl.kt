package at.nineyards.blog.namecloud.service

import at.nineyards.blog.namecloud.model.FirstName
import at.nineyards.blog.namecloud.repository.FirstNameRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service("firstNameService")
class FirstNameServiceImpl :FirstNameService {

    @Autowired
    lateinit var firstNameRepository: FirstNameRepository

    override fun getTop10(): List<FirstName> = firstNameRepository.findTop10ByOrderByRankAsc()
}