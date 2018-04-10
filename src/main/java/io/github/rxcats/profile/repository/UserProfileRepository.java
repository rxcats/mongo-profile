package io.github.rxcats.profile.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.github.rxcats.profile.entity.UserProfile;

public interface UserProfileRepository extends MongoRepository<UserProfile, String> {

}
