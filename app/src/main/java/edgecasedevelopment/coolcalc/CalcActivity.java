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

    //Creating enum for operations
    public enum Operation {
        ADD, SUBTRACT, DIVIDE, MULTIPLY, EQUAL
    }

    //All global string values
    String runningNumber = "";
    String leftStringValue = "";
    String rightStringValue = "";

    //Declaring the end result
    int result = 0;

    //Declaring the current operation
    Operation currentOperation;

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
                processOperation(Operation.ADD);
            }
        });

        btnSubtract.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                processOperation(Operation.SUBTRACT);
            }
        });

        btnMultiply.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                processOperation(Operation.MULTIPLY);
            }
        });

        btnDivide.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                processOperation(Operation.DIVIDE);
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

    void processOperation(Operation operation){
        //Checks if there was a previous operation
        if (currentOperation != null){
            //Checks if there is actually numbers being processed
            if (runningNumber != ""){
                //Stores the current onscreen val
                rightStringValue = runningNumber;
                //Prepares the var to have a new val
                runningNumber = "";

                switch (currentOperation){
                    //Operation to add the values
                    case ADD:
                        result = Integer.parseInt(leftStringValue) + Integer.parseInt(rightStringValue);
                        break;
                    //Operation to subtract the values
                    case SUBTRACT:
                        result = Integer.parseInt(leftStringValue) - Integer.parseInt(rightStringValue);
                        break;
                    //Operation to multiply the values
                    case MULTIPLY:
                        result = Integer.parseInt(leftStringValue) * Integer.parseInt(rightStringValue);
                        break;
                    //Operation to divide the values
                    case DIVIDE:
                        result = Integer.parseInt(leftStringValue) / Integer.parseInt(rightStringValue);
                        break;
                }
                //Converts result into string and save to leftStringValue
                leftStringValue = String.valueOf(result);
                txtResult.setText(leftStringValue);
            }
        } else {
            //First time pressing an operator
            leftStringValue = runningNumber;
            runningNumber = "";
        }

        //updates the current operation with the one selected
        currentOperation = operation;
    }

    //Stores the number on the screen
    void numberPressed(int number){
        runningNumber += String.valueOf(number);
        txtResult.setText(runningNumber);
    }
}
