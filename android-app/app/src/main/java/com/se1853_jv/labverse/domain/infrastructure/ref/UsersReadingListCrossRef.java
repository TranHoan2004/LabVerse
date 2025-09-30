package com.se1853_jv.labverse.domain.infrastructure.ref;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.se1853_jv.labverse.domain.enumerate.ReadingType;
import com.se1853_jv.labverse.domain.infrastructure.readinglist.model.ReadingList;
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
        tableName = "user_readinglist",
        primaryKeys = {"userId", "readingListId"},
        foreignKeys = {
                @ForeignKey(
                        entity = ReadingList.class,
                        parentColumns = "id",
                        childColumns = "readingListId"
                ),
                @ForeignKey(
                        entity = Users.class,
                        parentColumns = "id",
                        childColumns = "userId"
                )
        }
)
public class UsersReadingListCrossRef {
    @NonNull
    String userId;

    @NonNull
    String readingListId;

    @NonNull
    ReadingType type;
}
