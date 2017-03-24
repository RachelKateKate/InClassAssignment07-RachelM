package rachelmiller.inclassassignment07_rachelm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference titleRef = database.getReference("planet");
    private DatabaseReference peopleRef = database.getReference("Solar System");
    private TextView title;
    private TextView name;
    private TextView distance;
    private CheckBox hasWater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        title = (TextView) findViewById(R.id.title);
        name = (TextView) findViewById(R.id.planet);
        distance = (TextView) findViewById(R.id.distance);
        hasWater = (CheckBox) findViewById(R.id.water);
    }

    public void setTitle(View view) {

        titleRef.setValue(title.getText().toString());
    }

    public void addPlanet(View view) {
        String planetName = name.getText().toString();
        int sunDistance = Integer.parseInt(distance.getText().toString());
        boolean planetHasWater = ((CheckBox) findViewById(R.id.water)).isChecked();
        peopleRef.push().setValue(new Planet(planetName, sunDistance, planetHasWater));
    }

}