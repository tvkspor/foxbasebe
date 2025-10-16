package com.be.java.foxbase.db.key;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.io.Serializable;

@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class InteractionId implements Serializable {

    @Column(name = "interact_username", length = 255)
    String interactUsername;

    @Column(name = "creator_username", length = 255)
    String creatorUsername;

    @Column(name = "rated_book_id")
    Long ratedBookId;
}
