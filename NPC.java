/*
Nama    : Almira Kiasati Solehuddin
NIM     : 1800052
 */

import java.util.ArrayList;

public class NPC extends Item{
    //kunci dipindahkan dari ruangan
    private Item  objKunci;
    private ArrayList<String> arrAksi = new ArrayList<>();
    private GameInfo objGameInfo;
    private boolean isKenal = false;

    public NPC() {
        //init kunci
        objKunci = new Item("Kunci");
        objKunci.setDeskripsi("Sebuah kunci kecil yang sudah agak berkarat");

        //aksi npc
        arrAksi.add("Perkenalan dgn NPC");
        arrAksi.add("Minta kunci");

    }

    public void getMenu(int urutPil){
        int subPil = 0;   //sistem penomorannya 11  12  13 dst
        System.out.println("NPC");
        //ambil pilihannya
        ArrayList <String> arrPil = getAksi();
        //print pilihan
        for (String strPil:arrPil) {
            subPil++;
            System.out.printf("%d%d. %s %n", urutPil, subPil, strPil);
        }
    }

    public void prosesAksi(int subPil) {
        //1: perkenalan dengan npc
        //2: buka pintu
        if (subPil == 1) {
            System.out.println("Halo saya penjaga pintu ini");
            isKenal = true;
        } else if (subPil == 2) {
            if (isKenal) {
                //berikan kunci pada player
                if (objKunci==null) {
                    System.out.println("Masa lupa, kunci kan sudah saya berikan!");
                } else
                {
                    System.out.println("Kunci diberikan pada player");
                    objGameInfo.getObjPlayer().addItem(objKunci);     //tambahkan  objek ini pada player
                    objKunci = null;
                }

            } else {
                System.out.println("Siapa anda? kenalan dulu dong");
            }
        }
    }

    public void setObjGameInfo(GameInfo objGameInfo) {
        this.objGameInfo = objGameInfo;
        objKunci.setObjGameInfo(objGameInfo);
    }

    public ArrayList<String> getAksi() {
        return arrAksi;
    }
}
