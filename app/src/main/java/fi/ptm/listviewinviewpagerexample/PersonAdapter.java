package fi.ptm.listviewinviewpagerexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by PTM on 24.11.2015.
 */
public class PersonAdapter extends ArrayAdapter<Person>{
    private final Context context;
    private final ArrayList<Person> persons;

    public PersonAdapter(Context context, ArrayList<Person> persons) {
        super(context,-1,persons);
        this.context = context;
        this.persons = persons;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.listview_item, parent, false);
        // name
        TextView nameTextView = (TextView) rowView.findViewById(R.id.nameTextView);
        nameTextView.setText(persons.get(position).getName());
        // count
        final TextView countTextView = (TextView) rowView.findViewById(R.id.countTextView);
        countTextView.setText(persons.get(position).getCount()+"");
        // + button
        Button addButton = (Button) rowView.findViewById(R.id.addButton);
        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.persons.get(position).addCount();
                countTextView.setText(persons.get(position).getCount() + "");
            }
        });
        // - button
        Button decreaseButton = (Button) rowView.findViewById(R.id.decreaseButton);
        decreaseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MainActivity.persons.get(position).decreaseCount();
                countTextView.setText(persons.get(position).getCount() + "");
            }
        });
        return rowView;
    }

}
