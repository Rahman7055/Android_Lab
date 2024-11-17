package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickFindBeer(View view) {
        Spinner item = findViewById(R.id.item);
        String selectedItem = String.valueOf(item.getSelectedItem());
        String description = "";
        switch (selectedItem) {
            case "Pegasus":
                description = "Selected item: Pegasus\n\nOwner Name: Gynga Hagane\n\nIn Beyblade: Metal Fusion, Pegasus is the signature Beyblade of the protagonist, Gingka Hagane. Its origin is tied to the Legendary Bladers, as it represents the power of the Pegasus constellation. The Beyblade is known for its exceptional attack power and high-speed capabilities. Pegasus specializes in overwhelming its opponents with rapid, forceful strikes and dynamic movements, often creating a tornado-like effect with its spinning motion. Its ultimate ability, Starblast Attack and later Galaxy Nova (in its evolved forms), showcases its immense energy and strength in battle.";
                break;
            case "L-Drago":
                description = "Selected item: L-Drago\n\nOwner Name: Rayuga\n\nIn Beyblade: Metal Fusion, L-Drago is the antagonist Beyblade wielded by Ryuga. It is a left-spinning Beyblade, representing the dragon constellation, and is infused with dark power. Its origin is tied to the ancient Forbidden Beys, known for their destructive abilities and thirst for power. L-Drago has the ability to absorb energy from its opponent during battle, making it stronger as the fight progresses. Its signature moves, such as Dragon Emperor Soaring Bite Strike, unleash devastating attacks, showcasing its immense strength and relentless aggression.";
                break;
            case "Lybra":
                description = "Selected item: Lybra\n\nOwner Name: Yuu\n\nIn Beyblade: Metal Fusion, Libra is owned by Yu Tendo and represents the Libra constellation. Known for its balance and stamina, Libra excels in maintaining long spin durations while resisting opposing attacks. Its abilities stem from its unique Energy Ring and Spin Track, which provide exceptional stability and defensive capabilities. Libra’s signature move, Sonic Buster, unleashes powerful sound waves to destabilize opponents, making it a formidable Beyblade in battle.";
                break;
            case "Sageterio":
                description = "Selected item: Sageterio\n\nOwner Name: Kenta Yumia\n\nIn Beyblade: Metal Fusion, Sagittario is the Beyblade of the character, Masamune Kadoya. It represents the Sagittarius constellation and is known for its agility and attack power. Sagittario’s origin is linked to the ancient power of the constellations, and it is often depicted as a powerful archer in battle. Its unique ability is its high-speed movement and precision, allowing it to launch rapid and direct attacks on opponents. Sagittario’s signature move, Sagittario's Star Blast Attack, is a powerful strike that demonstrates its excellent offensive capabilities.";
                break;
            case "Gravity Destroyer":
                description = "Selected item: Gravity Destroyer\n\nOwner Name: Julian Konzern\n\nIn Beyblade: Metal Fusion, Gravity Destroyer is the Beyblade of the antagonist, Doji, and later used by the protagonist, Gingka Hagane, in Beyblade: Metal Masters. It represents the force of gravity, and its origin is tied to the concept of gravitational power. Gravity Destroyer’s unique ability lies in its right-left spinning capabilities, allowing it to switch between both directions, providing an advantage in battle by countering opponents’ spin. Its signature move, Gravity Impact, uses the Beyblade's gravity-defying power to execute heavy, destabilizing attacks, making it a versatile and strong adversary in battles.";
                break;
        }
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(SecondActivity.EXTRA_MESSAGE, description);
        startActivity(intent);
    }
}
