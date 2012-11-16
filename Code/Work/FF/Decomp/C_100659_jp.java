import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class C_100659_jp implements Map {

   private final Map field_109033_a = new LinkedHashMap();


   public int size() {
      return this.field_109033_a.size();
   }

   public boolean isEmpty() {
      return this.field_109033_a.isEmpty();
   }

   public boolean containsKey(Object var1) {
      return this.field_109033_a.containsKey(var1.toString().toLowerCase());
   }

   public boolean containsValue(Object var1) {
      return this.field_109033_a.containsKey(var1);
   }

   public Object get(Object var1) {
      return this.field_109033_a.get(var1.toString().toLowerCase());
   }

   public Object func_109032_a(String var1, Object var2) {
      return this.field_109033_a.put(var1.toLowerCase(), var2);
   }

   public Object remove(Object var1) {
      return this.field_109033_a.remove(var1.toString().toLowerCase());
   }

   public void putAll(Map var1) {
      Iterator var2 = var1.entrySet().iterator();

      while(var2.hasNext()) {
         Entry var3 = (Entry)var2.next();
         this.func_109032_a((String)var3.getKey(), var3.getValue());
      }

   }

   public void clear() {
      this.field_109033_a.clear();
   }

   public Set keySet() {
      return this.field_109033_a.keySet();
   }

   public Collection values() {
      return this.field_109033_a.values();
   }

   public Set entrySet() {
      return this.field_109033_a.entrySet();
   }

   // $FF: synthetic method
   public Object put(Object var1, Object var2) {
      return this.func_109032_a((String)var1, var2);
   }
}
