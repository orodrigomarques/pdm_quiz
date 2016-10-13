package br.com.fatecpg.mymathtests;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    int t;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public int getEditValue(int id){
        EditText e =(EditText)findViewById(id);
        return Integer.parseInt(e.getText().toString());

    }



    public void initTest(View view){

                try {
                    t = getEditValue(R.id.range);
                    Intent i = new Intent(this, TestActivity.class);
                    i.putExtra("", t);
                    startActivity(i);
                }catch(NumberFormatException e){

                    Toast.makeText(getApplicationContext(),"Escolha entre 1 e 30", Toast.LENGTH_LONG).show();
                }

    }
}
