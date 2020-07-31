package com.bongo.test;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.widget.MediaController;
import android.widget.VideoView;

import com.bongo.test.anagram.AnagramDetection;
import com.bongo.test.designPatterns.Vehicle;
import com.bongo.test.designPatterns.factoryPattern.Car;
import com.bongo.test.designPatterns.factoryPattern.VehicleFactory;
import com.bongo.test.designPatterns.singletonPattern.CarSingleton;
import com.bongo.test.designPatterns.singletonPattern.PlaneSingleton;

import static com.bongo.test.utils.Constants.BLEAT;
import static com.bongo.test.utils.Constants.CAR;
import static com.bongo.test.utils.Constants.PLANE;
import static com.bongo.test.utils.Constants.TABLE;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // TODO: 7/26/2020 AnagramDetection
        AnagramDetection detection=new AnagramDetection();
        if (detection.isAnagram(BLEAT,BLEAT)) {
            Log.d(TAG, "isAnagram: " + BLEAT + " and " + BLEAT + " are anagrams");
        }else {
            Log.d(TAG, "isAnagram: " + BLEAT + " and " + BLEAT + " are not anagrams");
        }
    }

    // TODO: 7/31/2020 Factory pattern: The idea behind the factory pattern
    //  is to let you dynamically instantiate objects
    //  whose types you don't necessarily know about at design time.
    VehicleFactory vehicleFactory =new VehicleFactory();
    Vehicle vehicleCar = vehicleFactory.getVehicle(CAR);
    Vehicle vehiclePlan = vehicleFactory.getVehicle(PLANE);
    // TODO: 7/31/2020 SingleTone pattern:  Class is defined in such a way that
    //  only one instance of the class is created in the complete execution of a program or project.
        int getNumberOfWheelsForCar= CarSingleton.getInstance().set_num_of_wheels();
        int getGetNumberOfWheelsForPlane= PlaneSingleton.getInstance().set_num_of_wheels();
}
