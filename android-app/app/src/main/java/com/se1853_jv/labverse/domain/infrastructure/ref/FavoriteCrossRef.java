package com.se1853_jv.labverse.domain.infrastructure.ref;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.se1853_jv.labverse.domain.infrastructure.paper.model.PaperResearch;
import com.se1853_jv.labverse.domain.infrastructure.user.model.Users;

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
@Entity(
        tableName = "favorite",
        primaryKeys = {"paperResearchId", "userId"},
        foreignKeys = {
                @ForeignKey(
                        entity = PaperResearch.class,
                        parentColumns = "id",
                        childColumns = "paperResearchId"
                ),
                @ForeignKey(
                        entity = Users.class,
                        parentColumns = "id",
                        childColumns = "userId"
                )
        }
)
public class FavoriteCrossRef {
    @NonNull
    String paperResearchId;

    @NonNull
    String userId;
}
