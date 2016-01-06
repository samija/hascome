package buam.hascom.FragmentEgziabherinMawek;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import buam.hascom.R;

/**
 * Created by mac on 12/30/15.
 */
public class Twenty7 extends Fragment {
     @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
         View view=inflater.inflate(R.layout.twenty7, container, false);
         TextView t=(TextView) view.findViewById(R.id.tvTwenty7);
         Typeface tf=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
         t.setTypeface(tf);
         TextView t2=(TextView) view.findViewById(R.id.tvTwenty71);
         Typeface tf2=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
         t2.setTypeface(tf2);
         TextView t3=(TextView) view.findViewById(R.id.tvTwenty72);
         Typeface tf3=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
         t3.setTypeface(tf3);
         TextView t4=(TextView) view.findViewById(R.id.tvTwenty73);
         Typeface tf4=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
         t4.setTypeface(tf4);
         TextView t1=(TextView) view.findViewById(R.id.tvTwenty74);
         Typeface tf1=Typeface.createFromAsset(getActivity().getAssets(), "fonts/AbyssinicaSIL-R.ttf");
         t1.setTypeface(tf1);

         return view;
    }
}
