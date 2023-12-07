package com.example.carserviceandroidapp.adapter;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.carserviceandroidapp.R;

public class Customer_ServiceHistory_ViewHolder extends RecyclerView.ViewHolder {

    TextView tvhistappointmentIDLabel,tvhistappointmentIDInt, tvhistbookedServiceProviderName,
            tvhistserviceAvailed, tvhistbookedServiceProviderAddress, tvhistbookingStatus,
            tvhistdropofflabel, tvhistdropoffAppointmentDate, tvhistcustomDropOffTime,
            tvhistpickuplabel, tvhistpickupAppointmentDate, tvhistcustomPickupTime, tvhistcustomAppointmentType;

    public Customer_ServiceHistory_ViewHolder(@NonNull View itemView) {
        super(itemView);
        tvhistappointmentIDLabel= itemView.findViewById(R.id.histappointmentIDLabel);
        tvhistappointmentIDInt = itemView.findViewById(R.id.histappointmentIDInt);
        tvhistbookedServiceProviderName= itemView.findViewById(R.id.histbookedServiceProviderName);
        tvhistserviceAvailed=itemView.findViewById(R.id.histserviceAvailed);
        tvhistbookedServiceProviderAddress=itemView.findViewById(R.id.histbookedServiceProviderAddress);
        tvhistbookingStatus = itemView.findViewById(R.id.histbookingStatus);
        tvhistdropofflabel = itemView.findViewById(R.id.histdropofflabel);
        tvhistdropoffAppointmentDate = itemView.findViewById(R.id.histdropoffAppointmentDate);
        tvhistpickuplabel = itemView.findViewById(R.id.histpickuplabel);
        tvhistpickupAppointmentDate = itemView.findViewById(R.id.histpickupAppointmentDate);
        tvhistcustomAppointmentType = itemView.findViewById(R.id.histserviceAppointType);
    }
}
