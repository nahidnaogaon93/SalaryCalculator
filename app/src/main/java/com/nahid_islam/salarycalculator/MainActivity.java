package com.nahid_islam.salarycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    EditText basicSalaryEt;
    EditText medicalPercentageEt;
    EditText houseRentEt;
    TextView totalAmountTv;
    Button calculation;
    Button reset;
    boolean  flag=true;
    SalaryCalculator salaryCalculator;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        basicSalaryEt=(EditText)findViewById(R.id.basic_Salary);
        medicalPercentageEt=(EditText)findViewById(R.id.medical_Percentage);
        houseRentEt=(EditText)findViewById(R.id.house_Rent);
        totalAmountTv=(TextView)findViewById(R.id.show_Total_Salary);
        }
    public void btnTotalCalculation(View view){
      salaryCalculator = new SalaryCalculator();
        salaryCalculator.setBasicSalary(Double.parseDouble(basicSalaryEt.getText().toString()));
        salaryCalculator.setMedicalPercentage(Float.parseFloat(medicalPercentageEt.getText().toString()));
        salaryCalculator.setHouseRent(Float.parseFloat(houseRentEt.getText().toString()));
        double totalSalary=salaryCalculator.calculateTotalSalary();

        totalAmountTv.setText((new DecimalFormat("##.###").format(totalSalary)));


    }

}
