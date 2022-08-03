package com.example.trackingtask;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;



public class Ads extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ads);

        ImageButton add = (ImageButton)findViewById(R.id.add);
        ImageButton delete = (ImageButton)findViewById(R.id.delete);
        ImageButton subtract = (ImageButton)findViewById(R.id.subtract);


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Ads.this, CB.class);
                startActivity(intent);
                delete.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent intent = new Intent(Ads.this, CB.class);
                        startActivity(intent);
                        subtract.setOnClickListener(new View.OnClickListener() {
                            @Override
                            public void onClick(View view) {
                                Intent intent = new Intent(Ads.this, CB.class);
                                startActivity(intent);


                            }


});
    }
});
            }
        });
    }
}