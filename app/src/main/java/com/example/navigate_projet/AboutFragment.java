package com.example.navigate_projet;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.ImageView;


import org.jetbrains.annotations.NotNull;


public class AboutFragment extends Fragment {

    private ImageView mainImage;
    private ImageView image1, image2, image3, image4, image5, image6, image7;
    private Button buttonP, buttonN;
    private TextView mainText;
    private int currentImg = 1;

    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_about, container, false);

        // Find views by id
        mainImage = rootView.findViewById(R.id.main_image);
        image1 = rootView.findViewById(R.id.image1);
        image2 = rootView.findViewById(R.id.image2);
        image3 = rootView.findViewById(R.id.image3);
        image4 = rootView.findViewById(R.id.image4);
        image5 = rootView.findViewById(R.id.image5);
        image6 = rootView.findViewById(R.id.image6);
        image7 = rootView.findViewById(R.id.image7);
        buttonP = rootView.findViewById(R.id.buttonP);
        buttonN = rootView.findViewById(R.id.buttonN);
        mainText = rootView.findViewById(R.id.main_country);

        // Set click listeners on images
        image1.setOnClickListener(v -> {
            mainImage.setImageResource(R.drawable.photo1);
            mainText.setText("Image1");
            currentImg=1;
        });

        image2.setOnClickListener(v -> {
            mainImage.setImageResource(R.drawable.photo2);
            mainText.setText("Image2");
            currentImg=2;
        });

        image3.setOnClickListener(v -> {
            mainImage.setImageResource(R.drawable.photo3);
            mainText.setText("Image3");
            currentImg=3;
        });

        image4.setOnClickListener(v -> {
            mainImage.setImageResource(R.drawable.photo4);
            mainText.setText("Image4");
            currentImg=4;
        });

        image5.setOnClickListener(v -> {
            mainImage.setImageResource(R.drawable.photo5);
            mainText.setText("Image5");
            currentImg=5;
        });

        image6.setOnClickListener(v -> {
            mainImage.setImageResource(R.drawable.photo6);
            mainText.setText("Image6");
            currentImg=6;
        });

        image7.setOnClickListener(v -> {
            mainImage.setImageResource(R.drawable.photo7);
            mainText.setText("Image7");
            currentImg=7;
        });

        // Set click listeners on buttons
        buttonP.setOnClickListener(v -> {
            currentImg--;
            if (currentImg < 1) {
                currentImg = 7;
            }
            switch (currentImg) {
                case 1:
                    mainImage.setImageResource(R.drawable.photo1);
                    mainText.setText("Image1");
                    break;
                case 2:
                    mainImage.setImageResource(R.drawable.photo2);
                    mainText.setText("Image2");
                    break;
                case 3:
                    mainImage.setImageResource(R.drawable.photo3);
                    mainText.setText("Image3");
                    break;
                case 4:
                    mainImage.setImageResource(R.drawable.photo4);
                    mainText.setText("Image4");
                    break;
                case 5:
                    mainImage.setImageResource(R.drawable.photo5);
                    mainText.setText("Image5");
                    break;
                case 6:
                    mainImage.setImageResource(R.drawable.photo6);
                    mainText.setText("Image6");
                    break;
                case 7:
                    mainImage.setImageResource(R.drawable.photo7);
                    mainText.setText("Image7");
                    break;
            }
        });

        buttonN.setOnClickListener(v -> {
            currentImg++;
            if (currentImg > 7) {
                currentImg = 1;
            }
            switch (currentImg) {
                case 1:
                    mainImage.setImageResource(R.drawable.photo1);
                    mainText.setText("Image1");
                    break;
                case 2:
                    mainImage.setImageResource(R.drawable.photo2);
                    mainText.setText("Image2");
                    break;
                case 3:
                    mainImage.setImageResource(R.drawable.photo3);
                    mainText.setText("Image3");
                    break;
                case 4:
                    mainImage.setImageResource(R.drawable.photo4);
                    mainText.setText("Image4");
                    break;
                case 5:
                    mainImage.setImageResource(R.drawable.photo5);
                    mainText.setText("Image5");
                    break;
                case 6:
                    mainImage.setImageResource(R.drawable.photo6);
                    mainText.setText("Image6");
                    break;
                case 7:
                    mainImage.setImageResource(R.drawable.photo7);
                    mainText.setText("Image7");
                    break;
            }
        });

        return rootView;
    }
}