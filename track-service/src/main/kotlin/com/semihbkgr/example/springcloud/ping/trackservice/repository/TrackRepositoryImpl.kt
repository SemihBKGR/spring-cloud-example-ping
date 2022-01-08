package com.semihbkgr.example.springcloud.ping.trackservice.repository

import com.semihbkgr.example.springcloud.ping.models.Metric
import com.semihbkgr.example.springcloud.ping.models.Track
import com.semihbkgr.example.springcloud.ping.trackservice.repository.TrackRepository.Companion.COLLECTION_NAME
import org.springframework.data.mongodb.core.ReactiveMongoTemplate
import org.springframework.data.mongodb.core.findById
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.data.mongodb.core.query.Update
import org.springframework.stereotype.Repository
import reactor.core.publisher.Mono

@Repository
class TrackRepositoryImpl(val reactiveMongoTemplate: ReactiveMongoTemplate) : TrackRepository {

    override fun findById(id: String): Mono<Track> {
        return reactiveMongoTemplate.findById(id, COLLECTION_NAME)
    }

    override fun addMetric(id: String, metric: Metric): Mono<Unit> {
        return count(id).flatMap { count ->
            if (count != null || count == 0L) {
                val track = Track(id, listOf(metric))
                return@flatMap reactiveMongoTemplate
                    .save(track, COLLECTION_NAME)
                    .thenReturn(Unit)
            } else {
                val update = Update()
                update.addToSet("metrics", metric)
                val criteria = Criteria.where("_id").`is`(id)
                return@flatMap reactiveMongoTemplate
                    .updateFirst(Query.query(criteria), update, COLLECTION_NAME)
                    .thenReturn(Unit)
            }
        }

    }

    fun count(id: String): Mono<Long> {
        val criteria = Criteria.where("_id").`is`(id)
        val query = Query.query(criteria)
        return reactiveMongoTemplate.count(query, COLLECTION_NAME)
    }

}