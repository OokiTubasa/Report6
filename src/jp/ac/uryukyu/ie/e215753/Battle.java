package jp.ac.uryukyu.ie.e215753;
import java.util.*;

public class Battle {
    int playerPoint;
    int enemyPoint;
    int[] playerCard = new int[50]; 
    int[] enemyCard = new int[50];
    int p_math;
    int e_math;



    void preparation(){
        Random random = new Random();

        for (int i = 0; i<2; i++){
            enemyCard[i] = random.nextInt(11) ;
            e_math += 1;
            enemyPoint += enemyCard[i];
        }
        for(int k = 0; k<2; k++){
            playerCard[k] = random.nextInt(11);
            p_math += 1;
            playerPoint += playerCard[k];
        }
        System.out.println("あなたの最初の点数は"+ playerPoint);
        System.out.println("ディーラーの最初の点数は"+ enemyPoint);
    }

    void play(){
        Random random = new Random();

        System.out.println("あなた"+p_math+"枚　　　合計点＿"+playerPoint);
        System.out.println("ディーラー"+e_math+"枚　合計点＿"+enemyPoint);

        for (int k = 2 ; playerPoint < 22; k++){
            System.out.println("Hit？ or Stand？");
            String judge = new Scanner(System.in).nextLine();

            if (judge.equals("Hit")) {
                playerCard[k] = random.nextInt(11);
                p_math += 1;
                playerPoint += playerCard[k];
                System.out.println("あなた"+p_math+"枚　　　合計点＿"+playerPoint);
                System.out.println("ディーラー"+e_math+"枚　合計点＿"+enemyPoint);
                if(playerPoint > 22){
                    System.out.println("バーストしました。あなたの負け！");
                }
            }
            
            if (judge.equals("Stand")) {
                System.out.println("あなた"+p_math+"枚　　　合計点＿"+playerPoint);
                for (int i = 1; enemyPoint < 17; i++) {
                    enemyCard[i] = random.nextInt(11) ;
                    e_math += 1;
                    enemyPoint += enemyCard[i];
                    System.out.println("ディーラー"+e_math+"枚　合計点＿"+enemyPoint);
                }
            }
        }

    }
}
