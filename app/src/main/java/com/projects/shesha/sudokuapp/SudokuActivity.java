package com.projects.shesha.sudokuapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SudokuActivity extends AppCompatActivity {
    private SudokuSolver sudokuSolver;
    private Button button1,button2,button3,button4,button5,button6,button7,button8,button9,button10,button11
            ,button12,button13,button14,button15,button16,button17,button18,button19,button20,button21,
            button22,button23,button24,button25,button26,button27,button28,button29,button30,button31
            ,button32,button33,button34,button35,button36,button37,button38,button39,button40,button41
            ,button42,button43,button44,button45,button46,button47,button48,button49,button50,button51
            ,button52,button53,button54,button55,button56,button57,button58,button59,button60,button61
            ,button62,button63,button64,button65,button66,button67,button68,button69,button70,button71
            ,button72,button73,button74,button75,button76,button77,button78,button79,button80,button81;
    private static int numberSelected;
    int[][] userEnteredNumbers;
    private Button showSolutionBtn;
    private int[][] board;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sudoku);
        showSolutionBtn = (Button) findViewById(R.id.solutionBtnId);
        sudokuSolver = new SudokuSolver(SudokuSolver.GRID_TO_SOLVE);
        sudokuSolver.solve();
        initializeButtons();
        board = sudokuSolver.getBoard();
        userEnteredNumbers = new int[9][9];
        initializeUserEnteredArray();
        String difficultyLevel = getIntent().getExtras().getString("Difficulty_level");
        switch (difficultyLevel)
        {
            case "Beginner":
                button1.setText(board[0][0] + "");
                userEnteredNumbers[0][0] = board[0][0];
                button9.setText(board[0][8] + "");
                userEnteredNumbers[0][8] = board[0][8];
                button15.setText(board[1][4] + "");
                userEnteredNumbers[1][4] = board[1][4];
                button24.setText(board[2][3] + "");
                userEnteredNumbers[2][3] = board[2][3];
                button36.setText(board[3][5] +"");
                userEnteredNumbers[3][5] = board[3][5];
                break;
            case "Amateur":
                button1.setText(board[0][0] + "");
                userEnteredNumbers[0][0] = board[0][0];
                button9.setText(board[0][8] + "");
                userEnteredNumbers[0][8] = board[0][8];
                button15.setText(board[1][4] + "");
                userEnteredNumbers[1][4] = board[1][4];
                break;
            case "Expert":
                button1.setText(board[0][0] + "");
                userEnteredNumbers[0][0] = board[0][0];
                button9.setText(board[0][8] + "");
                userEnteredNumbers[0][8] = board[0][8];
                break;
        }
        showSolutionBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                button1.setText(board[0][0] + "");
                button2.setText(board[0][1] + "");
                button3.setText(board[0][2] + "");
                button4.setText(board[0][3] + "");
                button5.setText(board[0][4] + "");
                button6.setText(board[0][5] + "");
                button7.setText(board[0][6] + "");
                button8.setText(board[0][7] + "");
                button9.setText(board[0][8] + "");
                button10.setText(board[1][0] + "");
                button11.setText(board[1][1] + "");
                button12.setText(board[1][2] + "");
                button13.setText(board[1][3] + "");
                button14.setText(board[1][4] + "");
                button15.setText(board[1][5] + "");
                button16.setText(board[1][6] + "");
                button17.setText(board[1][7] + "");
                button18.setText(board[1][8] + "");
                button19.setText(board[2][0] + "");
                button20.setText(board[2][1] + "");
                button21.setText(board[2][2] + "");
                button22.setText(board[2][3] + "");
                button23.setText(board[2][4] + "");
                button24.setText(board[2][5] + "");
                button25.setText(board[2][6] + "");
                button26.setText(board[2][7] + "");
                button27.setText(board[2][8] + "");
                button28.setText(board[3][0] + "");
                button29.setText(board[3][1] + "");
                button30.setText(board[3][2] + "");
                button31.setText(board[3][3] + "");
                button32.setText(board[3][4] + "");
                button33.setText(board[3][5] + "");
                button34.setText(board[3][6] + "");
                button35.setText(board[3][7] + "");
                button36.setText(board[3][8] + "");
                button37.setText(board[4][0] + "");
                button38.setText(board[4][1] + "");
                button39.setText(board[4][2] + "");
                button40.setText(board[4][3] + "");
                button41.setText(board[4][4] + "");
                button42.setText(board[4][5] + "");
                button43.setText(board[4][6] + "");
                button44.setText(board[4][7] + "");
                button45.setText(board[4][8] + "");
                button46.setText(board[5][0] + "");
                button47.setText(board[5][1] + "");
                button48.setText(board[5][2] + "");
                button49.setText(board[5][3] + "");
                button50.setText(board[5][4] + "");
                button51.setText(board[5][5] + "");
                button52.setText(board[5][6] + "");
                button53.setText(board[5][7] + "");
                button54.setText(board[5][8] + "");
                button55.setText(board[6][0] + "");
                button56.setText(board[6][1] + "");
                button57.setText(board[6][2] + "");
                button58.setText(board[6][3] + "");
                button59.setText(board[6][4] + "");
                button60.setText(board[6][5] + "");
                button61.setText(board[6][6] + "");
                button62.setText(board[6][7] + "");
                button63.setText(board[6][8] + "");
                button64.setText(board[7][0] + "");
                button65.setText(board[7][1] + "");
                button66.setText(board[7][2] + "");
                button67.setText(board[7][3] + "");
                button68.setText(board[7][4] + "");
                button69.setText(board[7][5] + "");
                button70.setText(board[7][6] + "");
                button71.setText(board[7][7] + "");
                button72.setText(board[7][8] + "");
                button73.setText(board[8][0] + "");
                button74.setText(board[8][1] + "");
                button75.setText(board[8][2] + "");
                button76.setText(board[8][3] + "");
                button77.setText(board[8][4] + "");
                button78.setText(board[8][5] + "");
                button79.setText(board[8][6] + "");
                button80.setText(board[8][7] + "");
                button81.setText(board[8][8] + "");
                checkForCorrectness();
            }
        });


    }

    private void checkForCorrectness() {
        if (board[0][0] == userEnteredNumbers[0][0])
        {
            button1.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][0] == 0)
        {
            button1.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button1.setBackgroundResource(R.color.redLight);
        }
        if (board[0][1] == userEnteredNumbers[0][1])
        {
            button2.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][1] == 0)
        {
            button2.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button2.setBackgroundResource(R.color.redLight);
        }
        if (board[0][2] == userEnteredNumbers[0][2])
        {
            button3.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][2] == 0)
        {
            button3.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button3.setBackgroundResource(R.color.redLight);
        }
        if (board[0][3] == userEnteredNumbers[0][3])
        {
            button4.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][3] == 0)
        {
            button4.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button4.setBackgroundResource(R.color.redLight);
        }
        if (board[0][4] == userEnteredNumbers[0][4])
        {
            button5.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][4] == 0)
        {
            button5.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button5.setBackgroundResource(R.color.redLight);
        }
        if (board[0][5] == userEnteredNumbers[0][5])
        {
            button6.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][5] == 0)
        {
            button6.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button6.setBackgroundResource(R.color.redLight);
        }
        if (board[0][6] == userEnteredNumbers[0][6])
        {
            button7.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][6] == 0)
        {
            button7.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button7.setBackgroundResource(R.color.redLight);
        }
        if (board[0][7] == userEnteredNumbers[0][7])
        {
            button8.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][7] == 0)
        {
            button8.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button8.setBackgroundResource(R.color.redLight);
        }
        if (board[0][8] == userEnteredNumbers[0][8])
        {
            button9.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[0][8] == 0)
        {
            button9.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button9.setBackgroundResource(R.color.redLight);
        }
        if (board[1][0] == userEnteredNumbers[1][0])
        {
            button10.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][0] == 0)
        {
            button10.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button10.setBackgroundResource(R.color.redLight);
        }
        if (board[1][1] == userEnteredNumbers[1][1])
        {
            button11.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][1] == 0)
        {
            button11.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button11.setBackgroundResource(R.color.redLight);
        }
        if (board[1][2] == userEnteredNumbers[1][2])
        {
            button12.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][2] == 0)
        {
            button12.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button12.setBackgroundResource(R.color.redLight);
        }
        if (board[1][3] == userEnteredNumbers[1][3])
        {
            button13.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][3] == 0)
        {
            button13.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button13.setBackgroundResource(R.color.redLight);
        }
        if (board[1][4] == userEnteredNumbers[1][4])
        {
            button14.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][4] == 0)
        {
            button14.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button14.setBackgroundResource(R.color.redLight);
        }
        if (board[1][5] == userEnteredNumbers[1][5])
        {
            button15.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][5] == 0)
        {
            button15.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button15.setBackgroundResource(R.color.redLight);
        }
        if (board[1][6] == userEnteredNumbers[1][6])
        {
            button16.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][6] == 0)
        {
            button16.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button16.setBackgroundResource(R.color.redLight);
        }
        if (board[1][7] == userEnteredNumbers[1][7])
        {
            button17.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][7] == 0)
        {
            button17.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button17.setBackgroundResource(R.color.redLight);
        }
        if (board[1][8] == userEnteredNumbers[1][8])
        {
            button18.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[1][8] == 0)
        {
            button18.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button18.setBackgroundResource(R.color.redLight);
        }
        if (board[2][0] == userEnteredNumbers[2][0])
        {
            button19.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][0] == 0)
        {
            button19.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button19.setBackgroundResource(R.color.redLight);
        }
        if (board[2][1] == userEnteredNumbers[2][1])
        {
            button20.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][1] == 0)
        {
            button20.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button20.setBackgroundResource(R.color.redLight);
        }
        if (board[2][2] == userEnteredNumbers[2][2])
        {
            button21.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][2] == 0)
        {
            button21.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button21.setBackgroundResource(R.color.redLight);
        }
        if (board[2][3] == userEnteredNumbers[2][3])
        {
            button22.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][3] == 0)
        {
            button22.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button22.setBackgroundResource(R.color.redLight);
        }
        if (board[2][4] == userEnteredNumbers[2][4])
        {
            button23.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][4] == 0)
        {
            button23.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button23.setBackgroundResource(R.color.redLight);
        }
        if (board[2][5] == userEnteredNumbers[2][5])
        {
            button24.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][5] == 0)
        {
            button24.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button24.setBackgroundResource(R.color.redLight);
        }
        if (board[2][6] == userEnteredNumbers[2][6])
        {
            button25.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][6] == 0)
        {
            button25.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button25.setBackgroundResource(R.color.redLight);
        }
        if (board[2][7] == userEnteredNumbers[2][7])
        {
            button26.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][7] == 0)
        {
            button26.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button26.setBackgroundResource(R.color.redLight);
        }
        if (board[2][8] == userEnteredNumbers[2][8])
        {
            button27.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[2][8] == 0)
        {
            button27.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button27.setBackgroundResource(R.color.redLight);
        }
        if (board[3][0] == userEnteredNumbers[3][0])
        {
            button28.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][0] == 0)
        {
            button28.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button28.setBackgroundResource(R.color.redLight);
        }
        if (board[3][1] == userEnteredNumbers[3][1])
        {
            button29.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][1] == 0)
        {
            button29.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button29.setBackgroundResource(R.color.redLight);
        }
        if (board[3][2] == userEnteredNumbers[3][2])
        {
            button30.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][2] == 0)
        {
            button30.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button30.setBackgroundResource(R.color.redLight);
        }
        if (board[3][3] == userEnteredNumbers[3][3])
        {
            button31.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][3] == 0)
        {
            button31.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button31.setBackgroundResource(R.color.redLight);
        }
        if (board[3][4] == userEnteredNumbers[3][4])
        {
            button32.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][4] == 0)
        {
            button32.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button32.setBackgroundResource(R.color.redLight);
        }
        if (board[3][5] == userEnteredNumbers[3][5])
        {
            button33.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][5] == 0)
        {
            button33.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button33.setBackgroundResource(R.color.redLight);
        }
        if (board[3][6] == userEnteredNumbers[3][6])
        {
            button34.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][6] == 0)
        {
            button34.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button34.setBackgroundResource(R.color.redLight);
        }
        if (board[3][7] == userEnteredNumbers[3][7])
        {
            button35.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][7] == 0)
        {
            button35.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button35.setBackgroundResource(R.color.redLight);
        }
        if (board[3][8] == userEnteredNumbers[3][8])
        {
            button36.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[3][8] == 0)
        {
            button36.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button36.setBackgroundResource(R.color.redLight);
        }
        if (board[4][0] == userEnteredNumbers[4][0])
        {
            button37.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][0] == 0)
        {
            button37.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button37.setBackgroundResource(R.color.redLight);
        }
        if (board[4][1] == userEnteredNumbers[4][1])
        {
            button38.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][1] == 0)
        {
            button38.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button38.setBackgroundResource(R.color.redLight);
        }
        if (board[4][2] == userEnteredNumbers[4][2])
        {
            button39.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][2] == 0)
        {
            button39.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button39.setBackgroundResource(R.color.redLight);
        }
        if (board[4][3] == userEnteredNumbers[4][3])
        {
            button40.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][3] == 0)
        {
            button40.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button40.setBackgroundResource(R.color.redLight);
        }
        if (board[4][4] == userEnteredNumbers[4][4])
        {
            button41.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][4] == 0)
        {
            button41.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button41.setBackgroundResource(R.color.redLight);
        }
        if (board[4][5] == userEnteredNumbers[4][5])
        {
            button42.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][5] == 0)
        {
            button42.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button42.setBackgroundResource(R.color.redLight);
        }
        if (board[4][6] == userEnteredNumbers[4][6])
        {
            button43.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][6] == 0)
        {
            button43.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button43.setBackgroundResource(R.color.redLight);
        }
        if (board[4][7] == userEnteredNumbers[4][7])
        {
            button44.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][7] == 0)
        {
            button44.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button44.setBackgroundResource(R.color.redLight);
        }
        if (board[4][8] == userEnteredNumbers[4][8])
        {
            button45.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[4][8] == 0)
        {
            button45.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button45.setBackgroundResource(R.color.redLight);
        }
        if (board[5][0] == userEnteredNumbers[5][0])
        {
            button46.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][0] == 0)
        {
            button46.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button46.setBackgroundResource(R.color.redLight);
        }
        if (board[5][1] == userEnteredNumbers[5][1])
        {
            button47.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][1] == 0)
        {
            button47.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button47.setBackgroundResource(R.color.redLight);
        }
        if (board[5][2] == userEnteredNumbers[5][2])
        {
            button48.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][2] == 0)
        {
            button48.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button48.setBackgroundResource(R.color.redLight);
        }
        if (board[5][3] == userEnteredNumbers[5][3])
        {
            button49.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][3] == 0)
        {
            button49.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button49.setBackgroundResource(R.color.redLight);
        }
        if (board[5][4] == userEnteredNumbers[5][4])
        {
            button50.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][4] == 0)
        {
            button50.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button50.setBackgroundResource(R.color.redLight);
        }
        if (board[5][5] == userEnteredNumbers[5][5])
        {
            button51.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][5] == 0)
        {
            button51.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button51.setBackgroundResource(R.color.redLight);
        }
        if (board[5][6] == userEnteredNumbers[5][6])
        {
            button52.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][6] == 0)
        {
            button52.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button52.setBackgroundResource(R.color.redLight);
        }
        if (board[5][7] == userEnteredNumbers[5][7])
        {
            button53.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][7] == 0)
        {
            button53.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button53.setBackgroundResource(R.color.redLight);
        }
        if (board[5][8] == userEnteredNumbers[5][8])
        {
            button54.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[5][8] == 0)
        {
            button54.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button54.setBackgroundResource(R.color.redLight);
        }
        if (board[6][0] == userEnteredNumbers[6][0])
        {
            button55.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][0] == 0)
        {
            button55.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button55.setBackgroundResource(R.color.redLight);
        }
        if (board[6][1] == userEnteredNumbers[6][1])
        {
            button56.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][1] == 0)
        {
            button56.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button56.setBackgroundResource(R.color.redLight);
        }
        if (board[6][2] == userEnteredNumbers[6][2])
        {
            button57.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][2] == 0)
        {
            button57.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button57.setBackgroundResource(R.color.redLight);
        }
        if (board[6][3] == userEnteredNumbers[6][3])
        {
            button58.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][3] == 0)
        {
            button58.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button58.setBackgroundResource(R.color.redLight);
        }
        if (board[6][4] == userEnteredNumbers[6][4])
        {
            button59.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][4] == 0)
        {
            button59.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button59.setBackgroundResource(R.color.redLight);
        }
        if (board[6][5] == userEnteredNumbers[6][5])
        {
            button60.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][5] == 0)
        {
            button60.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button60.setBackgroundResource(R.color.redLight);
        }
        if (board[6][6] == userEnteredNumbers[6][6])
        {
            button61.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][6] == 0)
        {
            button61.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button61.setBackgroundResource(R.color.redLight);
        }
        if (board[6][7] == userEnteredNumbers[6][7])
        {
            button62.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][7] == 0)
        {
            button62.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button62.setBackgroundResource(R.color.redLight);
        }
        if (board[6][8] == userEnteredNumbers[6][8])
        {
            button63.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[6][8] == 0)
        {
            button63.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button63.setBackgroundResource(R.color.redLight);
        }
        if (board[7][0] == userEnteredNumbers[7][0])
        {
            button64.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][0] == 0)
        {
            button64.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button64.setBackgroundResource(R.color.redLight);
        }
        if (board[7][1] == userEnteredNumbers[7][1])
        {
            button65.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][1] == 0)
        {
            button65.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button65.setBackgroundResource(R.color.redLight);
        }
        if (board[7][2] == userEnteredNumbers[7][2])
        {
            button66.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][2] == 0)
        {
            button66.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button66.setBackgroundResource(R.color.redLight);
        }
        if (board[7][3] == userEnteredNumbers[7][3])
        {
            button67.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][3] == 0)
        {
            button67.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button67.setBackgroundResource(R.color.redLight);
        }
        if (board[7][4] == userEnteredNumbers[7][4])
        {
            button68.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][4] == 0)
        {
            button68.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button68.setBackgroundResource(R.color.redLight);
        }
        if (board[7][5] == userEnteredNumbers[7][5])
        {
            button69.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][5] == 0)
        {
            button69.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button69.setBackgroundResource(R.color.redLight);
        }
        if (board[7][6] == userEnteredNumbers[7][6])
        {
            button70.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][6] == 0)
        {
            button70.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button70.setBackgroundResource(R.color.redLight);
        }
        if (board[7][7] == userEnteredNumbers[7][7])
        {
            button71.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][7] == 0)
        {
            button71.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button71.setBackgroundResource(R.color.redLight);
        }
        if (board[7][8] == userEnteredNumbers[7][8])
        {
            button72.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[7][8] == 0)
        {
            button72.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button72.setBackgroundResource(R.color.redLight);
        }
        if (board[8][0] == userEnteredNumbers[8][0])
        {
            button73.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][0] == 0)
        {
            button73.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button73.setBackgroundResource(R.color.redLight);
        }
        if (board[8][1] == userEnteredNumbers[8][1])
        {
            button74.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][1] == 0)
        {
            button74.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button74.setBackgroundResource(R.color.redLight);
        }
        if (board[8][2] == userEnteredNumbers[8][2])
        {
            button75.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][2] == 0)
        {
            button75.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button75.setBackgroundResource(R.color.redLight);
        }
        if (board[8][3] == userEnteredNumbers[8][3])
        {
            button76.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][3] == 0)
        {
            button76.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button76.setBackgroundResource(R.color.redLight);
        }
        if (board[8][4] == userEnteredNumbers[8][4])
        {
            button77.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][4] == 0)
        {
            button77.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button77.setBackgroundResource(R.color.redLight);
        }
        if (board[8][5] == userEnteredNumbers[8][5])
        {
            button78.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][5] == 0)
        {
            button78.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button78.setBackgroundResource(R.color.redLight);
        }
        if (board[8][6] == userEnteredNumbers[8][6])
        {
            button79.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][6] == 0)
        {
            button79.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button79.setBackgroundResource(R.color.redLight);
        }
        if (board[8][7] == userEnteredNumbers[8][7])
        {
            button80.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][7] == 0)
        {
            button80.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button80.setBackgroundResource(R.color.redLight);
        }
        if (board[8][8] == userEnteredNumbers[8][8])
        {
            button81.setBackgroundResource(R.color.darkGreen);
        }
        else if (userEnteredNumbers[8][8] == 0)
        {
            button81.setBackgroundResource(R.color.caramelLight);
        }
        else
        {
            button81.setBackgroundResource(R.color.redLight);
        }

    }


    private void initializeUserEnteredArray() {
        for (int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                userEnteredNumbers[i][j] = 0;
            }
        }
    }


    private void acceptNumberInput(final Button button, final int rowNumber, final int columnNumber)
    {
        final Dialog dialog = new Dialog(SudokuActivity.this);
        dialog.setContentView(R.layout.number_input_layout);
        TextView numberOne = dialog.findViewById(R.id.numberOneInputId);
        TextView numberTwo = dialog.findViewById(R.id.numberTwoInputId);
        TextView numberThree = dialog.findViewById(R.id.numberThreeInputId);
        TextView numberFour = dialog.findViewById(R.id.numberFourInputId);
        TextView numberFive = dialog.findViewById(R.id.numberFiveInputId);
        TextView numberSix = dialog.findViewById(R.id.numberSixInputId);
        TextView numberSeven = dialog.findViewById(R.id.numberSevenInputId);
        TextView numberEight = dialog.findViewById(R.id.numberEightInputId);
        TextView numberNine = dialog.findViewById(R.id.numberNineInputId);
        dialog.show();
        numberOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 1;
                userEnteredNumbers[rowNumber][columnNumber] = 1;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });
        numberTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 2;
                userEnteredNumbers[rowNumber][columnNumber] = 2;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });
        numberThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 3;
                userEnteredNumbers[rowNumber][columnNumber] = 3;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });
        numberFour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 4;
                userEnteredNumbers[rowNumber][columnNumber] = 4;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });
        numberFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 5;
                userEnteredNumbers[rowNumber][columnNumber] = 5;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });
        numberSix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 6;
                userEnteredNumbers[rowNumber][columnNumber] = 6;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });
        numberSeven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 7;
                userEnteredNumbers[rowNumber][columnNumber] = 7;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });
        numberEight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 8;
                userEnteredNumbers[rowNumber][columnNumber] = 8;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });
        numberNine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                numberSelected = 9;
                userEnteredNumbers[rowNumber][columnNumber] = 9;
                button.setText(numberSelected+"");
                dialog.dismiss();
            }
        });

    }

    public void handleNumberInput(View view)
    {
        int id = view.getId();
        switch (id)
        {
            case R.id.button:
                acceptNumberInput(button1,0,0);
                break;
            case R.id.button2:
                acceptNumberInput(button2,0,1);
                break;
                case R.id.button3:
                acceptNumberInput(button3,0,2);
            break;
            case R.id.button4:
                acceptNumberInput(button4,0,3);
            break;
            case R.id.button5:
                acceptNumberInput(button5,0,4);
            break;
            case R.id.button6:
                acceptNumberInput(button6,0,5);
            break;
            case R.id.button7:
                acceptNumberInput(button7,0,6);
            break;
            case R.id.button8:
                acceptNumberInput(button8,0,7);
            break;
            case R.id.button9:
                acceptNumberInput(button9,0,8);
                break;
            case R.id.button10:
                acceptNumberInput(button10,1,0);
                break;
            case R.id.button11:
                acceptNumberInput(button11,1,1);
                break;
            case R.id.button12:
                acceptNumberInput(button12,1,2);
                break;
            case R.id.button13:
                acceptNumberInput(button13,1,3);
                break;
            case R.id.button14:
                acceptNumberInput(button14,1,4);
                break;
            case R.id.button15:
                acceptNumberInput(button15,1,5);
                break;
            case R.id.button16:
                acceptNumberInput(button16,1,6);
                break;
            case R.id.button17:
                acceptNumberInput(button17,1,7);
                break;
            case R.id.button18:
                acceptNumberInput(button18,1,8);
                break;
            case R.id.button19:
                acceptNumberInput(button19,2,0);
                break;
            case R.id.button20:
                acceptNumberInput(button20,2,1);
                break;
            case R.id.button21:
                acceptNumberInput(button21,2,2);
                break;
            case R.id.button22:
                acceptNumberInput(button22,2,3);
                break;
            case R.id.button23:
                acceptNumberInput(button23,2,4);
                break;
            case R.id.button24:
                acceptNumberInput(button24,2,5);
                break;
            case R.id.button25:
                acceptNumberInput(button25,2,6);
                break;
            case R.id.button26:
                acceptNumberInput(button26,2,7);
                break;
            case R.id.button27:
                acceptNumberInput(button27,2,8);
                break;
            case R.id.button28:
                acceptNumberInput(button28,3,0);
                break;
            case R.id.button29:
                acceptNumberInput(button29,3,1);
                break;
            case R.id.button30:
                acceptNumberInput(button30,3,2);
                break;
            case R.id.button31:
                acceptNumberInput(button31,3,3);
                break;
            case R.id.button32:
                acceptNumberInput(button32,3,4);
                break;
            case R.id.button33:
                acceptNumberInput(button33,3,5);
                break;
            case R.id.button34:
                acceptNumberInput(button34,3,6);
                break;
            case R.id.button35:
                acceptNumberInput(button35,3,7);
                break;
            case R.id.button36:
                acceptNumberInput(button36,3,8);
                break;
            case R.id.button37:
                acceptNumberInput(button37,4,0);
                break;
            case R.id.button38:
                acceptNumberInput(button38,4,1);
                break;
            case R.id.button39:
                acceptNumberInput(button39,4,2);
                break;
            case R.id.button40:
                acceptNumberInput(button40,4,3);
                break;
            case R.id.button41:
                acceptNumberInput(button41,4,4);
                break;
            case R.id.button42:
                acceptNumberInput(button42,4,5);
                break;
            case R.id.button43:
                acceptNumberInput(button43,4,6);
                break;
            case R.id.button44:
                acceptNumberInput(button44,4,7);
                break;
            case R.id.button45:
                acceptNumberInput(button45,4,8);
                break;
            case R.id.button46:
                acceptNumberInput(button46,5,0);
                break;
            case R.id.button47:
                acceptNumberInput(button47,5,1);
                break;
            case R.id.button48:
                acceptNumberInput(button48,5,2);
                break;
            case R.id.button49:
                acceptNumberInput(button49,5,3);
                break;
            case R.id.button50:
                acceptNumberInput(button50,5,4);
                break;
            case R.id.button51:
                acceptNumberInput(button51,5,5);
                break;
            case R.id.button52:
                acceptNumberInput(button52,5,6);
                break;
            case R.id.button53:
                acceptNumberInput(button53,5,7);
                break;
            case R.id.button54:
                acceptNumberInput(button54,5,8);
                break;
            case R.id.button55:
                acceptNumberInput(button55,6,0);
                break;
            case R.id.button56:
                acceptNumberInput(button56,6,1);
                break;
            case R.id.button57:
                acceptNumberInput(button57,6,2);
                break;
            case R.id.button58:
                acceptNumberInput(button58,6,3);
                break;
            case R.id.button59:
                acceptNumberInput(button59,6,4);
                break;
            case R.id.button60:
                acceptNumberInput(button60,6,5);
                break;
            case R.id.button61:
                acceptNumberInput(button61,6,6);
                break;
            case R.id.button62:
                acceptNumberInput(button62,6,7);
                break;
            case R.id.button63:
                acceptNumberInput(button63,6,8);
                break;
            case R.id.button64:
                acceptNumberInput(button64,7,0);
                break;
            case R.id.button65:
                acceptNumberInput(button65,7,1);
                break;
            case R.id.button66:
                acceptNumberInput(button66,7,2);
                break;
            case R.id.button67:
                acceptNumberInput(button67,7,3);
                break;
            case R.id.button68:
                acceptNumberInput(button68,7,4);
                break;
            case R.id.button69:
                acceptNumberInput(button69,7,5);
                break;
            case R.id.button70:
                acceptNumberInput(button70,7,6);
                break;
            case R.id.button71:
                acceptNumberInput(button71,7,7);
                break;
            case R.id.button72:
                acceptNumberInput(button72,7,8);
                break;
            case R.id.button73:
                acceptNumberInput(button73,8,0);
                break;
            case R.id.button74:
                acceptNumberInput(button74,8,1);
                break;
            case R.id.button75:
                acceptNumberInput(button75,8,2);
                break;
            case R.id.button76:
                acceptNumberInput(button76,8,3);
                break;
            case R.id.button77:
                acceptNumberInput(button77,8,4);
                break;
            case R.id.button78:
                acceptNumberInput(button78,8,5);
                break;
            case R.id.button79:
                acceptNumberInput(button79,8,6);
                break;
            case R.id.button80:
                acceptNumberInput(button80,8,7);
                break;
            case R.id.button81:
                acceptNumberInput(button81,8,8);
                break;


        }
    }

    private void initializeButtons() {
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);
        button19 = (Button) findViewById(R.id.button19);
        button20 = (Button) findViewById(R.id.button20);
        button21 = (Button) findViewById(R.id.button21);
        button22 = (Button) findViewById(R.id.button22);
        button23 = (Button) findViewById(R.id.button23);
        button24 = (Button) findViewById(R.id.button24);
        button25 = (Button) findViewById(R.id.button25);
        button26 = (Button) findViewById(R.id.button26);
        button27 = (Button) findViewById(R.id.button27);
        button28 = (Button) findViewById(R.id.button28);
        button29 = (Button) findViewById(R.id.button29);
        button30 = (Button) findViewById(R.id.button30);
        button31 = (Button) findViewById(R.id.button31);
        button32 = (Button) findViewById(R.id.button32);
        button33 = (Button) findViewById(R.id.button33);
        button34 = (Button) findViewById(R.id.button34);
        button35 = (Button) findViewById(R.id.button35);
        button36 = (Button) findViewById(R.id.button36);
        button37 = (Button) findViewById(R.id.button37);
        button38 = (Button) findViewById(R.id.button38);
        button39 = (Button) findViewById(R.id.button39);
        button40 = (Button) findViewById(R.id.button40);
        button41 = (Button) findViewById(R.id.button41);
        button42 = (Button) findViewById(R.id.button42);
        button43 = (Button) findViewById(R.id.button43);
        button44 = (Button) findViewById(R.id.button44);
        button45 = (Button) findViewById(R.id.button45);
        button46 = (Button) findViewById(R.id.button46);
        button47 = (Button) findViewById(R.id.button47);
        button48 = (Button) findViewById(R.id.button48);
        button49 = (Button) findViewById(R.id.button49);
        button50 = (Button) findViewById(R.id.button50);
        button51 = (Button) findViewById(R.id.button51);
        button52 = (Button) findViewById(R.id.button52);
        button53 = (Button) findViewById(R.id.button53);
        button54 = (Button) findViewById(R.id.button54);
        button55 = (Button) findViewById(R.id.button55);
        button56 = (Button) findViewById(R.id.button56);
        button57 = (Button) findViewById(R.id.button57);
        button58 = (Button) findViewById(R.id.button58);
        button59 = (Button) findViewById(R.id.button59);
        button60 = (Button) findViewById(R.id.button60);
        button61 = (Button) findViewById(R.id.button61);
        button62 = (Button) findViewById(R.id.button62);
        button63 = (Button) findViewById(R.id.button63);
        button64 = (Button) findViewById(R.id.button64);
        button65 = (Button) findViewById(R.id.button65);
        button66 = (Button) findViewById(R.id.button66);
        button67 = (Button) findViewById(R.id.button67);
        button68 = (Button) findViewById(R.id.button68);
        button69 = (Button) findViewById(R.id.button69);
        button70 = (Button) findViewById(R.id.button70);
        button71 = (Button) findViewById(R.id.button71);
        button72 = (Button) findViewById(R.id.button72);
        button73 = (Button) findViewById(R.id.button73);
        button74 = (Button) findViewById(R.id.button74);
        button75 = (Button) findViewById(R.id.button75);
        button76 = (Button) findViewById(R.id.button76);
        button77 = (Button) findViewById(R.id.button77);
        button78 = (Button) findViewById(R.id.button78);
        button79 = (Button) findViewById(R.id.button79);
        button80 = (Button) findViewById(R.id.button80);
        button81 = (Button) findViewById(R.id.button81);

    }
}
