package ru.geekbrains.android3_4.mvp.model.repo;

import io.reactivex.Observable;
import java.util.ArrayList;
import ru.geekbrains.android3_4.mvp.model.api.ApiHolder;
import ru.geekbrains.android3_4.mvp.model.entity.Repos;
import ru.geekbrains.android3_4.mvp.model.entity.User;

public class UsersRepo
{
    public Observable<User> getUser(String username)
    {
        return ApiHolder.getApi().getUser(username);
    }

    public Observable<ArrayList<Repos>> getRepos(String username) {

        return ApiHolder.getApi().getRepos(username);
    }
}
