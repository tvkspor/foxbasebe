package com.be.java.foxbase.db.key;

import jakarta.persistence.Embeddable;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@EqualsAndHashCode
public class UserBookRatingId implements Serializable {

    @Column(name = "creator_username", length = 255)
    String creatorUsername;

    @Column(name = "rated_book_id")
    Long ratedBookId;
}