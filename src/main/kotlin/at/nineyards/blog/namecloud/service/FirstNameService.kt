package at.nineyards.blog.namecloud.service

import at.nineyards.blog.namecloud.model.FirstName

interface FirstNameService {
    fun getTop10() : List<FirstName>
}