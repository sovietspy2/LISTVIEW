package randomcompany.listview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

   // public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";

    TextView tvName;
    TextView tvHome;
    TextView tvId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvHome = (TextView) findViewById(R.id.tvHome);
        tvName = (TextView) findViewById(R.id.tvName);
        tvId = (TextView) findViewById(R.id.tvId);

        Intent i = getIntent();
        if (i!=null) {
            try {
                User user = (User) i.getExtras().getSerializable("user");
                tvName.setText(user.name);
                tvHome.setText(user.hometown);
                tvId.setText(user.id);
            } catch (Exception E) {
                Toast.makeText(this, "well well well", Toast.LENGTH_SHORT).show();
            }

        }
    }

    public void clickedButton(View v) {
        Intent intent = new Intent(this, Main3Activity.class);
       // EditText editText = (EditText) findViewById(R.id.);
        //String message = editText.getText().toString();


        ArrayList<String> list = new ArrayList<String>();
        list.add("SZAR");
        list.add("FOS");

        intent.putExtra("list",list);



        startActivity(intent);
    }
}
