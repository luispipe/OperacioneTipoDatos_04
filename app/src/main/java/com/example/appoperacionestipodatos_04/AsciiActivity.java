package com.example.appoperacionestipodatos_04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AsciiActivity extends AppCompatActivity {
    //variable global
    EditText etxAscii;
    Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ascii);
        //variable loca
        EditText etxChar= findViewById(R.id.editTextChar);
        etxAscii= findViewById(R.id.editTextAscii);
        convert= findViewById(R.id.buttonConverAscii);

        //Object-> puede almacenar cualquier tipo de dato pero le quita su propiadad
        //String es el segundo tipo de dato más importente en Java

        /*El usuario ingresa en el sistemas un carácter y se le regresa
        el valor Ascii
        * */
        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String txtChar= etxChar.getText().toString();
                if(txtChar.length()==1){
                // Hola = 0->H 1->o 2->l 3->a
                    // @ ->0
                    char character= txtChar.charAt(0);
                    int ascii= (int)character;
                    etxAscii.setText(ascii+"");
                }else{
                    //Ventana emergente
                    Toast.makeText(getBaseContext(),"Ingresar solo un carácter",
                            Toast.LENGTH_LONG).show();
                }
            }
        });



    }



}