class Ex2_01_1_Refree {

    //フィールド
    String name;

    //コンストラクタ引数なし



    //コンストラクタ引数あり
    Ex2_01_1_Refree(String nm){
        this.name = nm;
    }


    //ゲーム開始号令メソッド
    void gameStartCall(String nm){
        System.out.println("審判"+ nm +":ジャンケン・・・ポン！");
    }

    void showHandStatus(String nm1, String hs1,String nm2, String hs2 ){
        System.out.println(nm1+"さんの手は"+ hs1 );
        System.out.println(nm2+"さんの手は"+ hs2 );
    }

    



}