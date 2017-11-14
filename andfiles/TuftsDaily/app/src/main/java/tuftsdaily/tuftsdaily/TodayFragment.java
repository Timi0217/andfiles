package tuftsdaily.tuftsdaily;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Benard Ngaruiya on 10/31/2017.
 *
 *
 *
 */



public class TodayFragment extends Fragment {
    private String title;
    private int page;
    View myView;



    public static TodayFragment newInstance(int page, String title) {
        TodayFragment fragmentToday = new TodayFragment();
        Bundle args = new Bundle();
        args.putInt("pageNumber", page);
        args.putString("Today", title);
        fragmentToday.setArguments(args);
        return fragmentToday;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page = getArguments().getInt("pageNumber", 0);
        title = getArguments().getString("Today");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {


        myView = inflater.inflate(R.layout.today, container, false);
        return myView;
    }
}
