import java.util.Random;
import java.util.logging.Logger;
import java.util.logging.Level;

class Ex2_01_1_Player {
    
    //フィールド
    String name ; //プレイヤー名
    String handStatus ; //ジャンケンの手

    //コンストラクタ引数なし

    Ex2_01_1_Player(){

    }
    //コンストラクタ引数あり
    Ex2_01_1_Player(String nm){
        this.name = nm;
    }

    //makeHandStatusメソッド
	void makeHandStatus(){
        // ログレベルを ALL に設定（デバッグログを表示するため）
        String[] hands = {"グー", "チョキ", "パー"};
        Random random = new Random();
        int index = random.nextInt(hands.length);
		handStatus = hands[index];
		//System.out.println(name+"のジャンケン："+ handStatus);
        //logger.info("[debug]引数2の手："+handStatus);
	}
}
