package fi.ptm.listviewinviewpagerexample;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by PTM on 24.11.2015.
 */
public class SomeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_some, container, false);
        TextView textView = (TextView) rootView.findViewById(R.id.section_label);
        textView.setText("Some Fragment Content");
        return rootView;
    }

}
