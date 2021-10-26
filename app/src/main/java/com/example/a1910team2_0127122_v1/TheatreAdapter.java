package com.example.a1910team2_0127122_v1;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Filter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class TheatreAdapter extends ArrayAdapter<LectureTheatre> {

    private Context context;
    private int resourceId;
    private List<LectureTheatre> items, tempItems, suggestions;

    public TheatreAdapter(@NonNull Context context, int resourceId, ArrayList<LectureTheatre> items) {
        super(context, resourceId, items);
        this.items = items;
        this.context = context;
        this.resourceId = resourceId;
        tempItems = new ArrayList<>(items);
        suggestions = new ArrayList<>();
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        try {
            if (convertView == null) {
                LayoutInflater inflater = ((Activity) context).getLayoutInflater();
                view = inflater.inflate(resourceId, parent, false);
            }
            LectureTheatre theatre = getItem(position);
            TextView name = (TextView) view.findViewById(R.id.tv_theatreItem);
//            AutoCompleteTextView name = (AutoCompleteTextView) view.findViewById(R.id.actv_inputLectureTheatre);
            name.setText(theatre.getId());

//            Fruit fruit = getItem(position);
//            TextView name = (TextView) view.findViewById(R.id.textView);
//            ImageView imageView = view.findViewById(R.id.imageView);
//            imageView.setImageResource(fruit.getImage());
//            name.setText(fruit.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return view;
    }
    @Nullable
    @Override
    public LectureTheatre getItem(int position) {
        return items.get(position);
    }
    @Override
    public int getCount() {
        return items.size();
    }
    @Override
    public long getItemId(int position) {
        return position;
    }
    @NonNull
    @Override
    public Filter getFilter() {
        return theatreFilter;
    }
    private Filter theatreFilter = new Filter() {
        @Override
        public CharSequence convertResultToString(Object resultValue) {
            LectureTheatre theatre = (LectureTheatre) resultValue;
            return theatre.getId();
        }
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            if (charSequence != null) {
                suggestions.clear();
                for (LectureTheatre theatre: tempItems) {
                    if (theatre.getId().toLowerCase().startsWith(charSequence.toString().toLowerCase())) {
                        suggestions.add(theatre);
                    }
                }
                FilterResults filterResults = new FilterResults();
                filterResults.values = suggestions;
                filterResults.count = suggestions.size();
                return filterResults;
            } else {
                return new FilterResults();
            }
        }
        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            ArrayList<LectureTheatre> tempValues = (ArrayList<LectureTheatre>) filterResults.values;
            if (filterResults != null && filterResults.count > 0) {
                clear();
                for (LectureTheatre theatre : tempValues) {
                    add(theatre);
                }
                notifyDataSetChanged();
            } else {
                clear();
                notifyDataSetChanged();
            }
        }
    };
}



