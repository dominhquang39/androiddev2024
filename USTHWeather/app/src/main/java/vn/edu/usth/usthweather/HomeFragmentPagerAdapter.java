package vn.edu.usth.usthweather;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import java.util.Objects;

public class HomeFragmentPagerAdapter extends FragmentStateAdapter {
    private final int PAGE_COUNT = 3;
    private String titles[] = new String[] { "Hanoi", "Paris", "Toulouse" };
    public HomeFragmentPagerAdapter(AppCompatActivity activity) {
        super(activity);
    }
    @Override
    public int getItemCount() {
        return PAGE_COUNT; // number of pages for a ViewPager
    }
    @Override
    public Fragment createFragment(int page) {
// returns an instance of Fragment corresponding to the specified page
        switch (page) {
            case 0: return WeatherAndForecastFragment.newInstance("Hanoi", R.drawable.typhoon_big);
            case 1: return WeatherAndForecastFragment.newInstance("Paris", R.drawable.rainy );
            case 2: return WeatherAndForecastFragment.newInstance("Melbourne", R.drawable.cloudy);
        }
        return new WeatherAndForecastFragment(); // failsafe
    }


    public CharSequence getPageTitle(int page) {
// returns a tab title corresponding to the specified page
        return titles[page];
    }

}
