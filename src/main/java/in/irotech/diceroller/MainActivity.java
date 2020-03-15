package in.irotech.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button button;
    private Random random1=new Random();
    private Random random2=new Random();
    private ImageView img1;
    private ImageView img2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        img1=findViewById(R.id.imageView3);
        img2=findViewById(R.id.imageView4);
        button=findViewById(R.id.rollUpBtn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int ran1=random1.nextInt(6)+1;
                int ran2=random2.nextInt(6)+1;
                switch (ran1){
                    case 1:
                        img1.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        img1.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        img1.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        img1.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        img1.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        img1.setImageResource(R.drawable.dice6);
                        break;
                }

                switch (ran2){
                    case 1:
                        img2.setImageResource(R.drawable.dice1);
                        break;
                    case 2:
                        img2.setImageResource(R.drawable.dice2);
                        break;
                    case 3:
                        img2.setImageResource(R.drawable.dice3);
                        break;
                    case 4:
                        img2.setImageResource(R.drawable.dice4);
                        break;
                    case 5:
                        img2.setImageResource(R.drawable.dice5);
                        break;
                    case 6:
                        img2.setImageResource(R.drawable.dice6);
                        break;
                }
            }
        });

    }


}
