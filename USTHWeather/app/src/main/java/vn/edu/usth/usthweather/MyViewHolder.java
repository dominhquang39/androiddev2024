package vn.edu.usth.usthweather;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyViewHolder extends RecyclerView.ViewHolder {

    TextView day, weather, temperature;
    ImageView weather_icon;


    public MyViewHolder(@NonNull View itemView) {
        super(itemView);
        day = itemView.findViewById(R.id.day);
        weather = itemView.findViewById(R.id.weather);
        temperature = itemView.findViewById(R.id.temperature);
        weather_icon = itemView.findViewById(R.id.weather_icon);
    }
}
