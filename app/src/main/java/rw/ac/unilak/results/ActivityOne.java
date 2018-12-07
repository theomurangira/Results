package rw.ac.unilak.results;

import android.app.IntentService;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityOne extends AppCompatActivity {
  public static int RequestCode=4;
   Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_one);
        btn=findViewById(R.id.launch);
    }

    public void onClick(View view) {
        Intent it = new Intent(this,ActvityTwo.class);
        startActivityForResult(it,RequestCode);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode==RequestCode&& resultCode==RESULT_OK)
        {
            int number =data.getIntExtra("result",-2);
            btn.setText(Integer.toString(number));
        }
        else
            btn.setText("No Result from Activity 2");
    }
}
