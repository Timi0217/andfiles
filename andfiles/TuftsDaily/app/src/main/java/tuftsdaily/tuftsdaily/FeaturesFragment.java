package tuftsdaily.tuftsdaily;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 *
 * Created by Benard Ngaruiya on 10/31/2017.
 */

public class FeaturesFragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("FEATURES");

        myView = inflater.inflate(R.layout.features_page, container, false);
        return myView;
    }
}
