package com.se1853_jv.labverse.domain.user.model;

import androidx.room.Embedded;
import androidx.room.Entity;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.paper.model.PaperResearch;

import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
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
