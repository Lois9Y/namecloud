package at.nineyards.blog.namecloud.controller

import at.nineyards.blog.namecloud.service.FirstNameService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FirstNameController{
    @Autowired
    lateinit var firstNameService: FirstNameService

    @RequestMapping("/top10")
    fun top10 () = firstNameService.getTop10()
}