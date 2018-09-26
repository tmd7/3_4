package ru.geekbrains.android3_4.mvp.model.api;

import io.reactivex.Observable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ru.geekbrains.android3_4.mvp.model.entity.Repos;
import ru.geekbrains.android3_4.mvp.model.entity.User;

public interface IDataSource
{
    @GET("/users/{user}")
    Observable<User> getUser(@Path("user") String username);

    @GET("/users/{user}/repos")
    Observable<ArrayList<Repos>> getRepos(@Path("user") String username);
}
