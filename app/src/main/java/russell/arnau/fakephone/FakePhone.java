package russell.arnau.fakephone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FakePhone extends AppCompatActivity {
    EditText numero;
    Button boto0;
    Button boto1;
    Button boto2;
    Button boto3;
    Button boto4;
    Button boto5;
    Button boto6;
    Button boto7;
    Button boto8;
    Button boto9;
    Button botoTruca;
    Button botoEsborra;
    String numeroTelefon;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fake_phone);

        final EditText numero = (EditText) findViewById(R.id.numero);
        Button boto0 = (Button) findViewById(R.id.boto0);
        Button boto1 = (Button) findViewById(R.id.boto1);
        Button boto2 = (Button) findViewById(R.id.boto2);
        Button boto3 = (Button) findViewById(R.id.boto3);
        Button boto4 = (Button) findViewById(R.id.boto4);
        Button boto5 = (Button) findViewById(R.id.boto5);
        Button boto6 = (Button) findViewById(R.id.boto6);
        Button boto7 = (Button) findViewById(R.id.boto7);
        Button boto8 = (Button) findViewById(R.id.boto8);
        Button boto9 = (Button) findViewById(R.id.boto9);
        Button botoTruca = (Button) findViewById(R.id.botoTruca);
        Button botoEsborra = (Button) findViewById(R.id.botoEsborra);

        numeroTelefon = "";
        numero.setText(numeroTelefon);

        boto0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 0;
                numero.setText(numeroTelefon);

            }
        });

        boto1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 1;
                numero.setText(numeroTelefon);

            }
        });

        boto2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 2;
                numero.setText(numeroTelefon);

            }
        });

        boto3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 3;
                numero.setText(numeroTelefon);

            }
        });

        boto4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 4;
                numero.setText(numeroTelefon);

            }
        });

        boto5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 5;
                numero.setText(numeroTelefon);

            }
        });

        boto6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 6;
                numero.setText(numeroTelefon);

            }
        });

        boto7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 7;
                numero.setText(numeroTelefon);

            }
        });

        boto8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = numeroTelefon + 8;
                numero.setText(numeroTelefon);

            }
        });

        boto9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon =  numeroTelefon + 9;
                numero.setText(numeroTelefon);

            }
        });

        botoTruca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FakePhone.this, "Trucant a "  + numeroTelefon,Toast.LENGTH_SHORT).show();

            }
        });

        botoEsborra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numeroTelefon = "";
                numero.setText(numeroTelefon);

            }
        });

    }


}
