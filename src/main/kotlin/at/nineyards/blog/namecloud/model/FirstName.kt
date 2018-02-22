package at.nineyards.blog.namecloud.model

import org.springframework.data.annotation.Id
import org.springframework.data.annotation.TypeAlias

@TypeAlias("first_name")
//SEX;GIVEN_NAME;RANG;NUMBER;PERCENTOFSEX;REF_YEAR
data class FirstName(val sex : Int,
                     val name : String,
                     val rank : Int,
                     val count : Int) {
}