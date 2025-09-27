package com.se1853_jv.labverse.domain.infrastructure.ref;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.ForeignKey;

import com.se1853_jv.labverse.domain.infrastructure.team.model.Team;
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
        tableName = "users_team",
        primaryKeys = {"userId", "teamId"},
        foreignKeys = {
                @ForeignKey(
                        entity = Users.class,
                        parentColumns = "id",
                        childColumns = "memberId"
                ),
                @ForeignKey(
                        entity = Team.class,
                        parentColumns = "id",
                        childColumns = "teamId"
                )
        }
)
public class UsersTeamCrossRef {
    @NonNull
    String memberId;

    @NonNull
    String teamId;
}
