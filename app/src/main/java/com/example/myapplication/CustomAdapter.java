package com.example.myapplication;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {

    private String[] localDataSet;

    /**
     * Provide a reference to the type of views that you are using
     * (custom ViewHolder)
     */
    static ImageView imageView;
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final TextView textView;



        public ViewHolder(View view) {
            super(view);
//             Define click listener for the ViewHolder's View

            textView = (TextView) view.findViewById(R.id.textViewww);
            imageView = (ImageView) view.findViewById(R.id.imageView2);

        }
        public ImageView getImageView() {
            return imageView;
        }

        public TextView getTextView() {
            return textView;
        }
    }


    public CustomAdapter(String[] dataSet) {
        localDataSet = dataSet;
    }

    // Create new views (invoked by the layout manager)
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        // Create a new view, which defines the UI of the list item
        View view =   LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.text_row_item, viewGroup, false);

        return new ViewHolder(view);
    }

    // Replace the contents of a view (invoked by the layout manager)
    @Override
    public void onBindViewHolder(ViewHolder viewHolder, final int position) {

        // Get element from your dataset at this position and replace the
        // contents of the view with that element
        viewHolder.getTextView().setText(localDataSet[position]);

        if(position==0){
            imageView.setImageResource(R.drawable.shreyash);
        }
        if(position==1){
            imageView.setImageResource(R.drawable.kshitij);
        }
        if(position==2){
            imageView.setImageResource(R.drawable.parth);
        }
        if(position==3){
            imageView.setImageResource(R.drawable.swaraj);
        }

    }

    // Return the size of your dataset (invoked by the layout manager)
    @Override
    public int getItemCount() {
        return localDataSet.length;
    }
}
