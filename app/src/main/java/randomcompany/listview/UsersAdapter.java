package randomcompany.listview;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by hang1barnab502 on 2017.09.03..
 */

public class UsersAdapter extends ArrayAdapter<User> {
    public UsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        User user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvHome);
        // Populate the data into the template view using the data object
        tvName.setText(user.name);
        tvHome.setText(user.hometown);
        // Return the completed view to render on screen




        Button btButton = (Button) convertView.findViewById(R.id.btButton);
        // Cache row position inside the button using `setTag`
        // Attach the click event handler

        User u = getItem(position);
        // Cache user object inside the button using `setTag`
        btButton.setTag(user);

        btButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Access the row position here to get the correct data item
                User user = (User) view.getTag();
                // Do what you want here...

                Intent inti = new Intent(getContext(), MainActivity.class);
                inti.putExtra("user", (Serializable) user);
                getContext().startActivity(inti);

            }
        });



        return convertView;
    }


}