package buam.hascom.YehiwotTabClass;

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

import buam.hascom.Fragments2.Eight;
import buam.hascom.Fragments2.Eleven;
import buam.hascom.Fragments2.Fourteen;
import buam.hascom.Fragments2.Nine;
import buam.hascom.Fragments2.Seven;
import buam.hascom.Fragments2.Ten;
import buam.hascom.Fragments2.Thirteen;
import buam.hascom.Fragments2.Twelve;
import buam.hascom.R;
import buam.hascom.activity.AboutUs;
import buam.hascom.activity.ContactUs;
import buam.hascom.activity.TeleEshtaol;

/**
 * Created by mac on 12/29/15.
 */
public class YehiwotTiyake2 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yehiwottiyake2);

        toolbar = (Toolbar) findViewById(R.id.toolbar8);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager8);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs8);
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
                fragment = new Nine();
            }

            if (position == 1) {
                fragment = new Eight();
            }
            if (position == 2) {
                fragment = new Seven();
            }
            if (position == 3) {

                fragment = new Ten();
            }

            if (position == 4) {
                fragment = new Eleven();
            }

            if (position == 5) {
                fragment = new Twelve();
            }

            if (position == 6) {
                fragment = new Thirteen();
            }

            if (position == 7) {
                fragment = new Fourteen();
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
                return "በጭንቅ ስንከበብ እግዚአብሔር ወዴት ነው?";
            }
            if (position == 1) {
                return "የሕይወቴ ዓላማ ምንድነው??";
            }
            if (position == 2) {
                return "ሕይወት ለምን እንዲህ ከባድ ሆነ?";
            }
            if (position == 3) {
                return "ሊሞላ ያልቻለው የሕይወት ቋት";
            }
            if (position == 4) {
                return "እግዚአብሔር ብቁ ዳይሬክተር ነውን?";
            }
            if (position == 5) {
                return "የውስጥህ ዓለም";
            }
            if (position == 6) {
                return "የካምፓስ ላይፍ ቴንሽን";
            }
            if (position == 7) {
                return "ከሱስ መላቀቅ";
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
