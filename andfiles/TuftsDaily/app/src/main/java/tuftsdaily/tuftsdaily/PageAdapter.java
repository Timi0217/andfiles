package tuftsdaily.tuftsdaily;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

/**
 * Created by Benard Ngaruiya on 11/14/2017.
 */

public class PageAdapter extends FragmentStatePagerAdapter{
    int numTabs;


    public PageAdapter(FragmentManager fm, int numOfTabs){
        super(fm);
        this.numTabs = numOfTabs;
    }
    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                TodayFragment today = new TodayFragment();
                return today;
            case 1:
                FeatureTabFragment features = new FeatureTabFragment();
                return features;
            case 2:
                OpinionTabFragment opinion = new OpinionTabFragment();
                return opinion;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 0;
    }
}
