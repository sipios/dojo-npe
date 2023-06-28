package com.sipios.keiko.controller.dto;

import com.sipios.keiko.model.UserEntity;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

public class UserMapper {

    public static User fromEntity(UserEntity userEntity) {
        User user = new User();
        user.setCivility(Civility.findByKey(userEntity.getCivility()));
        user.setId(userEntity.getId());
        user.setLastName(userEntity.getLastName());
        user.setFirstName(userEntity.getFirstName());
        user.setBirthDate(userEntity.getBirthDate());
        user.setMajor(userEntity.getBirthDate().plus(18, ChronoUnit.YEARS).isBefore(LocalDate.now()));
        user.setFamilleNombreuse(isFamilleNombreuse(userEntity.getChildren()));
        return user;
    }

    private static boolean isFamilleNombreuse(int numberOfChildren) {
        return numberOfChildren>=3;
    }

    public static List<User> fromEntities(List<UserEntity> userEntities) {
        return userEntities.stream().map(UserMapper::fromEntity).toList();
    }
}
