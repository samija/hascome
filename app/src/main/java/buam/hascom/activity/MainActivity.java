package buam.hascom.activity;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.ScaleAnimation;
import android.view.animation.Transformation;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;

import buam.hascom.ActivityFilmoch.Fourty;
import buam.hascom.ActivityFilmoch.Thirty5;
import buam.hascom.ActivityFilmoch.Thirty6;
import buam.hascom.ActivityFilmoch.Thirty7;
import buam.hascom.ActivityFilmoch.Thirty8;
import buam.hascom.ActivityFilmoch.Thirty9;
import buam.hascom.EgziabherinMawekTabClass.EgziabherinMawek;
import buam.hascom.EgziabherinMawekTabClass.EgziabherinMawek1;
import buam.hascom.EgziabherinMawekTabClass.EgziabherinMawek2;
import buam.hascom.EgziabherinMawekTabClass.EgziabherinMawek3;
import buam.hascom.EgziabherinMawekTabClass.EgziabherinMawek4;
import buam.hascom.EgziabherinMawekTabClass.EgziabherinMawek5;
import buam.hascom.EgziabherinMawekTabClass.EgziabherinMawek6;
import buam.hascom.EgziabherinMawekTabClass.EgziabherinMawek7;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib1;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib10;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib11;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib2;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib3;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib4;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib5;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib6;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib7;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib8;
import buam.hascom.FikirinawesibTabClass.FikirnaWesib9;
import buam.hascom.HiliwinawTabClass.Hiliwinaw;
import buam.hascom.HiliwinawTabClass.Hiliwinaw1;
import buam.hascom.HiliwinawTabClass.Hiliwinaw2;
import buam.hascom.HiliwinawTabClass.Hiliwinaw3;
import buam.hascom.HiliwinawTabClass.Hiliwinaw4;
import buam.hascom.HiliwinawTabClass.Hiliwinaw5;
import buam.hascom.R;
import buam.hascom.YehiwotTabClass.YehiwotTiyake;
import buam.hascom.YehiwotTabClass.YehiwotTiyake1;
import buam.hascom.YehiwotTabClass.YehiwotTiyake2;
import buam.hascom.YehiwotTabClass.YehiwotTiyake3;
import buam.hascom.YehiwotTabClass.YehiwotTiyake4;
import buam.hascom.YehiwotTabClass.YehiwotTiyake5;
import buam.hascom.YehiwotTabClass.YehiwotTiyake6;
import buam.hascom.YehiwotTabClass.YehiwotTiyake7;


public class MainActivity extends ListActivity implements OnClickListener
{

    LinearLayout panel1,panel2,panel3,panel4,panel5;
    TextView text1,text2,text3,text4,text5;
    View openLayout;
    private Button button, button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11,button111,button112,button12,button13,button14,button15,
            button16,button17,button18,button19,button20,button21,button22,button23,button24,button25,button26,button27,button28,button29,button30,button31,button32,button33,button34,button35,button36,button37,button38,button39;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        panel1 = (LinearLayout) findViewById(R.id.panel1);
        panel2 = (LinearLayout) findViewById(R.id.panel2);
        panel3 = (LinearLayout) findViewById(R.id.panel3);
        panel4 = (LinearLayout) findViewById(R.id.panel4);
        panel5 = (LinearLayout) findViewById(R.id.panel5);
        button = (Button) findViewById(R.id.btnegziabherale);
        button1 = (Button) findViewById(R.id.btn1egziabhermanew);
        button2 = (Button) findViewById(R.id.btn2yegziabhermenor);
        button3 = (Button) findViewById(R.id.btn3egzaleminyefeterew);
        button4 = (Button) findViewById(R.id.btn4silasenlitabrara);
        button5 = (Button) findViewById(R.id.btn5silase);
        button6 = (Button) findViewById(R.id.btn6hiyiwotkebadhone);
        button7 = (Button) findViewById(R.id.btn7yehiwotealama);
        button8 = (Button) findViewById(R.id.btn8bechinksinikebeb);
        button9 = (Button) findViewById(R.id.btn9limolayalachalew);
        button10 = (Button) findViewById(R.id.btn10egziabherbiku);
        button11 = (Button) findViewById(R.id.btn11yewustihalem);
        button111 = (Button) findViewById(R.id.btn11yecampuslife);
        button112 = (Button) findViewById(R.id.btn11kesusmelakek);
        button12 = (Button) findViewById(R.id.btn12yefikirguadegnafilega);
        button13 = (Button) findViewById(R.id.btn13pornographymininet);
        button14 = (Button) findViewById(R.id.btn14pornintelawalew);
        button15 = (Button) findViewById(R.id.btn15yefikirginignunet);
        button16 = (Button) findViewById(R.id.btn16yegziabherfikadgabicha);
        button17 = (Button) findViewById(R.id.btn17lifersyetekarebetidar);
        button18 = (Button) findViewById(R.id.btn18sega);
        button19 = (Button) findViewById(R.id.btn19yewesibfilmmirkogna);
        button20 = (Button) findViewById(R.id.btn20kidimegabichawesib);
        button21 = (Button) findViewById(R.id.btn21yewesibhigmanyawita);
        button22 = (Button) findViewById(R.id.btn22ewunetegnayesetochmebt);
        button23 = (Button) findViewById(R.id.btn23gibiresedomawuyan);
        button24 = (Button) findViewById(R.id.btn24egziabherinbegilmawek);
        button25 = (Button) findViewById(R.id.btn25eyesusleminmote);
        button26 = (Button) findViewById(R.id.btn26egziabhertselotyimelisalin);
        button27 = (Button) findViewById(R.id.btn27eyesusamilaknew);
        button28 = (Button) findViewById(R.id.btn28eysusinalelochhayimanotoch);
        button29 = (Button) findViewById(R.id.btn29yegziabherfikirlemuslimoch);
        button30 = (Button) findViewById(R.id.btn30catholiceminetnchristina);
        button31 = (Button) findViewById(R.id.btn31mengistesemaymntimeslalech);
        button32 = (Button) findViewById(R.id.btn32yehiwotmisikirinetoch);
        button33 = (Button) findViewById(R.id.btn33yegilyehiwotmisikirinetoch);
        button34 = (Button) findViewById(R.id.btn34yegilyehiwotmisikirinetoch);
        button35 = (Button) findViewById(R.id.btn35yegilyehiwotmisikirinetoch);
        button36 = (Button) findViewById(R.id.btn36yegilyehiwotmisikirinetoch);
        button37 = (Button) findViewById(R.id.btn37yegilyehiwotmisikirinetoch);

        text1 = (TextView) findViewById(R.id.tv1yegziabherhiliwina);
        text2 = (TextView) findViewById(R.id.tv2yehiwottiyake);
        text3 = (TextView) findViewById(R.id.tv3wesibnfikir);
        text4 = (TextView) findViewById(R.id.tv4egziabmawek);
        text5 = (TextView) findViewById(R.id.tv5films);

        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        text4.setOnClickListener(this);
        text5.setOnClickListener(this);
        button.setOnClickListener(this);
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button111.setOnClickListener(this);
        button112.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
        button17.setOnClickListener(this);
        button18.setOnClickListener(this);
        button19.setOnClickListener(this);
        button20.setOnClickListener(this);
        button21.setOnClickListener(this);
        button22.setOnClickListener(this);
        button23.setOnClickListener(this);
        button24.setOnClickListener(this);
        button25.setOnClickListener(this);
        button26.setOnClickListener(this);
        button27.setOnClickListener(this);
        button28.setOnClickListener(this);
        button29.setOnClickListener(this);
        button30.setOnClickListener(this);
        button31.setOnClickListener(this);
        button32.setOnClickListener(this);
        button33.setOnClickListener(this);
        button34.setOnClickListener(this);
        button35.setOnClickListener(this);
        button36.setOnClickListener(this);
        button37.setOnClickListener(this);



    }
    @Override
    public void onClick(View v){
        switch (v.getId()){

            case R.id.btnegziabherale:
                startActivity(new Intent(MainActivity.this, Hiliwinaw.class));

                break;
            case R.id.btn1egziabhermanew:
                startActivity(new Intent(MainActivity.this, Hiliwinaw1.class));

                break;
            case R.id.btn2yegziabhermenor:
              startActivity(new Intent(MainActivity.this, Hiliwinaw2.class));

                break;
            case R.id.btn3egzaleminyefeterew:
                startActivity(new Intent(MainActivity.this, Hiliwinaw3.class));
                break;
            case R.id.btn4silasenlitabrara:
                startActivity(new Intent(MainActivity.this, Hiliwinaw4.class));
                break;
            case R.id.btn5silase:
                startActivity(new Intent(MainActivity.this, Hiliwinaw5.class));
                break;
            case R.id.btn6hiyiwotkebadhone:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake.class));
                break;
            case R.id.btn7yehiwotealama:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake1.class));
                break;
            case R.id.btn8bechinksinikebeb:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake2.class));
                break;
            case R.id.btn9limolayalachalew:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake3.class));
                break;
            case R.id.btn10egziabherbiku:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake4.class));
                break;
            case R.id.btn11yewustihalem:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake5.class));
                break;
            case R.id.btn11yecampuslife:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake6.class));
                break;
            case R.id.btn11kesusmelakek:
                startActivity(new Intent(MainActivity.this, YehiwotTiyake7.class));
                break;
            case R.id.btn12yefikirguadegnafilega:
                startActivity(new Intent(MainActivity.this, FikirnaWesib.class));
                break;
            case R.id.btn13pornographymininet:
                startActivity(new Intent(MainActivity.this, FikirnaWesib1.class));
                break;
            case R.id.btn14pornintelawalew:
                startActivity(new Intent(MainActivity.this, FikirnaWesib2.class));
                break;
            case R.id.btn15yefikirginignunet:
                startActivity(new Intent(MainActivity.this, FikirnaWesib3.class));
                break;
            case R.id.btn16yegziabherfikadgabicha:
                startActivity(new Intent(MainActivity.this, FikirnaWesib4.class));
                break;
            case R.id.btn17lifersyetekarebetidar:
                startActivity(new Intent(MainActivity.this, FikirnaWesib5.class));
                break;
            case R.id.btn18sega:
                startActivity(new Intent(MainActivity.this, FikirnaWesib6.class));
                break;
            case R.id.btn19yewesibfilmmirkogna:
                startActivity(new Intent(MainActivity.this, FikirnaWesib7.class));
                break;
            case R.id.btn20kidimegabichawesib:
                startActivity(new Intent(MainActivity.this, FikirnaWesib8.class));
                break;
            case R.id.btn21yewesibhigmanyawita:
                startActivity(new Intent(MainActivity.this, FikirnaWesib9.class));
                break;
            case R.id.btn22ewunetegnayesetochmebt:
                startActivity(new Intent(MainActivity.this, FikirnaWesib10.class));
                break;
            case R.id.btn23gibiresedomawuyan:
                startActivity(new Intent(MainActivity.this, FikirnaWesib11.class));
                break;
            case R.id.btn24egziabherinbegilmawek:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek.class));
                break;
            case R.id.btn25eyesusleminmote:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek1.class));
                break;
            case R.id.btn26egziabhertselotyimelisalin:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek2.class));
                break;
            case R.id.btn27eyesusamilaknew:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek3.class));
                break;
            case R.id.btn28eysusinalelochhayimanotoch:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek4.class));
                break;
            case R.id.btn29yegziabherfikirlemuslimoch:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek5.class));
                break;
            case R.id.btn30catholiceminetnchristina:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek6.class));
                break;
            case R.id.btn31mengistesemaymntimeslalech:
                startActivity(new Intent(MainActivity.this, EgziabherinMawek7.class));
                break;
            case R.id.btn32yehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty5.class));
                break;
            case R.id.btn33yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty6.class));
                break;
            case R.id.btn34yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty7.class));
                break;
            case R.id.btn35yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty8.class));
                break;
            case R.id.btn36yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Thirty9.class));
                break;
            case R.id.btn37yegilyehiwotmisikirinetoch:
                startActivity(new Intent(MainActivity.this, Fourty.class));
                break;





        }
    {
        hideOthers(v);
    }}
    private void hideThemAll()
    {
        if(openLayout == null) return;
        if(openLayout == panel1)
            panel1.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));
        if(openLayout == panel2)
            panel2.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel2, true));
        if(openLayout == panel3)
            panel3.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel3, true));
        if(openLayout == panel4)
            panel4.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
        if(openLayout == panel5)
            panel5.startAnimation(new ScaleAnimToHide(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
    }


    private void hideOthers(View layoutView)
    {
        {
            int v;
            if(layoutView.getId() == R.id.tv1yegziabherhiliwina)
            {
                v = panel1.getVisibility();

                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel1.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel1, true));
                }
            }
            else if(layoutView.getId() == R.id.tv2yehiwottiyake)
            {
                v = panel2.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel2.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel2, true));
                }
            }
            else if(layoutView.getId() == R.id.tv3wesibnfikir)
            {
                v = panel3.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel3.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel3, true));
                }
            }
            else if(layoutView.getId() == R.id.tv4egziabmawek)
            {
                v = panel4.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel4.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel4, true));
                }
            }
            else if(layoutView.getId() == R.id.tv5films)
            {
                v = panel5.getVisibility();
                hideThemAll();
                if(v != View.VISIBLE)
                {
                    panel5.startAnimation(new ScaleAnimToShow(1.0f, 1.0f, 1.0f, 0.0f, 500, panel5, true));
                }
            }
        }
    }

    public class ScaleAnimToHide extends ScaleAnimation
    {

        private View mView;

        private LayoutParams mLayoutParams;

        private int mMarginBottomFromY, mMarginBottomToY;

        private boolean mVanishAfter = false;

        public ScaleAnimToHide(float fromX, float toX, float fromY, float toY, int duration, View view,boolean vanishAfter)
        {
            super(fromX, toX, fromY, toY);
            setDuration(duration);
            openLayout = null;
            mView = view;
            mVanishAfter = vanishAfter;
            mLayoutParams = (LayoutParams) view.getLayoutParams();
            int height = mView.getHeight();
            mMarginBottomFromY = (int) (height * fromY) + mLayoutParams.bottomMargin - height;
            mMarginBottomToY = (int) (0 - ((height * toY) + mLayoutParams.bottomMargin)) - height;

            Log.v("CZ","height..." + height + " , mMarginBottomFromY...." + mMarginBottomFromY  + " , mMarginBottomToY.." +mMarginBottomToY);
        }

        @Override
        protected void applyTransformation(float interpolatedTime, Transformation t)
        {
            super.applyTransformation(interpolatedTime, t);
            if (interpolatedTime < 1.0f)
            {
                int newMarginBottom = mMarginBottomFromY + (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime);
                mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin,mLayoutParams.rightMargin, newMarginBottom);
                mView.getParent().requestLayout();
                 }
            else if (mVanishAfter)
            {
                mView.setVisibility(View.GONE);
            }
        }
    }
    public class ScaleAnimToShow extends ScaleAnimation
    {

        private View mView;

        private LayoutParams mLayoutParams;

        private int mMarginBottomFromY, mMarginBottomToY;

        private boolean mVanishAfter = false;

        public ScaleAnimToShow(float toX, float fromX, float toY, float fromY, int duration, View view,boolean vanishAfter)
        {
            super(fromX, toX, fromY, toY);
            openLayout = view;
            setDuration(duration);
            mView = view;
            mVanishAfter = vanishAfter;
            mLayoutParams = (LayoutParams) view.getLayoutParams();
            mView.setVisibility(View.VISIBLE);
            int height = mView.getHeight();

            mMarginBottomFromY = 0;
            mMarginBottomToY = height;

            Log.v("CZ",".................height..." + height + " , mMarginBottomFromY...." + mMarginBottomFromY  + " , mMarginBottomToY.." +mMarginBottomToY);
        }

        @Override
        protected void applyTransformation(float interpolatedTime, @NonNull Transformation t)
        {
            super.applyTransformation(interpolatedTime, t);
            if (interpolatedTime < 1.0f)
            {
                int newMarginBottom = (int) ((mMarginBottomToY - mMarginBottomFromY) * interpolatedTime) - mMarginBottomToY;
                mLayoutParams.setMargins(mLayoutParams.leftMargin, mLayoutParams.topMargin,mLayoutParams.rightMargin, newMarginBottom);
                mView.getParent().requestLayout();
                  }
        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_aboutus, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.call) {
            startActivity(new Intent(MainActivity.this, TeleEshtaol.class));
            return true;
        }
        if (item.getItemId() == R.id.feedback) {
            startActivity(new Intent(MainActivity.this, Feedback.class));
            return true;
        }
        if (item.getItemId() == R.id.aboutus) {
            startActivity(new Intent(MainActivity.this, AboutUs.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

