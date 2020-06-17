package ir.sinasoheili.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    private TextView tv_display;
    private Button btn_clear ;
    private Button btn_one ;
    private Button btn_two ;
    private Button btn_three ;
    private Button btn_four ;
    private Button btn_five ;
    private Button btn_six ;
    private Button btn_seven ;
    private Button btn_eight ;
    private Button btn_nine ;
    private Button btn_zero ;
    private Button btn_equal ;
    private Button btn_multiplication ;
    private Button btn_division ;
    private Button btn_plus ;
    private Button btn_subtract ;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init_obj();
    }

    private void init_obj()
    {
        tv_display = findViewById(R.id.display);

        btn_clear = findViewById(R.id.clear);
        btn_clear.setOnClickListener(this);

        btn_one = findViewById(R.id.one);
        btn_one.setOnClickListener(this);

        btn_two = findViewById(R.id.two);
        btn_two.setOnClickListener(this);

        btn_three = findViewById(R.id.three);
        btn_three.setOnClickListener(this);

        btn_four = findViewById(R.id.four);
        btn_four.setOnClickListener(this);

        btn_five = findViewById(R.id.five);
        btn_five.setOnClickListener(this);

        btn_six = findViewById(R.id.six);
        btn_six.setOnClickListener(this);

        btn_seven = findViewById(R.id.seven);
        btn_seven.setOnClickListener(this);

        btn_eight = findViewById(R.id.eight);
        btn_eight.setOnClickListener(this);

        btn_nine = findViewById(R.id.nine);
        btn_nine.setOnClickListener(this);

        btn_zero = findViewById(R.id.zero);
        btn_zero.setOnClickListener(this);

        btn_equal = findViewById(R.id.equal);
        btn_equal.setOnClickListener(this);

        btn_multiplication = findViewById(R.id.multiplication);
        btn_multiplication.setOnClickListener(this);

        btn_division = findViewById(R.id.division);
        btn_division.setOnClickListener(this);

        btn_plus = findViewById(R.id.plus);
        btn_plus.setOnClickListener(this);

        btn_subtract = findViewById(R.id.subtract);
        btn_subtract.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
        if(v.equals(btn_clear))
        {
            Log.i("tag" , btn_clear.getText().toString()+" :: "+btn_clear.getId());
        }
        else if(v.equals(btn_one))
        {
            Log.i("tag" , btn_one.getText().toString()+" :: "+btn_one.getId());
        }
        else if(v.equals(btn_two))
        {
            Log.i("tag" , btn_two.getText().toString()+" :: "+btn_two.getId());
        }
        else if(v.equals(btn_three))
        {
            Log.i("tag" , btn_three.getText().toString()+" :: "+btn_three.getId());
        }
        else if(v.equals(btn_four))
        {
            Log.i("tag" , btn_four.getText().toString()+" :: "+btn_four.getId());
        }
        else if(v.equals(btn_five))
        {
            Log.i("tag" , btn_five.getText().toString()+" :: "+btn_five.getId());
        }
        else if(v.equals(btn_six))
        {
            Log.i("tag" , btn_six.getText().toString()+" :: "+btn_six.getId());
        }
        else if(v.equals(btn_seven))
        {
            Log.i("tag" , btn_seven.getText().toString()+" :: "+btn_seven.getId());
        }
        else if(v.equals(btn_eight))
        {
            Log.i("tag" , btn_eight.getText().toString()+" :: "+btn_eight.getId());
        }
        else if(v.equals(btn_nine))
        {
            Log.i("tag" , btn_nine.getText().toString()+" :: "+btn_nine.getId());
        }
        else if(v.equals(btn_zero))
        {
            Log.i("tag" , btn_zero.getText().toString()+" :: "+btn_zero.getId());
        }
        else if(v.equals(btn_equal))
        {
            Log.i("tag" , btn_equal.getText().toString()+" :: "+btn_equal.getId());
        }
        else if(v.equals(btn_multiplication))
        {
            Log.i("tag" , btn_multiplication.getText().toString()+" :: "+btn_multiplication.getId());
        }
        else if(v.equals(btn_division))
        {
            Log.i("tag" , btn_division.getText().toString()+" :: "+btn_division.getId());
        }
        else if(v.equals(btn_plus))
        {
            Log.i("tag" , btn_plus.getText().toString()+" :: "+btn_plus.getId());
        }
        else if(v.equals(btn_subtract))
        {
            Log.i("tag" , btn_subtract.getText().toString()+" :: "+btn_subtract.getId());
        }
    }
}
