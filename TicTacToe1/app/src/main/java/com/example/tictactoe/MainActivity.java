package com.example.tictactoe;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    AppCompatButton a, b, c, d, e, f, g, h, i, reset;
    String count = "0";
    String win;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a = findViewById(R.id.A);
        b = findViewById(R.id.B);
        c = findViewById(R.id.C);
        d = findViewById(R.id.D);
        e = findViewById(R.id.E);
        f = findViewById(R.id.F);
        g = findViewById(R.id.G);
        h = findViewById(R.id.H);
        i = findViewById(R.id.I);
        reset = findViewById(R.id.resetbtn);


        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a.setText("");
                b.setText("");
                c.setText("");
                d.setText("");
                e.setText("");
                f.setText("");
                g.setText("");
                h.setText("");
                i.setText("");

                a.setClickable(true);
                b.setClickable(true);
                c.setClickable(true);
                d.setClickable(true);
                e.setClickable(true);
                f.setClickable(true);
                g.setClickable(true);
                h.setClickable(true);
                i.setClickable(true);

            }
        });


        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(a);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(b);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(c);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(d);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(e);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(f);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(g);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(h);
            }
        });
        i.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checker(i);
            }
        });
    }

    public void checker(AppCompatButton z) {
        if (count.equals("1")) {
            z.setText("X");
            count = "0";
            z.setClickable(false);
            if (a.getText().equals(b.getText()) && b.getText().equals(c.getText())) {
                win = a.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();

                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (d.getText().equals(e.getText()) && e.getText().equals(f.getText())) {
                win = d.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (g.getText().equals(h.getText()) && h.getText().equals(i.getText())) {
                win = g.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (a.getText().equals(d.getText()) && d.getText().equals(g.getText())) {
                win = a.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (b.getText().equals(e.getText()) && e.getText().equals(h.getText())) {
                win = b.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (c.getText().equals(f.getText()) && f.getText().equals(i.getText())) {
                win = c.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (a.getText().equals(e.getText()) && e.getText().equals(i.getText())) {
                win = a.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (c.getText().equals(e.getText()) && e.getText().equals(g.getText())) {
                win = c.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }










        } else {
            z.setText("O");
            count = "1";
            z.setClickable(false);
            if (a.getText().equals(b.getText()) && b.getText().equals(c.getText())) {
                win = a.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (d.getText().equals(e.getText()) && e.getText().equals(f.getText())) {
                win = d.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (g.getText().equals(h.getText()) && h.getText().equals(i.getText())) {
                win = g.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (a.getText().equals(d.getText()) && d.getText().equals(g.getText())) {
                win = a.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (b.getText().equals(e.getText()) && e.getText().equals(h.getText())) {
                win = b.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (c.getText().equals(f.getText()) && f.getText().equals(i.getText())) {
                win = c.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (a.getText().equals(e.getText()) && e.getText().equals(i.getText())) {
                win = a.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }
            if (c.getText().equals(e.getText()) && e.getText().equals(g.getText())) {
                win = c.getText().toString();
                if (win != "") {

                    Toast.makeText(this, win + " is winner!", Toast.LENGTH_SHORT).show();
                    a.setClickable(false);
                    b.setClickable(false);
                    c.setClickable(false);
                    d.setClickable(false);
                    e.setClickable(false);
                    f.setClickable(false);
                    g.setClickable(false);
                    h.setClickable(false);
                    i.setClickable(false);
                }
            }





        }
    }
}
