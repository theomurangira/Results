package rw.ac.unilak.results;

import android.app.IntentService;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.util.Random;

public class ActvityTwo extends AppCompatActivity {
    public static int requestcode=4;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actvity_two);
        //btn=findViewById(R.id.launch);
    }

    public void Clikcked(View view) {
        Random random =new Random();
        int a=random.nextInt(40);
        Intent intent = new Intent();
        intent.putExtra("result",a);
        setResult(RESULT_OK,intent);
        finish();
    }
}
