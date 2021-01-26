/*
Connor Murray 991553779
This is assignment 1 to demostrate my performce of activities  and how to invoke third party app
 */
package connor.murray.s991553779;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class ConnorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void callIntent(View view) {
        Intent intent;
        switch (view.getId()) {
            case R.id.btnLaunch:
                Toast toast = Toast.makeText(getApplicationContext(),"Opening Twitch.tv",Toast.LENGTH_SHORT);
                toast.show();
                intent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://www.twitch.tv"));
                startActivity(intent);
                break;
            case R.id.btnSnack:
//                Snackbar.make(view, "Swapped Menu", Snackbar.LENGTH_LONG)
//                    .setAction("Action", null).show();
                intent = new Intent(this, MurrayActivity.class);
                startActivity(intent);
            default:
                break;
        }
    }
}