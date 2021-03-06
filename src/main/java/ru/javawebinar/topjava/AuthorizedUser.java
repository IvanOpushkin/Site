package ru.javawebinar.topjava;

import ru.javawebinar.topjava.model.BaseEntity;

import static ru.javawebinar.topjava.util.ProductsUtil.DEFAULT_CALORIES_PER_DAY;

public class AuthorizedUser {
    private static int id = BaseEntity.START_SEQ;

    public static int id() {
        return id;
    }

    public static void setId(int id) {
        AuthorizedUser.id = id;
    }

    public static int getCaloriesPerDay() {
        return DEFAULT_CALORIES_PER_DAY;
    }
}