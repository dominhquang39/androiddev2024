package vn.edu.usth.usthweather;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Forecast1Fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Forecast1Fragment extends Fragment {
    private RecyclerView recyclerView;
    private ForecastAdapter adapter;
    private List<ForecastItem> forecastItemList;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Forecast1Fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Forecast1Fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static Forecast1Fragment newInstance(String param1, String param2) {
        Forecast1Fragment fragment = new Forecast1Fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_forecast1, container, false);
        recyclerView = view.findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        forecastItemList = new ArrayList<>();
        forecastItemList.add(new ForecastItem(R.string.monday, R.drawable.cloudy, R.string.cloud_temp, R.string.cloudy));
        forecastItemList.add(new ForecastItem(R.string.tuesday, R.drawable.sun, R.string.sunny_temp, R.string.sunny));
        forecastItemList.add(new ForecastItem(R.string.wednesday, R.drawable.rainy, R.string.rain_temp, R.string.rainy));
        forecastItemList.add(new ForecastItem(R.string.thursday, R.drawable.thunder, R.string.thunder_temp, R.string.thunder));
        forecastItemList.add(new ForecastItem(R.string.friday, R.drawable.typhoon, R.string.typhoon_temp, R.string.typhoon));
        forecastItemList.add(new ForecastItem(R.string.saturday, R.drawable.snowflake, R.string.snowy_temp, R.string.snowy));
        forecastItemList.add(new ForecastItem(R.string.sunday, R.drawable.sun, R.string.sunny_temp, R.string.sunny));

        adapter = new ForecastAdapter(getContext(), forecastItemList);
        recyclerView.setAdapter(adapter);

        return view;
    }
}