import java.util.Map;
import java.util.HashMap;
import java.util.Set;

import java.util.Collection;

public class HashMapDemo {

  public static void main(String[] args) {

    Map<String, Double> hashMap = new HashMap<>();

    hashMap.put("AAPL", 160.2);
    hashMap.put("RKT", 12.60);
    hashMap.put("CRM", 202.3);
    hashMap.putIfAbsent("RKT", 400.0); // Insert if not exist already
    hashMap.putIfAbsent("GOOG", 2756.50);

    System.out.println("Stock Prices Are" + hashMap);
    System.out.println("The stock value of rocket mortgage is " + hashMap.get("RKT")); // Get value by keyname
    System.out.println("The stock value of company is " + hashMap.getOrDefault("GOOG1", 3000.0)); // Get value if key
                                                                                                  // exist if not
                                                                                                  // default value
    System.out.println("Replacing a RKT key " + hashMap.replace("RKT", 500.0));
    System.out.println("Replacing a RKT key " + hashMap.replace("RKT", 500.0, 600.0));
    System.out.println("HashMap after the replacement " + hashMap);

    hashMap.replaceAll((k, v) -> v + 10); // This is a BiFunction as input and replaces the values of all the keys with
                                          // the result of the give function.
    System.out.println("After add 10 to all the stocks" + hashMap);

    hashMap.remove("RKT");
    System.out.println("After removing RKT stock " + hashMap);

    if (hashMap.containsKey("GOOG")) {
      System.out.println("Remove Google stock if exists");
    }

    if (hashMap.containsValue(212.30)) {
      System.out.println("There is a stock with the value 212.30");
    }

    Set<String> keys = hashMap.keySet();

    for (String string : keys) {
      System.out.println("Printing all the key names " + string);
    }

    Collection<Double> collection = hashMap.values();
    for (Double value : collection) {
      System.out.println("Printing all the stock values " + value);
    }

    /*
     * The compute(key, BiFunction) allows us to update a value in HashMap.
     * compute(k key, BiFunction<? super K, ? super V, ? extends V>
     * remappingFunction)
     */

    hashMap.compute("CRM1", (k, v) -> v == null ? 10 : v + 1); // if key not exist then inserts with a value
    hashMap.compute("CRM", (k, v) -> v == null ? 10 : v + 1);
    hashMap.compute("GOOG", (k, v) -> v = v + 100);
    hashMap.computeIfAbsent("VOO", v -> 345.9);
    hashMap.computeIfPresent("SPY", (k, v) -> v = 100.0);
    System.out.println("Hashmap after the compute " + hashMap);

    /* merge merge(K key, V value, remappingFunction) */

    Map<String, Double> futureStock = new HashMap<>();
    futureStock.put("GOOG", 8000.0);
    futureStock.put("CRM", 5000.0);
    futureStock.put("VOO", 2300.0);

    futureStock.forEach((key, value) -> hashMap.merge(key, value, (v1, v2) -> v1 + v2));
    futureStock.forEach((key, value) -> System.out.println(key + value.toString()));

    System.out.println("After Merge hashMap " + hashMap);
    System.out.println("After Merge futureStock" + futureStock);

    hashMap.clear();

    if (hashMap.isEmpty()) {
      System.out.println("Hash map is empty");
    }

  }

}
