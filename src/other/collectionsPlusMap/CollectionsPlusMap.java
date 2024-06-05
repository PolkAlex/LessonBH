package other.collectionsPlusMap;

import java.util.*;

public class CollectionsPlusMap {

    public static void main(String[] args) {

        List<String> planets = new ArrayList<>();
        planets.add("Merkuriy");
        planets.add("Venera");
        planets.add("Zemlya");
        System.out.println(planets);

        Set<String> planetsSet = new HashSet<>();
        planetsSet.add("Merkuriy");
        planetsSet.add("Venera");
        planetsSet.add("Zemlya");
        planetsSet.add("Zemlya"); // в hashSet не может быть дубликатов
        System.out.println(planetsSet);

        Map<String, Double> planetWeights = new HashMap<>();
        planetWeights.put("Merkuriy", 16.54);
        planetWeights.put("Venera", 989.18);
        planetWeights.put("Zemlya", 149.04);
        System.out.println(planetWeights.get("Venera"));

        Iterator<String> iterator = planets.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
