package randomcompany.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        intent = getIntent();

        /*ArrayList<String> list = (ArrayList<String>) intent.getExtras().getSerializable("list");

        ArrayAdapter<String> itemsAdapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, list);

        ListView listView = (ListView) findViewById(R.id.lvitems);
        listView.setAdapter(itemsAdapter);
        */

        // Construct the data source
        ArrayList<User> arrayOfUsers = new ArrayList<User>();


// Create the adapter to convert the array to views
        UsersAdapter adapter = new UsersAdapter(this, arrayOfUsers);

        User newUser = new User("Nathan", "San Diego", "23");
        adapter.add(newUser);
// Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvitems);
        listView.setAdapter(adapter);


    }


}
