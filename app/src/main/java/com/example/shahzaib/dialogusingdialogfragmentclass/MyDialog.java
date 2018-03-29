package com.example.shahzaib.dialogusingdialogfragmentclass;

import android.app.DialogFragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by Shahzaib on 3/29/2018.
 */

public class MyDialog extends DialogFragment implements View.OnClickListener{

    Button cancelBtn,okBtn;
    OnDialogButtonClickListener listener;





    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_dialog_layout,null);
        setCancelable(false); // jb dialoge k ilawa kahin aur click ho ga to dialog dismiss nahi hoga

        cancelBtn = view.findViewById(R.id.cancelBtn);
        okBtn = view.findViewById(R.id.okBtn);
        cancelBtn.setOnClickListener(this);
        okBtn.setOnClickListener(this);

        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        listener = (OnDialogButtonClickListener) getActivity();
    }


    @Override
    public void onClick(View view) {

        listener.onDialogButtonClickListener(view);
        dismiss();

       /* if(view.getId() == R.id.cancelBtn)
        {
            listener.onDialogButtonClickListener("cancel Button Clicked");
            dismiss();
        }

         if(view.getId() == R.id.okBtn)
        {
            listener.onDialogButtonClickListener("ok Button Clicked");
            dismiss();
        }*/


    }


    interface OnDialogButtonClickListener
    {
//        void onDialogButtonClickListener(String message);
        void onDialogButtonClickListener(View view);
    }

}
