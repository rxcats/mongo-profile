package io.github.rxcats.profile.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Repository;

@Repository
public class UserProfileCustomRepository {

    @Autowired
    private MongoOperations mongoOperations;

}
