package com.example.shahzaib.dialogusingdialogfragmentclass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements MyDialog.OnDialogButtonClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showDialog(View view)
    {
        MyDialog myDialog = new MyDialog();
        myDialog.show(getFragmentManager(),"myDialog");
    }

    @Override
    public void onDialogButtonClickListener(View view) {

        switch (view.getId())
        {
            case R.id.okBtn:
                Toast.makeText(this, "Ok Button Clicked", Toast.LENGTH_SHORT).show();
                break;

            case R.id.cancelBtn:
                Toast.makeText(this, "Cancel Button Clicked", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
