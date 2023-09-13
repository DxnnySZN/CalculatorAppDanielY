package com.example.calculatorappdaniely;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    TextView workingsTV;
    TextView resultsTV;
    String workings = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // use this code for activity_main.xml instead of frame_1.xml
        //findID();
    }

    //private void findID(){
        //workingsTV = (TextView)findViewById(R.id.workingsTextView);
        //resultsTV = (TextView)findViewById(R.id.resultTextView);
    //}
    private void setWorkings(String givenValue){
        // method is going to get called for each of the buttons(textviews)
        // whatever button i click on, it will display my input
        workings += givenValue;
        workingsTV.setText(workings);
    }
    public void clearOnClick(View view){
        workingsTV.setText("");
        workings = "";
        resultsTV.setText("");
    }
    public void equalsOnClick(View view){
        Double result = null;
        ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");{
            try{
                result = (double)engine.eval(workings);
                // given the workings string, it will do the math and put the math into the result
            } catch (ScriptException e){
                Toast.makeText(this, "Invalid Input", Toast.LENGTH_SHORT).show();
                // for the people that try to purposely input wrong syntax
            }
        }
        if(result != null){
            // if result is not null, set the result textview to the results of the double
            // cast that double into a string
            resultsTV.setText(String.valueOf(result.doubleValue()));
        }
    }
    public void oneOnClick(View view){
        setWorkings("1");
    }
    public void twoOnClick(View view){
        setWorkings("2");
    }
    public void threeOnClick(View view){
        setWorkings("3");
    }
    public void fourOnClick(View view){
        setWorkings("4");
    }
    public void fiveOnClick(View view){
        setWorkings("5");
    }
    public void sixOnClick(View view){
        setWorkings("6");
    }
    public void sevenOnClick(View view){
        setWorkings("7");
    }
    public void eightOnClick(View view){
        setWorkings("8");
    }
    public void nineOnClick(View view){
        setWorkings("9");
    }
    public void addOnClick(View view){
        setWorkings("+");
    }
    public void subtractOnClick(View view){
        setWorkings("-");
    }
    public void multiplyOnClick(View view){
        setWorkings("*");
    }
    public void divideOnClick(View view){
        setWorkings("/");
    }
}