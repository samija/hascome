package buam.hascom.FragmentFikirinawesib;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import buam.hascom.R;

/**
 * Created by mac on 12/29/15.
 */
public class Twenty1 extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fikir_twenty1, container, false);
        TextView t=(TextView) view.findViewById(R.id.tvTwenty1);
        Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
        t.setTypeface(tf);
        return view;
    }
}

