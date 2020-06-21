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

    private double num1 = 0;
    private double num2 = 0;
    private char operator = '$';
    private boolean is_num2_set = false;
    private boolean last_op_was_equal = false;

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
//            Log.i("tag" , btn_clear.getText().toString()+" :: "+btn_clear.getId());
            clear();
        }
        else if(v.equals(btn_one))
        {
//            Log.i("tag" , btn_one.getText().toString()+" :: "+btn_one.getId());
            set_number(1);
        }
        else if(v.equals(btn_two))
        {
//            Log.i("tag" , btn_two.getText().toString()+" :: "+btn_two.getId());
            set_number(2);
        }
        else if(v.equals(btn_three))
        {
//            Log.i("tag" , btn_three.getText().toString()+" :: "+btn_three.getId());
            set_number(3);
        }
        else if(v.equals(btn_four))
        {
//            Log.i("tag" , btn_four.getText().toString()+" :: "+btn_four.getId());
            set_number(4);
        }
        else if(v.equals(btn_five))
        {
//            Log.i("tag" , btn_five.getText().toString()+" :: "+btn_five.getId());
            set_number(5);
        }
        else if(v.equals(btn_six))
        {
//            Log.i("tag" , btn_six.getText().toString()+" :: "+btn_six.getId());
            set_number(6);
        }
        else if(v.equals(btn_seven))
        {
//            Log.i("tag" , btn_seven.getText().toString()+" :: "+btn_seven.getId());
            set_number(7);
        }
        else if(v.equals(btn_eight))
        {
//            Log.i("tag" , btn_eight.getText().toString()+" :: "+btn_eight.getId());
            set_number(8);
        }
        else if(v.equals(btn_nine))
        {
//            Log.i("tag" , btn_nine.getText().toString()+" :: "+btn_nine.getId());
            set_number(9);
        }
        else if(v.equals(btn_zero))
        {
//            Log.i("tag" , btn_zero.getText().toString()+" :: "+btn_zero.getId());
            set_number(0);
        }
        else if(v.equals(btn_equal))
        {
//            Log.i("tag" , btn_equal.getText().toString()+" :: "+btn_equal.getId());
            calculate();
            last_op_was_equal = true;
        }
        else if(v.equals(btn_multiplication))
        {
//            Log.i("tag" , btn_multiplication.getText().toString()+" :: "+btn_multiplication.getId());
            setOperator('*');
        }
        else if(v.equals(btn_division))
        {
//            Log.i("tag" , btn_division.getText().toString()+" :: "+btn_division.getId());
            setOperator('/');
        }
        else if(v.equals(btn_plus))
        {
//            Log.i("tag" , btn_plus.getText().toString()+" :: "+btn_plus.getId());
            setOperator('+');
        }
        else if(v.equals(btn_subtract))
        {
//            Log.i("tag" , btn_subtract.getText().toString()+" :: "+btn_subtract.getId());
            setOperator('-');
        }
    }

    private void clear()
    {
        num1 = 0;
        num2 = 0;
        operator = '$';
        showInTextView("");
        is_num2_set = false;
        last_op_was_equal = false;
    }

    private void set_number(int n)
    {
//        Log.i("tag" , "SET NUMBER :::: "+num1 + "    "+operator+"    "+num2 );

        if(last_op_was_equal)
        {
            clear();
//            Log.i("tag" , "CLEARED :::: "+num1 + "    "+operator+"    "+num2 );
        }

        if(operator == '$') // num1 must be set
        {
            num1 = (num1*10)+n;
            showInTextView(String.valueOf(num1));
//            Log.i("tag" , "NUM1 SET :::: "+num1 + "    "+operator+"    "+num2 );
        }
        else // num2 must be set
        {
            num2 = (num2*10)+n;
            showInTextView(String.valueOf(num2));
            is_num2_set = true;
//            Log.i("tag" , "NUM2 SET :::: "+num1 + "    "+operator+"    "+num2 );
        }
    }

    private void calculate()
    {
        String result = null;

        last_op_was_equal = false;
        is_num2_set = false;

//        Log.i("tag" , "before CALCULATE :::: "+num1 + "    "+operator+"    "+num2 );

        switch (operator)
        {
            case '*':
                num1 *= num2;
                result = String.valueOf(num1);
                break;

            case '/':
                if(num2 == 0)
                {
                    result = "NaN";
                }
                else
                {
                    num1 /= num2;
                    result = String.valueOf(num1);
                }
                break;

            case '+':
                num1 += num2;
                result = String.valueOf(num1);
                break;

            case '-':
                num1 -= num2;
                result = String.valueOf(num1);
                break;
        }

//        Log.i("tag" , "after CALCULATE :::: "+num1 + "    "+operator+"    "+num2 );

        showInTextView(result);
    }

    private void setOperator(char op)
    {
        if(is_num2_set)
        {
            calculate();
            operator = op;
            num2=0;
            is_num2_set = false;
        }
        else
        {
            num2 = 0 ;
            operator = op;
            showInTextView("");
        }

        last_op_was_equal=false;

//        Log.i("tag" , "SET OP :::: "+num1 + "    "+operator+"    "+num2 );
    }

    private void showInTextView(String text)
    {
        tv_display.setText(text);
    }
}
