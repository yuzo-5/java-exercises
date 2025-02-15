import java.util.logging.Logger;
import java.util.logging.Level;

class Ex2_01_1_Janken {

    private static final Logger logger = Logger.getLogger(Ex2_01_1_Janken.class.getName());
    public static void main (String[] args) {
        Ex2_01_1_Player player1 = new Ex2_01_1_Player(args[0]);
        Ex2_01_1_Player player2 = new Ex2_01_1_Player(args[1]);
        Ex2_01_1_Refree r3 = new Ex2_01_1_Refree(args[2]);
        
        r3.gameStartCall(args[2]);
        player1.makeHandStatus();
        player2.makeHandStatus();

        //審判によるプレイヤーのhandstatusを表示
        r3.showHandStatus(player1.name, player1.handStatus, player2.name,player2.handStatus);

        //結果の判定
        System.out.println("結果は・・・"); 

        logger.info("[debug]引数１の手："+player1.handStatus);
        logger.info("[debug]引数2の手："+player2.handStatus);

        if(player1.handStatus.equals(player2.handStatus)){
            System.out.println("引き分け");
        }else if (player1.handStatus.equals("グー") && player2.handStatus.equals("チョキ") ||
        player1.handStatus.equals("チョキ") && player2.handStatus.equals("パー") ||
        player1.handStatus.equals("パー") && player2.handStatus.equals("グー")){
            System.out.println(player1.name+"の勝ちです");
        }else{
            System.out.println(player2.name+"の勝ちです");
        }

    }
}
