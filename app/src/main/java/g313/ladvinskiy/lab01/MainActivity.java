package g313.ladvinskiy.lab01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edit_text_a, edit_text_b;
    TextView Result_text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edit_text_a =  findViewById(R.id.editTextNumberDecimal3);
        edit_text_b =  findViewById(R.id.editTextNumberDecimal4);
        Result_text =   findViewById(R.id.textView4);
    }

    public void add_click(View v){
        String aa = edit_text_a.getText().toString();
        String bb = edit_text_b.getText().toString();
        if(aa.isEmpty() || bb.isEmpty()){
            Result_text.setText("Допиши");
            return;
        }
        float a = Float.parseFloat(aa);
        float b = Float.parseFloat(bb);
        Result_text.setText(String.format("%.12f", a+b));

    }
    public void sub_click(View v){
        String aa = edit_text_a.getText().toString();
        String bb = edit_text_b.getText().toString();
        if(aa.isEmpty() || bb.isEmpty()){
            Result_text.setText("Допиши");
            return;
        }
        float a = Float.parseFloat(aa);
        float b = Float.parseFloat(bb);
        Result_text.setText(String.format("%.12f", a-b));
    }
    public void mult_click(View v){
        String aa = edit_text_a.getText().toString();
        String bb = edit_text_b.getText().toString();
        if(aa.isEmpty() || bb.isEmpty()){
            Result_text.setText("Допиши");
            return;
        }
        float a = Float.parseFloat(aa);
        float b = Float.parseFloat(bb);
        Result_text.setText(String.format("%.12f", a*b));
    }
    public void div_click(View v){
        String aa = edit_text_a.getText().toString();
        String bb = edit_text_b.getText().toString();
        if(aa.isEmpty() || bb.isEmpty()){
            Result_text.setText("Допиши");
            return;
        }
        float a = Float.parseFloat(aa);
        float b = Float.parseFloat(bb);
        if(b == 0){
            Result_text.setText("не дели на ноль");
            return;
        }
        float res = a/b;
        Result_text.setText(String.format("%.12f", res));
    }
    public void sins(View v){
        String aa = edit_text_a.getText().toString();
        if(aa.isEmpty()){
            Result_text.setText("Допиши");
            return;
        }
        float a = Float.parseFloat(aa);
        Result_text.setText(String.format("%.12f", Math.sin(a)));
    }
    public void coss(View v){
        String aa = edit_text_a.getText().toString();
        if(aa.isEmpty()){
            Result_text.setText("Допиши");
            return;
        }
        float a = Float.parseFloat(aa);
        Result_text.setText(String.format("%.12f",Math.cos(a)));
    }
    public void tgs(View v){
        String aa = edit_text_a.getText().toString();
        if(aa.isEmpty()){
            Result_text.setText("Допиши");
            return;
        }
        float a = Float.parseFloat(aa);
        Result_text.setText(String.format("%.12f", Math.tan(a)));
    }
    public void ctgs(View v){
        String aa = edit_text_a.getText().toString();
        if(aa.isEmpty()){
            Result_text.setText("Допиши");
            return;
        }
        float a = Float.parseFloat(aa);
        if (Math.sin(a) == 0){
            Result_text.setText("Бесконечное!!!!");
            return;
        }
        Result_text.setText(String.format("%.12f", Math.cos(a)/Math.sin(a)));
    }
}