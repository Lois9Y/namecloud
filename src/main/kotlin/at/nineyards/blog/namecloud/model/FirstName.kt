package at.nineyards.blog.namecloud.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias

@TypeAlias("first_name")
data class FirstName(val sex : Int,
                     val name : String,
                     val rank : Int,
                     val count : Int,
                     @Id var id : String? = null) {
    constructor(): this(-1,"",-1,-1)
}