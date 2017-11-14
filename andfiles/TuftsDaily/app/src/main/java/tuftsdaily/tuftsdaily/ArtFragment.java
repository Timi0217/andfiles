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



public class ArtFragment extends Fragment {
    View myView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        getActivity().setTitle("ARTS");

        myView = inflater.inflate(R.layout.arts_page, container, false);
        return myView;
    }
}
