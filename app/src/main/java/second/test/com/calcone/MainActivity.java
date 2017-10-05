package second.test.com.calcone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btn0;
    Button btn1;
    Button btn2;
    Button btn3;
    Button btn4;
    Button btn5;
    Button btn6;
    Button btn7;
    Button btn8;
    Button btn9;

    Button btnComma;
    Button btnCalc;
    Button btnPlus;
    Button btnMinus;
    Button btnMul;
    Button btnDiv;
    Button btnC;
    Button btnDel;
    Button btnInv;
    Button btnNeg;
    Button btnRoot;
    Button btnSquare;
    Button btnMod;
    Button btnSin;
    Button btnCos;
    Button btnTan;

    TextView txtDisp;

    float acc = 0;
    String operation = "";
    boolean error = false;
    boolean next = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Intialization
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnComma = (Button) findViewById(R.id.btnComma);
        btnCalc = (Button) findViewById(R.id.btnCalc);
        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnMinus = (Button) findViewById(R.id.btnMinus);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnC = (Button) findViewById(R.id.btnC);
        btnDel = (Button) findViewById(R.id.btnDel);
        btnInv = (Button) findViewById(R.id.btnInv);
        btnNeg = (Button) findViewById(R.id.btnNeg);
        btnRoot = (Button) findViewById(R.id.btnRoot);
        btnSquare = (Button) findViewById(R.id.btnSquare);
        btnMod = (Button) findViewById(R.id.btnMod);
        btnSin = (Button) findViewById(R.id.btnSin);
        btnCos = (Button) findViewById(R.id.btnCos);
        btnTan = (Button) findViewById(R.id.btnTan);
        txtDisp = (TextView) findViewById(R.id.txtDisp);

        btn0.setOnClickListener(MainActivity.this);
        btn1.setOnClickListener(MainActivity.this);
        btn2.setOnClickListener(MainActivity.this);
        btn3.setOnClickListener(MainActivity.this);
        btn4.setOnClickListener(MainActivity.this);
        btn5.setOnClickListener(MainActivity.this);
        btn6.setOnClickListener(MainActivity.this);
        btn7.setOnClickListener(MainActivity.this);
        btn8.setOnClickListener(MainActivity.this);
        btn9.setOnClickListener(MainActivity.this);
        btnComma.setOnClickListener(MainActivity.this);
        btnCalc.setOnClickListener(MainActivity.this);
        btnPlus.setOnClickListener(MainActivity.this);
        btnMinus.setOnClickListener(MainActivity.this);
        btnMul.setOnClickListener(MainActivity.this);
        btnDiv.setOnClickListener(MainActivity.this);
        btnC.setOnClickListener(MainActivity.this);
        btnDel.setOnClickListener(MainActivity.this);
        btnInv.setOnClickListener(MainActivity.this);
        btnNeg.setOnClickListener(MainActivity.this);
        btnRoot.setOnClickListener(MainActivity.this);
        btnSquare.setOnClickListener(MainActivity.this);
        btnMod.setOnClickListener(MainActivity.this);
        btnSin.setOnClickListener(MainActivity.this);
        btnCos.setOnClickListener(MainActivity.this);
        btnTan.setOnClickListener(MainActivity.this);
    }

    @Override
    public void onClick(View v) {
        if(v.equals(btn0)) {
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("0");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "0");
        }
        if(v.equals(btn1)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("1");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "1");
        }
        if(v.equals(btn2)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("2");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "2");
        }
        if(v.equals(btn3)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("3");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "3");
        }
        if(v.equals(btn4)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("4");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "4");
        }
        if(v.equals(btn5)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("5");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "5");
        }
        if(v.equals(btn6)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("6");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "6");
        }
        if(v.equals(btn7)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("7");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "7");
        }
        if(v.equals(btn8)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("8");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "8");
        }
        if(v.equals(btn9)) {
            if(error) return;
            if(next || txtDisp.getText().toString().equals("0")){
                txtDisp.setText("9");
                next = false;
            } else txtDisp.setText(txtDisp.getText() + "9");
        }
        if(v.equals(btnComma)) {
            if(error) return;
            if(!txtDisp.getText().toString().contains("."))
                if(next){
                    txtDisp.setText(".");
                    next = false;
                } else txtDisp.setText(txtDisp.getText() + ".");
        }
        if(v.equals(btnCalc)) {
            if(error) return;
            if(operation.equals("")) return;
            String s = calc();
            try {
                if (Float.parseFloat(s) == 0) s = "0";
            } catch (Exception e) {}
            setTxtDisp(s);
        }
        if(v.equals(btnPlus)) {
            if(error) return;
            if(!operation.equals("")) setTxtDisp(calc());
            operation = "plus";
            next();
        }
        if(v.equals(btnMinus)) {
            if(error) return;
            if(!operation.equals("")) setTxtDisp(calc());
            operation = "minus";
            next();
        }
        if(v.equals(btnMul)) {
            if(error) return;
            if(!operation.equals("")) setTxtDisp(calc());
            operation = "mul";
            next();
        }
        if(v.equals(btnDiv)) {
            if(error) return;
            if(!operation.equals("")) setTxtDisp(calc());
            operation = "div";
            next();
        }
        if(v.equals(btnC)) {
            if(txtDisp.getText().length() > 1)
                txtDisp.setText(txtDisp.getText().subSequence(0, txtDisp.getText().length()-1));
            else if(txtDisp.getText().length() == 1)
                txtDisp.setText("0");
        }
        if(v.equals(btnDel)) {
            acc = 0;
            error = false;
            next = true;
            txtDisp.setText("0");
        }
        if(v.equals(btnInv)) {
            if(error) return;
            // TODO fix
            /* float f = Float.parseFloat(txtDisp.getText().toString());
            if(f == 0)
            String s = Float.toString(Float.parseFloat(txtDisp.getText().toString()) * -1);
            if(s.substring(s.length()-2, s.length()).equals(".0")) s = s.substring(0, s.length()-2);
            txtDisp.setText(s);*/
        }
        if(v.equals(btnNeg))  {
            // TODO
            setTxtDisp(Float.parseFloat(txtDisp.getText().toString()) * -1);
        }
        if(v.equals(btnRoot)) {
            // TODO
            return;
        }
        if(v.equals(btnSquare)) {
            // TODO
            return;
        }
        if(v.equals(btnMod)) {
            // TODO
            return;
        }
        if(v.equals(btnSin)) {
            // TODO
            return;
        }
        if(v.equals(btnCos)) {
            // TODO
            return;
        }
        if(v.equals(btnTan)) {
            // TODO
            return;
        }

    }

    private void setTxtDisp(float f){
        String s = Float.toString(f);
        setTxtDisp(s);
    }

    private void setTxtDisp(String s){
        if(s.length() > 2 && s.substring(s.length()-2, s.length()).equals(".0"))
            s = s.substring(0, s.length()-2);
        txtDisp.setText(s);

    }

    private String raiseError(String s){
        error = true;
        return s;
    }

    private String calc(){
        switch (operation){
            case "plus": operation = ""; return plus();
            case "minus": operation = ""; return minus();
            case "mul": operation = ""; return mul();
            case "div": operation = ""; return div();
            default: operation = ""; return raiseError("UNKNOWN");
        }
    }

    private String plus(){
        Float f = Float.parseFloat(txtDisp.getText().toString());
        acc += f;
        operation = "";
        return Float.toString(acc);
    }

    private String minus(){
        Float f = Float.parseFloat(txtDisp.getText().toString());
        acc -= f;
        operation = "";
        return Float.toString(acc);
    }

    private String mul(){
        Float f = Float.parseFloat(txtDisp.getText().toString());
        acc *= f;
        operation = "";
        return Float.toString(acc);
    }

    private String div(){
        Float f = Float.parseFloat(txtDisp.getText().toString());
        if(txtDisp.getText().toString().equals("0")) return raiseError("DIV 0");
        acc /= f;
        operation = "";
        return Float.toString(acc);
    }

    private void next(){
        next = true;
        acc = Float.parseFloat(txtDisp.getText().toString());
    }
}
