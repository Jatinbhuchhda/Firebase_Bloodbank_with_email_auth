package com.jatin.bloodbank;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.sdsmdg.tastytoast.TastyToast;

public class BankAddressActivity extends AppCompatActivity {

    Spinner bankadd;
    Button view_add;
    TextView cityChoice;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_address);

        bankadd = (Spinner)findViewById(R.id.bankadd);
        view_add = (Button)findViewById(R.id.view_add);
        cityChoice = (TextView)findViewById(R.id.cityChoice);


        final String[] citis = new String[]{"NONE","Ahmedabad","Amreli","Anand","Banaskantha","Bharuch","Bhavnagar","Dahod","Dang","Gandhinagar",
                "Gir Somnath","Jamnagar","Junagadh","Kheda","Kutch","Mehsana","Navsari","Panchmahal","Patan","Porbandar",
                "Rajkot","Sabarkantha","Surat","Surendranagar","Tapi","Vadodara","Valsad"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, citis);
        bankadd.setAdapter(adapter);



        view_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String choice = bankadd.getSelectedItem().toString();
                if (choice.equals("NONE")){
                    TastyToast.makeText(getApplicationContext(),"Select City !",TastyToast.LENGTH_LONG,TastyToast.ERROR).show();
                    return;
                }
                if (choice.equals("Amreli")){
                    cityChoice.setText(R.string.amreli);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if (choice.equals("Rajkot")){
                    cityChoice.setText(R.string.rajkot);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Anand")){
                    cityChoice.setText(R.string.anand);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Ahmedabad")){
                    cityChoice.setText(R.string.amd);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Banaskantha")){
                    cityChoice.setText(R.string.banaskatha);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Bharuch")){
                    cityChoice.setText(R.string.bharuch);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Bhavnagar")){
                    cityChoice.setText(R.string.bhavnagar);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Dahod")){
                    cityChoice.setText(R.string.dahod);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Dang")){
                    cityChoice.setText(R.string.dang);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Gandhinagar")){
                    cityChoice.setText(R.string.gandhinagar);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Gir Somnath")){
                    cityChoice.setText(R.string.gir_somnath);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Jamnagar")){
                    cityChoice.setText(R.string.jamnagar);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Junagadh")){
                    cityChoice.setText(R.string.junagadh);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Kheda")){
                    cityChoice.setText(R.string.kheda);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }
                if(choice.equals("Kutch")){
                    cityChoice.setText(R.string.kutch);
                    cityChoice.setVisibility(View.VISIBLE);
                    return;
                }

                else {
                    cityChoice.setVisibility(View.INVISIBLE);
                    TastyToast.makeText(getApplicationContext(),"Searching for Data... !",TastyToast.LENGTH_LONG,TastyToast.INFO).show();
                    TastyToast.makeText(getApplicationContext(),"No Data Found !",TastyToast.LENGTH_LONG,TastyToast.ERROR).show();
                    return;
                }
            }
        });

    }
}
