package io.github.rxcats.profile.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class UserProfile {

    /**
     * shard key
     */
    @Id
    private String userId;

    private String nickname;

    private int age;

    private SEX sex;

    private String todayWord;

    private LocalDateTime updatedDate;

    private LocalDateTime createdDate;

    public enum SEX {
        NONE, MAIL, FEMAIL
    }

}
