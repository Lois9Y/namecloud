package at.nineyards.blog.namecloud.repository

import at.nineyards.blog.namecloud.model.FirstName
import org.springframework.data.repository.CrudRepository

interface FirstNameRepository : CrudRepository<FirstName, Long> {
    fun findTop10ByOrderByRankDesc():List<FirstName>
}