package cuongdinh.hcmut.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edtUsername, edtPassword;
    Button btnLogin, btnSignup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mapping();
        controlButton();
    }

    private void mapping(){
        edtUsername = (EditText)findViewById(R.id.edittextusername);
        edtPassword = (EditText)findViewById(R.id.edittextpassword);
        btnLogin = (Button)findViewById(R.id.btnlogin);
        btnSignup = (Button)findViewById(R.id.btnsignup);
    }

    private void controlButton(){
        // Login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                Intent homeActivity = new Intent(MainActivity.this, HomeActivity.class);
                startActivity(homeActivity);
            }
        });
    }
}
