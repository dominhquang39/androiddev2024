package vn.edu.usth.usthweather;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class ForecastAdapter extends RecyclerView.Adapter<MyViewHolder> {

    Context context;
    List<ForecastItem> items;

    public ForecastAdapter(Context context, List<ForecastItem> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MyViewHolder(LayoutInflater.from(context).inflate(R.layout.forecast_item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.day.setText(items.get(position).getDay());
        holder.weather_icon.setImageResource(items.get(position).getWeather_icon());
        holder.weather.setText((items.get(position).getWeather()));
        holder.temperature.setText(items.get(position).getTemperature());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
