package ru.geekbrains.android3_4.mvp.view;


import com.arellomobile.mvp.MvpView;
import com.arellomobile.mvp.viewstate.strategy.AddToEndSingleStrategy;
import com.arellomobile.mvp.viewstate.strategy.StateStrategyType;
import java.util.ArrayList;
import ru.geekbrains.android3_4.mvp.model.entity.Repos;

@StateStrategyType(AddToEndSingleStrategy.class)
public interface MainView extends MvpView
{
    void setUsernameText(String username);
    void loadImage(String url);

    void onSetAdapter(ArrayList<Repos> repos);
}
