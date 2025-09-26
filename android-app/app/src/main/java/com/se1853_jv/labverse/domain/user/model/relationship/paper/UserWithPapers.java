package com.se1853_jv.labverse.domain.user.model.relationship.paper;

import androidx.room.Embedded;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.user.model.Users;

import java.util.List;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserWithPapers {
    @Embedded
    Users user;

    @Relation(
            parentColumn = "id", // id của entity 1
            entityColumn = "userOwnerId" // khóa ngoại của entity M
    )
    List<PaperResearch> papers;
}
