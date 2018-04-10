package io.github.rxcats.profile.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDateTime;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import io.github.rxcats.profile.entity.UserProfile;

@SpringBootTest
@RunWith(SpringRunner.class)
public class UserProfileRepositoryTest {

    @Autowired
    private UserProfileRepository repository;

    @Test
    public void saveTest() {

        UserProfile excepted = profile();

        UserProfile actual = repository.save(excepted);

        assertThat(actual).isEqualTo(excepted);

    }

    private UserProfile profile() {
        UserProfile profile = new UserProfile();
        profile.setUserId("34759");
        profile.setAge(20);
        profile.setNickname("rxcats");
        profile.setTodayWord("It is good day.");
        profile.setSex(UserProfile.SEX.MAIL);
        profile.setUpdatedDate(LocalDateTime.now());
        profile.setCreatedDate(LocalDateTime.now());
        return profile;
    }

}
