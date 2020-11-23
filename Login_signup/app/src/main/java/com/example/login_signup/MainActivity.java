package com.example.login_signup;

import androidx.fragment.app.Fragment;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);

        AuthenticationPagerAdapter pagerAdapter = new AuthenticationPagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(new fragment_login());
        pagerAdapter.addFragment(new fragment_register());
        viewPager.setAdapter(getPagerAdapter(pagerAdapter));
    }

    private PagerAdapter getPagerAdapter(AuthenticationPagerAdapter pagerAdapter) {
        return pagerAdapter;
    }

    static class AuthenticationPagerAdapter extends FragmentPagerAdapter {
        private ArrayList<Fragment> fragmentList = new ArrayList<>();

        public AuthenticationPagerAdapter(FragmentManager fm) {
            super(fm);
        }
        public Fragment getItem(int i) {
            return fragmentList.get(i);
        }

        void addFragmet(Fragment fragment) {
            fragmentList.add(fragment);
        }

        public void addFragment(fragment_login fragment_login) {
        }
        public void addFragment(fragment_register fragment_register) {
    }
}




