package id.ac.polinema.intent;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

public class ProfileParcelableActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
//            String usernameInput
            // TODO: display value here
        }
    }
}
