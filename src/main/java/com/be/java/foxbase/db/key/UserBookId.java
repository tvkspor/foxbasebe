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
public class UserBookId implements Serializable {

    @Column(name = "username", length = 255)
    String username;

    @Column(name = "book_id")
    Long bookId;
}

