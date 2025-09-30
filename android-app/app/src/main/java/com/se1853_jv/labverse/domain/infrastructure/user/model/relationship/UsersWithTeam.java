package com.se1853_jv.labverse.domain.infrastructure.user.model.relationship;

import androidx.room.Embedded;
import androidx.room.Junction;
import androidx.room.Relation;

import com.se1853_jv.labverse.domain.infrastructure.ref.UsersTeamCrossRef;
import com.se1853_jv.labverse.domain.infrastructure.team.model.Team;
import com.se1853_jv.labverse.domain.infrastructure.user.model.Users;

import java.util.List;

public class UsersWithTeam {
    @Embedded
    Users users;

    @Relation(

            parentColumn = "id",
            entityColumn = "id",
            associateBy = @Junction(
                    value = UsersTeamCrossRef.class,
                    parentColumn = "memberId",
                    entityColumn = "teamId"
            )
    )
    List<Team> teams;
}
