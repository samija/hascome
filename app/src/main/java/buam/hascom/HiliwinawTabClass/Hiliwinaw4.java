package buam.hascom.HiliwinawTabClass;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.MenuItemCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.ShareActionProvider;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import buam.hascom.Fragments.Five;
import buam.hascom.Fragments.Four;
import buam.hascom.Fragments.One;
import buam.hascom.Fragments.Second;
import buam.hascom.Fragments.Six;
import buam.hascom.Fragments.Three;
import buam.hascom.R;
import buam.hascom.activity.AboutUs;
import buam.hascom.activity.Feedback;
import buam.hascom.activity.TeleEshtaol;

/**
 * Created by mac on 12/29/15.
 */
public class Hiliwinaw4 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private ShareActionProvider myShareActionProvider;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hiliwinaw4);

        toolbar = (Toolbar) findViewById(R.id.toolbar4);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager4);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs4);
        tabLayout.setupWithViewPager(viewPager);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("vnd.android-dir/mms-sms");
                intent.putExtra("address", "+251911202110");
                intent.putExtra("sms_body", "ሜሴጆን ይጻፉ!!!");
                startActivity(intent);
            }
        });
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
                        fragment = new Five();
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
                        fragment = new One();
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
                return "ስላሴን ልታብራራ ትችላለህን?";
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
                return "እግዚአብሔር አለ?";
            }
            if (position == 5) {
                return "ስላሴ";
            }

            return null;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){

// Inflate the menu; this adds items to the action bar if it is present.

        getMenuInflater().inflate(R.menu.menu_aboutus, menu);

// Inflate the menu; this adds items to the action bar if it is present.

        MenuItem shareItem = menu.findItem(R.id.menu_share);
        myShareActionProvider = (ShareActionProvider) MenuItemCompat.getActionProvider(shareItem);
        myShareActionProvider.setShareHistoryFileName(
                ShareActionProvider.DEFAULT_SHARE_HISTORY_FILE_NAME);
        myShareActionProvider.setShareIntent(Shareintent());

        return super.onCreateOptionsMenu(menu);


    }
    /** Returns a share intent */
    private Intent Shareintent(){
        Intent Shareintent = new Intent(Intent.ACTION_SEND);
        Shareintent.setType("text/html");
        Shareintent.putExtra(Intent.EXTRA_SUBJECT, "SUBJECT");
        Shareintent.putExtra(Intent.EXTRA_TEXT, "http://www.habeshastudent.com/m/existence.html");
        return Shareintent;


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == R.id.call) {
            startActivity(new Intent(this, TeleEshtaol.class));
            return true;
        }
        if (item.getItemId() == R.id.feedback) {
            startActivity(new Intent(this, Feedback.class));
            return true;
        }
        if (item.getItemId() == R.id.aboutus) {
            startActivity(new Intent(this, AboutUs.class));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}