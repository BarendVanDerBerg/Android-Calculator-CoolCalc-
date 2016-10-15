package edgecasedevelopment.coolcalc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class CalcActivity extends Activity {

    //Declares the text view
    TextView txtResult;

    //All global string values
    String runningNumber = "";
    String leftStringValue = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);

        //Number button deceleration
        Button btnZero = (Button)findViewById(R.id.btnZero);
        Button btnOne = (Button)findViewById(R.id.btnOne);
        Button btnTwo = (Button)findViewById(R.id.btnTwo);
        Button btnThree = (Button)findViewById(R.id.btnThree);
        Button btnFour = (Button)findViewById(R.id.btnFour);
        Button btnFive = (Button)findViewById(R.id.btnFive);
        Button btnSix = (Button)findViewById(R.id.btnSix);
        Button btnSeven = (Button)findViewById(R.id.btnSeven);
        Button btnEight = (Button)findViewById(R.id.btnEight);
        Button btnNine = (Button)findViewById(R.id.btnNine);

        //Function button deceleration
        ImageButton btnCalc = (ImageButton)findViewById(R.id.btnCalc);
        ImageButton btnMultiply = (ImageButton)findViewById(R.id.btnMultiply);
        ImageButton btnSubtract = (ImageButton)findViewById(R.id.btnSubtract);
        ImageButton btnAdd = (ImageButton)findViewById(R.id.btnAdd);
        ImageButton btnDivide = (ImageButton)findViewById(R.id.btnDivide);

        //Clear button deceleration
        Button btnClear = (Button)findViewById(R.id.btnClear);

        //Declares the TextView
        txtResult = (TextView)findViewById(R.id.txtResult);

        //Clears the text onCreate
        txtResult.setText("");

        //Set onClick listeners
        btnZero.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(0);
            }
        });

        btnOne.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(1);
            }
        });

        btnTwo.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(2);
            }
        });

        btnThree.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(3);
            }
        });

        btnFour.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(4);
            }
        });

        btnFive.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(5);
            }
        });

        btnSix.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(6);
            }
        });

        btnSeven.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(7);
            }
        });

        btnEight.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(8);
            }
        });

        btnNine.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                numberPressed(9);
            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        btnCalc.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });

        btnClear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

            }
        });
    }

    //Stores the number on the screen
    void numberPressed(int number){
        runningNumber += String.valueOf(number);
        txtResult.setText(runningNumber);
    }
}
