package com.se1853_jv.labverse.domain.infrastructure.ref;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.se1853_jv.labverse.domain.infrastructure.annotation.model.Highlight;
import com.se1853_jv.labverse.domain.infrastructure.annotation.model.Note;
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
        tableName = "user_highlight",
        primaryKeys = {"ownerId", "highlightId"},

        foreignKeys = {
                @ForeignKey(
                        entity = Users.class,
                        parentColumns = "id",
                        childColumns = "ownerId"
                ),
                @ForeignKey(
                        entity = Highlight.class,
                        parentColumns = "id",
                        childColumns = "highlightId"
                )
        }
)
public class UsersHighlightCrossRef {
    @NonNull
    String ownerId;

    @NonNull
    String noteId;
}
