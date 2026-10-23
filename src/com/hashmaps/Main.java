import java.util.HashMap;

void main() {
    HashMap<String, Float> map = new HashMap<>();

    map.put("Kunal", 89.3f);
    map.put("Prince", 91.47f);
    map.put("Avinash", 78.89f);

    IO.println(map.get("Prince"));
    IO.println(map.getOrDefault("Princy", 33.3f));
    IO.println(map.keySet());

    HashSet<Integer> set = new HashSet<>();
    set.add(24);
    set.add(24);
    set.add(45);
    set.add(61);
    IO.println(set);

    TreeMap<String, Integer> tree = new TreeMap<>();
    tree.put("Kunal", 89);
    tree.put("Prince", 91);
    tree.put("Avinash", 78);
    tree.put("Jayant", 67);
    tree.put("Varun", 49);
    IO.println(tree);
}
