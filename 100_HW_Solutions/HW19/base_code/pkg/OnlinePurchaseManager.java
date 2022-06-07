package pkg;
import java.util.ArrayList;

public class OnlinePurchaseManager
{
   
   private ArrayList<Gizmo> purchases;
   
   public Gizmo getCheapestGizmoByMaker( String mkr )
   {
      Gizmo e = new Gizmo(mkr,true,0.0);
      int lowest = 99999999;
      for(int c = 0;c<purchases.size();c++) {
         if(purchases.get(c).getMaker()==mkr&&purchases.get(c).getCost()<lowest) {
            e = purchases.get(c);
         }
      }
      return e;
   }
   
   public int countElectronicsByMaker(String mkr) {
      int co = 0;
      for(int c = 0;c<purchases.size();c++) {
         if((purchases.get(c).getMaker())==mkr&&((purchases.get(c)).isElectronic())) {
            co++;
         }
      }
      return co;
   }
   
   public boolean hasAdjacentEqualPair() {
      for(int c=0;c<purchases.size()-1;c++) {
         if(purchases.get(c)==purchases.get(c+1)) {
            return true;
         }
      }
      return false;
   }
   
   public void add(String maker, boolean isE, double cost) {
      Gizmo g = new Gizmo(maker,isE,cost);
      purchases.add(g);
   }
   
   public String toString()
   {
   	return "" + purchases;
   }
}
