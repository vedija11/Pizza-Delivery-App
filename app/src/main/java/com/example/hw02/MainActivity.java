//
// Assignment : HomeworkAssignment02
// File Name : Group09_HW02
// Group Member Name : Neeraj Vilas Auti
//                     Vedija Jagtap
//
//

package com.example.hw02;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.gridlayout.widget.GridLayout;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.icu.text.Transliterator;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    CheckBox cb_delivery;
    Button button_add;
    Button button_clear;
    Button button_checkout;
    ProgressBar progressBar;
    String[] toppingsList = {"Bacon", "Cheese", "Garlic", "Green Pepper", "Mushroom", "Olives", "Onions", "Red Pepper"};
    ArrayList<String> selectedToppings = new ArrayList<>();
    boolean isChecked = false;
    androidx.gridlayout.widget.GridLayout ImageLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Pizza Store");

        cb_delivery = findViewById(R.id.cb_delivery);
        button_add = findViewById(R.id.button_add);
        button_clear = findViewById(R.id.button_clear);
        button_checkout = findViewById(R.id.button_checkout);
        progressBar = findViewById(R.id.progressBar);
        ImageLayout = findViewById(R.id.ImageLayout);

        button_clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Clear();
            }
        });
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                builder.setTitle("Choose a Topping");

                builder.setItems(toppingsList, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int topping) {
                        if (selectedToppings.size() < 10) {
                            final ImageView img = new ImageView(getApplicationContext());
                            switch (topping) {
                                case 0:
                                    selectedToppings.add("Bacon");
                                    progressBar.incrementProgressBy(10);
                                    img.setImageDrawable(getDrawable(R.drawable.bacon));
                                    img.setLayoutParams(new GridLayout.LayoutParams());
                                    img.getLayoutParams().height = 150;
                                    img.getLayoutParams().width = 150;
                                    img.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            ImageLayout.removeView(img);
                                            selectedToppings.remove("Bacon");
                                            progressBar.incrementProgressBy(-10);
                                        }
                                    });
                                    ImageLayout.addView(img);
                                    break;
                                case 1:
                                    selectedToppings.add("Cheese");
                                    progressBar.incrementProgressBy(10);
                                    img.setImageDrawable(getDrawable(R.drawable.cheese));
                                    img.setLayoutParams(new GridLayout.LayoutParams());
                                    img.getLayoutParams().height = 150;
                                    img.getLayoutParams().width = 150;
                                    img.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            ImageLayout.removeView(img);
                                            selectedToppings.remove("Cheese");
                                            progressBar.incrementProgressBy(-10);
                                        }
                                    });
                                    ImageLayout.addView(img);
                                    break;
                                case 2:
                                    selectedToppings.add("Garlic");
                                    progressBar.incrementProgressBy(10);
                                    img.setImageDrawable(getDrawable(R.drawable.garlic));
                                    img.setLayoutParams(new GridLayout.LayoutParams());
                                    img.getLayoutParams().height = 150;
                                    img.getLayoutParams().width = 150;
                                    img.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            ImageLayout.removeView(img);
                                            selectedToppings.remove("Garlic");
                                            progressBar.incrementProgressBy(-10);
                                        }
                                    });
                                    ImageLayout.addView(img);
                                    break;
                                case 3:
                                    selectedToppings.add("Green Pepper");
                                    progressBar.incrementProgressBy(10);
                                    img.setImageDrawable(getDrawable(R.drawable.green_pepper));
                                    img.setLayoutParams(new GridLayout.LayoutParams());
                                    img.getLayoutParams().height = 150;
                                    img.getLayoutParams().width = 150;
                                    img.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            ImageLayout.removeView(img);
                                            selectedToppings.remove("Green Pepper");
                                            progressBar.incrementProgressBy(-10);
                                        }
                                    });
                                    ImageLayout.addView(img);
                                    break;
                                case 4:
                                    selectedToppings.add("Mushroom");
                                    progressBar.incrementProgressBy(10);
                                    img.setImageDrawable(getDrawable(R.drawable.mashroom));
                                    img.setLayoutParams(new GridLayout.LayoutParams());
                                    img.getLayoutParams().height = 150;
                                    img.getLayoutParams().width = 150;
                                    img.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            ImageLayout.removeView(img);
                                            selectedToppings.remove("Mushroom");
                                            progressBar.incrementProgressBy(-10);
                                        }
                                    });
                                    ImageLayout.addView(img);
                                    break;
                                case 5:
                                    selectedToppings.add("Olives");
                                    progressBar.incrementProgressBy(10);
                                    img.setImageDrawable(getDrawable(R.drawable.olive));
                                    img.setLayoutParams(new GridLayout.LayoutParams());
                                    img.getLayoutParams().height = 150;
                                    img.getLayoutParams().width = 150;
                                    img.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            ImageLayout.removeView(img);
                                            selectedToppings.remove("Olives");
                                            progressBar.incrementProgressBy(-10);
                                        }
                                    });
                                    ImageLayout.addView(img);
                                    break;
                                case 6:
                                    selectedToppings.add("Onions");
                                    progressBar.incrementProgressBy(10);
                                    img.setImageDrawable(getDrawable(R.drawable.onion));
                                    img.setLayoutParams(new GridLayout.LayoutParams());
                                    img.getLayoutParams().height = 150;
                                    img.getLayoutParams().width = 150;
                                    img.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            ImageLayout.removeView(img);
                                            selectedToppings.remove("Onions");
                                            progressBar.incrementProgressBy(-10);
                                        }
                                    });
                                    ImageLayout.addView(img);
                                    break;
                                case 7:
                                    selectedToppings.add("Red Pepper");
                                    progressBar.incrementProgressBy(10);
                                    img.setImageDrawable(getDrawable(R.drawable.red_pepper));
                                    img.setLayoutParams(new GridLayout.LayoutParams());
                                    img.getLayoutParams().height = 150;
                                    img.getLayoutParams().width = 150;
                                    img.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View view) {
                                            ImageLayout.removeView(img);
                                            selectedToppings.remove("Red Pepper");
                                            progressBar.incrementProgressBy(-10);
                                        }
                                    });
                                    ImageLayout.addView(img);
                                    break;
                                default:
                                    break;
                            }
                        } else {
                            Toast.makeText(getApplicationContext(), "Maximum Topping capacity reached!!", Toast.LENGTH_SHORT).show();
                            Log.d("Maximum capacity", selectedToppings.toString());
                        }
                    }
                });
                AlertDialog dialog = builder.create();
                dialog.show();
                Log.d("alert", selectedToppings.toString());
            }
        });

        button_checkout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent displayOrder = new Intent(MainActivity.this, OrderActivity.class);
                isChecked = cb_delivery.isChecked();
                displayOrder.putExtra("TotalToppings", selectedToppings.size());
                displayOrder.putExtra("Toppings", selectedToppings);
                displayOrder.putExtra("Delivery", isChecked);
                startActivity(displayOrder);
                finish();
            }
        });

    }

    public void Clear() {
        try {
            selectedToppings.clear();
            isChecked = false;
            ImageLayout.removeAllViews();
            progressBar.setProgress(0);
        }
        catch (Exception e)
        {

        }
    }
}