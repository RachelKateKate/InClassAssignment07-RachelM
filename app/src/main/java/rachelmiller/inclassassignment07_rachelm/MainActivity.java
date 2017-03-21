package rachelmiller.inclassassignment07_rachelm;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference planetRef = database.getReference("planet");
    private DatabaseReference peopleRef = database.getReference("Solar System");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setTitle(View view) {
        planetRef.setValue(new Planet("Mars", 431, true));
    }

    public void addPlanet(View view) {
        peopleRef.push().setValue(new Planet("Mars", 431, true));
    }

}