package com.example.trackingtask;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class AT extends AppCompatActivity {

    EditText task1,initial1,final1;
    Button button;

    private static final String KEY_TASK1= "task1_key";
    private static final String KEY_INITIAL1 = "initial1_key";
    private static final String KEY_FINAL1 = "final1_key";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_at);

        task1 = (EditText) findViewById(R.id.task1);
        initial1 = (EditText) findViewById(R.id.initial1);
        final1 = (EditText) findViewById(R.id.final1);
        button = (Button) findViewById(R.id.button);

        if (savedInstanceState != null) {
            String savedFirstName = savedInstanceState.getString(KEY_TASK1);


            String savedLastName = savedInstanceState.getString(KEY_INITIAL1);


            String savedTitle = savedInstanceState.getString(KEY_FINAL1);
            button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent intent = new Intent(AT.this, MainActivity.class);
                    startActivity(intent);
                }

        });


    }

}
}