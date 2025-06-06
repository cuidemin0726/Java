package test.instance;

import test.manytype.Computer;
import test.manytype.LZCom;
import test.manytype.SamsongCom;

public class CampareInstance {

    public static void getMyType(Computer com){

        if(com instanceof SamsongCom){
            System.out.println("삼송 컴퓨터!");
        }else if (com instanceof LZCom){
            System.out.println("LZ 컴퓨터!");
        }else {
            System.out.println("넌 누구니?");
        }
    }
    public static void main(String[] args){
         SamsongCom sam = new SamsongCom();
         LZCom lz = new LZCom();

         CampareInstance.getMyType(sam);
         CampareInstance.getMyType(lz);
    }
}
