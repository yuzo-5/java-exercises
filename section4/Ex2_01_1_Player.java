import java.util.Random;

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
        String[] hands = {"グー", "チョキ", "パー"};
        Random random = new Random();
        int index = random.nextInt(hands.length);
		handStatus = hands[index];
		System.out.println(name+"のジャンケン："+ handStatus);
	}
}
