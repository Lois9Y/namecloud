package at.nineyards.blog.namecloud

import com.github.fakemongo.Fongo
import com.mongodb.Mongo
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.annotation.Configuration
import org.springframework.core.env.Environment
import org.springframework.data.mongodb.config.AbstractMongoConfiguration


@Configuration
class TestConfiguration : AbstractMongoConfiguration() {
    @Autowired
    lateinit var env: Environment

    override fun getDatabaseName() =
            env.getProperty("mongo.db.name", "test")


    override fun mongo(): Mongo {
        logger.info("Instantiating fake db with name $databaseName.")
        return Fongo(databaseName).mongo
    }

    companion object {
        val logger: Logger =
                LoggerFactory.getLogger(TestConfiguration::class.java)
    }
}