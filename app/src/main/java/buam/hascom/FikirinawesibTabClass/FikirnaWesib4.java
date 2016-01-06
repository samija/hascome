package buam.hascom.FikirinawesibTabClass;

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

import buam.hascom.FragmentFikirinawesib.Eighteen;
import buam.hascom.FragmentFikirinawesib.Fiften;
import buam.hascom.FragmentFikirinawesib.Nineteen;
import buam.hascom.FragmentFikirinawesib.Seventhen;
import buam.hascom.FragmentFikirinawesib.Sixteen;
import buam.hascom.FragmentFikirinawesib.Twenty;
import buam.hascom.FragmentFikirinawesib.Twenty1;
import buam.hascom.FragmentFikirinawesib.Twenty2;
import buam.hascom.FragmentFikirinawesib.Twenty3;
import buam.hascom.FragmentFikirinawesib.Twenty4;
import buam.hascom.FragmentFikirinawesib.Twenty5;
import buam.hascom.FragmentFikirinawesib.Twenty6;
import buam.hascom.R;
import buam.hascom.activity.AboutUs;
import buam.hascom.activity.ContactUs;
import buam.hascom.activity.TeleEshtaol;

/**
 * Created by mac on 12/29/15.
 */
public class FikirnaWesib4 extends AppCompatActivity {

    private Toolbar toolbar;
    private TabLayout tabLayout;
    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fikirinawesib4);

        toolbar = (Toolbar) findViewById(R.id.toolbar18);
        setSupportActionBar(toolbar);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        viewPager = (ViewPager) findViewById(R.id.viewpager18);
        setupViewPager(viewPager);

        tabLayout = (TabLayout) findViewById(R.id.tabs18);
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

                fragment = new Nineteen();
            }if (position == 1) {
                fragment = new Eighteen();
            }
            if (position == 2) {
                fragment = new Seventhen();
            }
            if (position == 3) {
                fragment = new Sixteen();
            }
            if (position == 4) {
                fragment = new Fiften();
            }
            if (position == 5) {
                fragment = new Twenty();
            }

            if (position == 6) {
                fragment = new Twenty1();
            }
            if (position == 7) {
                fragment = new Twenty2();
            }
            if (position == 8) {
                fragment = new Twenty3();
            }
            if (position == 9) {
                fragment = new Twenty4();
            }
            if (position == 10) {
                fragment = new Twenty5();
            }
            if (position == 11) {
                fragment = new Twenty6();
            }
            return fragment;
        }
        @Override
        public int getCount() {
            return 12;
        }


        @Override
        public CharSequence getPageTitle(int position) {


            if (position == 0) {
                return "የእግዚአብሔር ፈቃድ ስለ ጋብቻ";
            }
            if (position == 1) {
                return "የፍቅር ግንኙነት";
            }
            if (position == 2) {
                return "ፖርንን እጠላዋለሁ";
            }
            if (position == 3) {
                return "መርዘኛ ፍትወትና የወሲብ ብክለት የፖርኖግራፊ ምንነት";
            }
            if (position == 4) {
                return "ወሲብና የፍቅር ጓደኛ ፍለጋ";
            }
            if (position == 5) {
                return "ሊፈርስ የተቃረበ ትዳር ተስፋ ይኖረው ይሆን?";
            }
            if (position == 6) {
                return "ራሰን በራስ ማርካት፡(ሴጋ) የባርነት ዓለም";
            }
            if (position == 7) {
                return "የወሲብ ፊልም ምርኮኛ";
            }
            if (position == 8) {
                return "ቅድመ ጋብቻ ወሲብ ስህተት ነውን?";
            }
            if (position == 9) {
                return "የወሲብ ህግ ማን ያውጣልን?";
            }
            if (position == 10) {
                return "እውነተኛ የሴቶች መብት አክባሪ";
            }
            if (position == 11) {
                return "ግብረ-ሰዶማውያን፣ ሌዝቢያን እና የእግዚአብሔር ፍቅር";
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