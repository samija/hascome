package buam.hascom.EgziabherinMawekTabClass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import buam.hascom.FragmentEgziabherinMawek.Thirty;
import buam.hascom.FragmentEgziabherinMawek.Thirty1;
import buam.hascom.FragmentEgziabherinMawek.Thirty2;
import buam.hascom.FragmentEgziabherinMawek.Thirty3;
import buam.hascom.FragmentEgziabherinMawek.Thirty4;
import buam.hascom.FragmentEgziabherinMawek.Twenty7;
import buam.hascom.FragmentEgziabherinMawek.Twenty8;
import buam.hascom.FragmentEgziabherinMawek.Twenty9;
import buam.hascom.R;
import buam.hascom.activity.AboutUs;
import buam.hascom.activity.ContactUs;
import buam.hascom.activity.TeleEshtaol;

/**
 * Created by mac on 12/30/15.
 */
public class EgziabherinMawek7 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egziabherin_mawek7);

        toolbar = (Toolbar) findViewById(R.id.toolbar33);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager33);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs33);
        tabLayout.setupWithViewPager(viewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPager.setAdapter(adapter);
    }

    class ViewPagerAdapter extends FragmentPagerAdapter {

        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }

        @Override
        public Fragment getItem(int position) {
            Fragment fragment = null;


            if (position == 0) {

                fragment = new Thirty4();
            }
            if (position == 1) {
                fragment = new Thirty3();
            }
            if (position == 2) {
                fragment = new Thirty2();
            }
            if (position == 3) {
                fragment = new Thirty1();
            }
            if (position == 4) {
                fragment = new Thirty();
            }
            if (position == 5) {
                fragment = new Twenty9();
            }
            if (position == 6) {
                fragment = new Twenty8();
            }
            if (position == 7) {
                fragment = new Twenty7();
            }
            return fragment;
        }
        @Override
        public int getCount() {
            return 8;
        }


        @Override
        public CharSequence getPageTitle(int position) {


            if (position == 0) {
                return "መንግስተ ሰማይ ምን ተመስላለች?";
            }
            if (position == 1) {
                return "በካቶሊክ ዕምነትና በክርስትና መካከል ልዩነት አለ?";
            }
            if (position == 2) {
                return "የእግዚአብሔር ፍቅር ለፅንፈኛ ሙስሊሞች";
            }
            if (position == 3) {
                return "በኢየሱስና በሌሎች ኃይማኖቶች መካከል ያለው ልዩነት ምንድነው?";
            }
            if (position == 4) {
                return "ኢየሱስ እርሱ አምላክ እንደሆነ ተናግሯልን?";
            }
            if (position == 5) {
                return "እግዚአብሔር ፀሎት ይመልሳልን?";
            }
            if (position == 6) {
                return "ኢየሱስ ለምን ሞተ?";
            }
            if (position == 7) {
                return "እግዚአብሔርን በግል ማወቅ";
            }


            return null;
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
            startActivity(new Intent(this, TeleEshtaol.class));
            return true;
        }
        if (item.getItemId() == R.id.contactus) {
            startActivity(new Intent(this, ContactUs.class));
            return true;
        }
        if (item.getItemId() == R.id.aboutus) {
            startActivity(new Intent(this, AboutUs.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
