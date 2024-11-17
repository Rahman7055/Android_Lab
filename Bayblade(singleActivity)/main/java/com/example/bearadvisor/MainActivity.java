package com.example.bearadvisor;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onClickFindBeer(View view){
        TextView descript =  findViewById(R.id.description);
        Spinner item =  findViewById(R.id.item);
        String selectedItem = String.valueOf(item.getSelectedItem());
        String description="";
        switch (selectedItem) {
            case "Pegasus":
                description = "Selected item: Pegasus\n\n" +
                        "Owner Name: Gyinga\n\n" +
                        "In Beyblade: Metal Fusion, Pegasus is the signature Beyblade of the protagonist, Gingka Hagane. Its origin is tied to the Legendary Bladers, as it represents the power of the Pegasus constellation. The Beyblade is known for its exceptional attack power and high-speed capabilities. Pegasus specializes in overwhelming its opponents with rapid, forceful strikes and dynamic movements, often creating a tornado-like effect with its spinning motion. Its ultimate ability, Starblast Attack and later Galaxy Nova (in its evolved forms), showcases its immense energy and strength in battle.";
                break;
            case "L-Drago":
                description = "Selected item: L-Drago\n\n" +
                        "Owner Name: Rayuga\n\n" +
                        "In Beyblade: Metal Fusion, L-Drago is the antagonist Beyblade wielded by Ryuga. It is a left-spinning Beyblade, representing the dragon constellation, and is infused with dark power. Its origin is tied to the ancient Forbidden Beys, known for their destructive abilities and thirst for power. L-Drago has the ability to absorb energy from its opponent during battle, making it stronger as the fight progresses. Its signature moves, such as Dragon Emperor Soaring Bite Strike, unleash devastating attacks, showcasing its immense strength and relentless aggression.";
                break;
            case "Lybra":
                description = "Selected item: Lybra\n\n" +
                        "Owner Name: Yuu\n\n" +
                        "In Beyblade: Metal Fusion, Libra is owned by Yu Tendo and represents the Libra constellation. Known for its balance and stamina, Libra excels in maintaining long spin durations while resisting opposing attacks. Its abilities stem from its unique Energy Ring and Spin Track, which provide exceptional stability and defensive capabilities. Libra’s signature move, Sonic Buster, unleashes powerful sound waves to destabilize opponents, making it a formidable Beyblade in battle.";
                break;
            case "Sageterio":
                description = "Selected item: Sageterio\n\n" +
                        "Owner Name: Kenta\n\n" +
                        "In Beyblade: Metal Fusion, Sagittario is the Beyblade of the character, Masamune Kadoya. It represents the Sagittarius constellation and is known for its agility and attack power. Sagittario’s origin is linked to the ancient power of the constellations, and it is often depicted as a powerful archer in battle. Its unique ability is its high-speed movement and precision, allowing it to launch rapid and direct attacks on opponents. Sagittario’s signature move, Sagittario's Star Blast Attack, is a powerful strike that demonstrates its excellent offensive capabilities.";
                break;
            case "Gravity Destroyer":
                description = "Selected item: Gravity Destroyer\n\n" +
                        "Owner Name: Julian\n\n" +
                        "In Beyblade: Metal Fusion, Gravity Destroyer is the Beyblade of the antagonist, Doji, and later used by the protagonist, Gingka Hagane, in Beyblade: Metal Masters. It represents the force of gravity, and its origin is tied to the concept of gravitational power. Gravity Destroyer’s unique ability lies in its right-left spinning capabilities, allowing it to switch between both directions, providing an advantage in battle by countering opponents’ spin. Its signature move, Gravity Impact, uses the Beyblade's gravity-defying power to execute heavy, destabilizing attacks, making it a versatile and strong adversary in battles.";
                break;
        }
        descript.setText(description);
    }
}
