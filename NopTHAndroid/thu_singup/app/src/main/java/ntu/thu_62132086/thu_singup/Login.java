package ntu.thu_62132086.thu_singup;



        import androidx.annotation.NonNull;
        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.graphics.Color;
        import android.os.Bundle;
        import android.text.TextUtils;
        import android.view.View;
        import android.widget.Button;
        import android.widget.ProgressBar;
        import android.widget.TextView;
        import android.widget.Toast;

        import com.google.android.gms.tasks.OnCompleteListener;
        import com.google.android.gms.tasks.Task;
        import com.google.android.material.textfield.TextInputEditText;
        import com.google.firebase.auth.AuthResult;
        import com.google.firebase.auth.FirebaseAuth;
        import com.google.firebase.auth.FirebaseUser;

pubpublic class Login extends AppCompatActivity {
    TextInputEditText editTextEmail, editTextPassword;
    Button buttonLog;
    FirebaseAuth mAuth;
    ProgressBar progressBar;
    TextView textView;
    @Override
    public void onStart() {
        super.onStart();
        FirebaseUser currentUser = mAuth.getCurrentUser();
        if(currentUser != null){
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            finish();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        editTextEmail = findViewById(R.id.email);
        mAuth = FirebaseAuth.getInstance();
        editTextPassword = findViewById(R.id.password);
        buttonLog = findViewById(R.id.btn_login);
        progressBar = findViewById(R.id.progressBar);
        textView = findViewById(R.id.tvregister);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setTextColor(Color.BLACK);
                Intent intent = new Intent(getApplicationContext(), Resister.class);
                startActivity(intent);
                finish();
            }
        });
        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                progressBar.setVisibility(View.VISIBLE);
                String email, password;
                email = String.valueOf(editTextEmail.getText());
                password = String.valueOf(editTextPassword.getText());
                if (TextUtils.isEmpty(email)){
                    Toast.makeText(Login.this, "Vui lòng nhập email", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(password)){
                    Toast.makeText(Login.this, "Vui lòng nhập password", Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(new OnCompleteListener<Auth>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                progressBar.setVisibility(View.GONE);
                                if (task.isSuccessful()) {
                                    Toast.makeText(getApplicationContext(), "Đăng nhập thành công  ", Toast.LENGTH_SHORT).show();
                                    Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                    startActivity(intent);
                                    finish();
                                } else {
                                    Toast.makeText(Login.this, "Đăng nhập thất bại.",
                                            Toast.LENGTH_SHORT).show();
                                }
                            }
                        });

            }
        });
    }
}