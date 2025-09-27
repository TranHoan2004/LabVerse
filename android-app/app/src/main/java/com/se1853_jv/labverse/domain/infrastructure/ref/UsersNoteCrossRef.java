package com.se1853_jv.labverse.domain.infrastructure.ref;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

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
        tableName = "users_note",
        primaryKeys = {"ownerId", "noteId"},
        foreignKeys = {
                @ForeignKey(
                        entity = Users.class,
                        parentColumns = "id",
                        childColumns = "ownerId"
                ),
                @ForeignKey(
                        entity = Note.class,
                        parentColumns = "id",
                        childColumns = "noteId"
                )
        }
)
public class UsersNoteCrossRef {
    @NonNull
    String ownerId;

    @NonNull
    String noteId;
}
