package com.example.carserviceandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class home extends AppCompatActivity {
    Button login, about;
    DBHelper DB = new DBHelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        about = findViewById(R.id.aboutBtn);
        login = findViewById(R.id.loginBtn);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (DB.isDatabaseEmpty()) {
                    // Insert User Data
                    DB.insertuserdata("Liam Johnson", "pass123", "user1@gmail.com", "9876543210", "123 Maple St");
                    DB.insertuserdata("Emma Smith", "pass123", "thienphuocufo@yahoo.com.vn", "1234567890", "456 Oak Ave");
                    DB.insertuserdata("Noah Tremblay", "pass123", "user3@gmail.com", "5555555555", "789 Pine Ln");
                    DB.insertuserdata("Olivia Gagnon", "pass123", "user4@gmail.com", "1112223333", "321 Birch St");
                    DB.insertuserdata("Liam Johnson", "pass123", "user5@gmail.com", "7777777777", "654 Cedar Rd");
                    DB.insertuserdata("Sophia Leroux", "pass123", "user6@gmail.com", "3334445555", "987 Spruce Ave");
                    DB.insertuserdata("Jackson Belanger", "pass123", "user7@gmail.com", "8888888888", "123 Sycamore St");
                    DB.insertuserdata("Ava Lavoie", "pass123", "user8@gmail.com", "9999999999", "456 Magnolia Rd");
                    DB.insertuserdata("Lucas Boucher", "pass123", "user9@gmail.com", "4445556666", "789 Oak Dr");
                    DB.insertuserdata("Mia Levesque", "pass123", "user10@gmail.com", "2223334444", "321 Elm Ave");

                    // Insert Service Provider Data
                    DB.insertServiceProvider("pass123", "Mobile Menders", "Main street", "Vancouver", "BC", "V6A 1C7", "provider1@gmail.com", "604-555-1234", "a");
                    DB.insertServiceProvider("pass123", "GadgetGurus Repair", "Granville street", "Vancouver", "BC", "V6H 3K4", "provider2@gmail.com", "604-555-6789", "b");
                    DB.insertServiceProvider("pass123", "Smartphone Saviors", "King street", "Toronto", "ON", "M5V 1K4", "provider3@gmail.com", "416-555-4321", "c");
                    DB.insertServiceProvider("pass123", "QuickFix Mobile", "Yonge street", "Toronto", "ON", "M4N 3M7", "provider4@gmail.com", "416-555-9876", "d");
                    DB.insertServiceProvider("pass123", "CellTech Solutions", "Portage avenue", "Winnipeg", "MB", "R3G 0W4", "provider5@gmail.com", "204-555-3456", "e");
                    DB.insertServiceProvider("pass123", "iRepair Zone", "Regina avenue", "Saskatoon", "SK", "S7N 1B5", "provider6@gmail.com", "306-555-7890", "f");
                    DB.insertServiceProvider("pass123", "TechRevive Services", "Queen street", "Toronto", "ON", "M4C 1G5", "provider7@gmail.com", "416-555-2468", "g");
                    DB.insertServiceProvider("pass123", "MobileMaster Repairs", "Albert street", "Toronto", "ON", "S4R 2N3", "provider8@gmail.com", "416-555-1357", "h");
                    DB.insertServiceProvider("pass123", "ExpressPhone Fix", "St. James street", "Surrey", "BC", "V3T 5R5", "provider9@gmail.com", "604-555-8642", "i");
                    DB.insertServiceProvider("pass123", "RapidTech Mobile Repair", "Hastings street", "Vancouver", "BC", "V6B 1L1", "provider10@gmail.com", "604-555-0000", "j");

                    // Insert Service Detail Data for Mobile Repair
                    DB.insertServiceDetail("Screen Replacement", "It will include replacing the damaged screen with a new one");
                    DB.insertServiceDetail("Battery Upgrade", "It will include upgrading the mobile device's battery for improved performance");
                    DB.insertServiceDetail("Charging Port Repair", "It will include repairing or replacing the charging port for proper charging functionality");
                    DB.insertServiceDetail("Camera Module Replacement", "It will include replacing the faulty camera module with a new one");
                    DB.insertServiceDetail("Speaker Repair", "It will include repairing or replacing malfunctioning speakers for better audio quality");
                    DB.insertServiceDetail("Microphone Fix", "It will include fixing or replacing the microphone for clear voice reception");
                    DB.insertServiceDetail("Software Update", "It will include updating the mobile device's operating system to the latest version");
                    DB.insertServiceDetail("Water Damage Restoration", "It will include cleaning and repairing damage caused by water exposure");
                    DB.insertServiceDetail("Power Button Repair", "It will include repairing or replacing the power button for proper device control");
                    DB.insertServiceDetail("Data Recovery", "It will include retrieving and recovering lost or deleted data from the mobile device");


                    //Insert Service List Data
                    DB.insertServiceList("SP_1_2", 1, 2);
                    DB.insertServiceList("SP_1_3", 1, 3);
                    DB.insertServiceList("SP_1_4", 1, 4);
                    DB.insertServiceList("SP_1_5", 1, 5);
                    DB.insertServiceList("SP_1_6", 1, 6);

                    DB.insertServiceList("SP_2_1", 1, 1);
                    DB.insertServiceList("SP_2_2", 1, 2);
                    DB.insertServiceList("SP_2_6", 1, 6);
                    DB.insertServiceList("SP_2_7", 1, 7);

                    DB.insertServiceList("SP_3_3", 3, 3);
                    DB.insertServiceList("SP_3_1", 3, 1);
                    DB.insertServiceList("SP_3_2", 3, 2);

                    DB.insertServiceList("SP_4_5", 4, 5);
                    DB.insertServiceList("SP_4_1", 4, 1);
                    DB.insertServiceList("SP_4_2", 4, 2);
                    DB.insertServiceList("SP_4_3", 4, 3);

                    DB.insertServiceList("SP_4_6", 4, 6);
                    DB.insertServiceList("SP_4_7", 4, 7);
                    DB.insertServiceList("SP_4_8", 4, 8);
                    DB.insertServiceList("SP_4_9", 4, 9);


                    DB.insertServiceList("SP_5_8", 5, 8);
                    DB.insertServiceList("SP_5_7", 5, 7);
                    DB.insertServiceList("SP_5_11", 5, 11);

                    DB.insertServiceList("SP_6_4", 6, 4);
                    DB.insertServiceList("SP_6_10", 6, 10);
                    DB.insertServiceList("SP_6_11", 6, 11);

                    DB.insertServiceList("SP_7_1", 7, 1);
                    DB.insertServiceList("SP_7_2", 7, 2);
                    DB.insertServiceList("SP_7_3", 7, 3);

                    DB.insertServiceList("SP_8_9", 8, 9);
                    DB.insertServiceList("SP_8_8", 8, 8);
                    DB.insertServiceList("SP_8_7", 8, 7);

                    DB.insertServiceList("SP_9_6", 9, 6);
                    DB.insertServiceList("SP_9_5", 9, 5);
                    DB.insertServiceList("SP_9_4", 9, 4);
                    DB.insertServiceList("SP_9_3", 9, 3);

                    DB.insertServiceList("SP_10_9", 10, 9);
                    DB.insertServiceList("SP_10_8", 10, 8);
                    DB.insertServiceList("SP_10_7", 10, 7);

                    // Insert Appointment Data
                    DB.insertAppointment(1, 1, "", "", "", "11/17/2023 01:00 PM",
                            "123 Main St", "11/15/2023", "", "Pick Up", "Ongoing");

                    DB.insertAppointment(1, 1, "11/20/2023 02:30 PM", "Abbotsford, Surrey, BC, V4G 3G7", "11/19/2023", "11/16/2023 11:00 AM",
                            "123 Main St", "11/15/2023", "", "Drop Off", "Completed");
                    DB.insertAppointment(5, 1, "11/20/2023 02:30 PM", "Abbotsford, Surrey, BC, V4G 3G7", "11/19/2023", "11/16/2023 11:00 AM",
                            "123 Main St", "11/15/2023", "", "Drop Off", "Cancelled");

                    DB.insertAppointment(1, 4, "12/13/2023 03:30 PM", "Granville street, Vancouver, BC, V6H 3K4", "12/11/2023", "12/10/2023 11:00 AM",
                            "Granville street, Vancouver, BC, V6H 3K4", "12/06/2023", "", "Drop Off", "Completed");

                    DB.insertAppointment(1, 4, "12/20/2023 02:30 PM", "Granville street, Vancouver, BC, V6H 3K4", "12/18/2023", "12/17/2023 11:00 AM",
                            "Granville street, Vancouver, BC, V6H 3K4", "12/15/2023", "", "Pick Up", "Completed");

                    DB.insertAppointment(1, 5, "", "", "", "12/17/2023 11:00 AM",
                            "123 Main St", "12/15/2023", "12/18/2023", "Drop Off", "Cancelled");

                    DB.insertAppointment(2, 1, "", "", "", "11/17/2023 01:00 PM",
                            "456 Oak Ave88", "11/11/2023", "", "Pick Up", "Ongoing");

                    DB.insertAppointment(2, 1, "12/20/2023 02:30 PM", "Abbotsford, Surrey, BC, V4G 3G7", "12/19/2023", "12/16/2023 11:00 AM",
                            "456 Oak Ave88", "12/15/2023", "", "Drop Off", "Completed");

                    DB.insertAppointment(2, 4, "12/19/2023 03:30 PM", "Granville street, Vancouver, BC, V6H 3K4", "12/15/2023", "12/10/2023 11:00 AM",
                            "Granville street, Vancouver, BC, V6H 3K4", "12/05/2023", "", "Drop Off", "Completed");

                    DB.insertAppointment(1, 4, "11/25/2023 02:30 PM", "Granville street, Vancouver, BC, V6H 3K4", "11/19/2023", "11/17/2023 11:00 AM",
                            "Granville street, Vancouver, BC, V6H 3K4", "11/15/2023", "", "Pick Up", "Ongoing");

                    DB.insertAppointment(2, 5, "", "", "", "12/17/2023 11:00 AM",
                            "123 Main St", "12/15/2023", "12/20/2023", "Drop Off", "Cancelled");

                    DB.insertAppointment(3, 1, "", "", "", "11/17/2023 01:00 PM",
                            "789 Elm St", "11/11/2023", "", "Pick Up", "Ongoing");

                    DB.insertAppointment(3, 2, "12/20/2023 02:30 PM", "Abbotsford, Surrey, BC, V4G 3G7", "12/19/2023", "12/16/2023 11:00 AM",
                            "789 Elm St", "12/15/2023", "", "Drop Off", "Completed");

                    DB.insertAppointment(3, 4, "11/17/2023 03:30 PM", "Granville street, Vancouver, BC, V6H 3K4", "11/15/2023", "11/05/2023 11:00 AM",
                            "Granville street, Vancouver, BC, V6H 3K4", "11/02/2023", "", "Drop Off", "Completed");

                    DB.insertAppointment(3, 4, "12/03/2023 01:30 PM", "Granville street, Vancouver, BC, V6H 3K4", "12/07/2023", "12/11/2023 11:00 AM",
                            "Granville street, Vancouver, BC, V6H 3K4", "12/08/2023", "", "Pick Up", "Ongoing");
                    DB.insertAppointment(5, 4, "12/10/2023 02:30 PM", "Hornby street, Vancouver, BC, V3E 4S3", "12/13/2023", "12/15/2023 11:30 AM",
                            "Hornby street, Vancouver, BC, V3E 4S3", "12/08/2023", "", "Pick Up", "Ongoing");
                    DB.insertAppointment(6, 4, "12/15/2023 03:30 PM", "W Pender street, Vancouver, BC, V2H 3K4", "12/20/2023", "12/22/2023 03:00 PM",
                            "W Pender street, Vancouver, BC, V2H 3K4", "12/08/2023", "", "Pick Up", "Ongoing");
                    DB.insertAppointment(7, 4, "12/20/2023 04:30 PM", "152nd street, Vancouver, BC, J6H 3K4", "12/25/2023", "12/27/2023 04:00 PM",
                            "152nd street, Vancouver, BC, J6H 3K4", "12/08/2023", "", "Pick Up", "Ongoing");
                    DB.insertAppointment(8, 4, "12/25/2023", "King George Avenue, Vancouver, BC, K6V 3K4", "12/27/2023", "12/30/2023 05:00 PM",
                            "King George Avenue, Vancouver, BC, K6V 3K4", "12/08/2023", "", "Pick Up", "Ongoing");
                    DB.insertAppointment(9, 4, "12/30/2023 06:30 PM", "Granville street, Vancouver, BC, S6H 3K6", "01/05/2024", "12/08/2023 06:00 PM",
                            "Granville street, Vancouver, BC, S6H 3K6", "12/08/2023", "", "Pick Up", "Ongoing");
                    DB.insertAppointment(10, 4, "12/25/2023 05:30 PM", "King George Avenue, Vancouver, BC, K6V 3K4", "12/27/2023", "12/30/2023 05:00 PM",
                            "King George Avenue, Vancouver, BC, K6V 3K4", "12/08/2023", "", "Pick Up", "Cancelled");
                    DB.insertAppointment(3, 4, "12/30/2023 06:30 PM", "Granville street, Vancouver, BC, S6H 3K6", "01/05/2024", "12/08/2023 06:00 PM",
                            "Granville street, Vancouver, BC, S6H 3K6", "12/08/2023", "", "Pick Up", "Cancelled");


                    //Insert Appointment Detail Data
                    DB.insertAppointmentDetail(1, "SP_1_2");
                    DB.insertAppointmentDetail(2, "SP_2_1");
                    DB.insertAppointmentDetail(3, "SP_4_1");
                    DB.insertAppointmentDetail(4, "SP_4_3");
                    DB.insertAppointmentDetail(5, "SP_5_7");

                    DB.insertAppointmentDetail(6, "SP_1_3");
                    DB.insertAppointmentDetail(7, "SP_2_6");
                    DB.insertAppointmentDetail(8, "SP_4_2");
                    DB.insertAppointmentDetail(9, "SP_4_3");
                    DB.insertAppointmentDetail(10, "SP_5_8");

                    DB.insertAppointmentDetail(11, "SP_1_5");
                    DB.insertAppointmentDetail(12, "SP_2_7");
                    DB.insertAppointmentDetail(13, "SP_4_3");
                    DB.insertAppointmentDetail(14, "SP_4_5");
                    DB.insertAppointmentDetail(15, "SP_5_11");

                    DB.insertAppointmentDetail(16, "SP_4_6");
                    DB.insertAppointmentDetail(17, "SP_4_7");
                    DB.insertAppointmentDetail(18, "SP_4_8");
                    DB.insertAppointmentDetail(19, "SP_4_9");

                    Toast.makeText(home.this, "Insert Successfully", Toast.LENGTH_LONG).show();
                    startActivity(new Intent(home.this, LogIn.class));
                }
                else
                    startActivity(new Intent(home.this, LogIn.class));
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this,About.class));
            }
        });
    }



}