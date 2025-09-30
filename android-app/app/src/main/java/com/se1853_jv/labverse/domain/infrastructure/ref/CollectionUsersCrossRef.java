package com.se1853_jv.labverse.domain.infrastructure.ref;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.se1853_jv.labverse.domain.infrastructure.collection.model.Collection;
import com.se1853_jv.labverse.domain.infrastructure.role.model.Roles;
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
        tableName = "collection_users",
        primaryKeys = {"collectionId", "memberId"},
        foreignKeys = {
                @ForeignKey(
                        entity = Roles.class,
                        parentColumns = "id",
                        childColumns = "roleId"
                ),
                @ForeignKey(
                        entity = Users.class,
                        parentColumns = "id",
                        childColumns = "memberId"
                ),
                @ForeignKey(
                        entity = Collection.class,
                        parentColumns = "id",
                        childColumns = "collectionId"
                )
        }
)
public class CollectionUsersCrossRef {
    @NonNull
    String collectionId;

    @NonNull
    String memberId;

    @NonNull
    String roleId;
}
