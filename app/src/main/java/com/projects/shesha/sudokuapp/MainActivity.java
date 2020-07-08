package com.projects.shesha.sudokuapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Button startGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startGameButton = (Button) findViewById(R.id.startGameBtnId);
        startGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                displayDifficultyLevelDialog();
            }
        });
    }

    private void displayDifficultyLevelDialog() {
        final Dialog dialog = new Dialog(this);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        dialog.setContentView(R.layout.difficulty_level_dialog);
        List<String> stringList=new ArrayList<>();
        stringList.add("Beginner");
        stringList.add("Amateur");
        stringList.add("Expert");

        final RadioGroup radioGroup = (RadioGroup) dialog.findViewById(R.id.radio_group);

        for(int i=0;i<stringList.size();i++){
            RadioButton radioButton=new RadioButton(this);
            radioButton.setText(stringList.get(i));
            radioGroup.addView(radioButton);
        }
        dialog.show();
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int childCount = radioGroup.getChildCount();
                for (int i = 0; i < childCount; i++)
                {
                    RadioButton radioButton = (RadioButton) radioGroup.getChildAt(i);
                    if (checkedId == radioGroup.getChildAt(i).getId())
                    {
                        switch (radioButton.getText().toString())
                        {
                            case "Beginner":
                                startActivity(new Intent(MainActivity.this,SudokuActivity.class));
                                break;
                            case "Amateur":
                                break;
                            case "Expert":
                                break;
                        }
                    }
                }
            }
        });

    }
}
