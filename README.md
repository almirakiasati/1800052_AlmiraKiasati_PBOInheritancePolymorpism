# 1800052_AlmiraKiasati_PBOInheritancePolymorpism
tugas PBO Inheritance dan Polymorpism

class NPC extends Item
class Pintu extends Item

class item
  public void getMenu(int urutPil){
        int subPil = 0;   //sistem penomorannya 11  12  13 dst
        System.out.println(getNama());
        //ambil pilihannya
        ArrayList <String> arrPil = getAksi();
        //print pilihan
        for (String strPil:arrPil) {
            subPil++;
            System.out.printf("%d%d. %s %n", urutPil, subPil, strPil);
        }
    }
  
  class NPC
  
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
  
  CLASS PINTU
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

