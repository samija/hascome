package buam.hascom.HiliwinawTabClass;

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

import buam.hascom.Fragments.Five;
import buam.hascom.Fragments.Four;
import buam.hascom.Fragments.One;
import buam.hascom.Fragments.Second;
import buam.hascom.Fragments.Six;
import buam.hascom.Fragments.Three;
import buam.hascom.R;
import buam.hascom.activity.AboutUs;
import buam.hascom.activity.ContactUs;
import buam.hascom.activity.TeleEshtaol;

public class Hiliwinaw extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiliwinaw);

        toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs);
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
                    fragment = new One();
                     }
                if (position == 1) {

                    fragment = new Second();
                    }


                if (position == 2) {

                    fragment = new Three();

                }

                if (position == 3) {
                    fragment = new Four();
                }

                if (position == 4) {
                    fragment = new Five();
                }

                if (position == 5) {
                    fragment = new Six();
                }
            return fragment;
        }
        @Override
        public int getCount() {
            return 6;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            if (position == 0) {
                return "እግዚአብሔር አለ?";
            }
            if (position == 1) {
                return "እግዚአብሔር ማነው?";
            }
            if (position == 2) {
                return "የእግዚአብሔርን መኖር ለማረጋገጥ ትችላለህ?";
            }
            if (position == 3) {
                return "እግዚአብሔር አለምን የፈጠረው በስድስት ቀን ነውን?";
            }
            if (position == 4) {
                return "ስላሴን ልታብራራ ትችላለህን?";
            }
            if (position == 5) {
                return "ስላሴ";
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