import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class DetectSquares {
  private final HashMap<List<Integer>, Integer> freq;
  public DetectSquares() {
    this.freq = new HashMap<>();
  }
  public void add(int[] point){
    List<Integer> coord = List.of(point[0], point[1]);
    int count = 0;
    if (this.freq.containsKey(coord)) {
      count = this.freq.get(coord);
    }
    this.freq.put(coord, count+1);
  }
  public int count(int[] point) {
    int res = 0;
    Set<Map.Entry<List<Integer>, Integer>> entrySet = this.freq.entrySet();
    for (Map.Entry<List<Integer>, Integer> pair: entrySet) {
      int count = pair.getValue();
      List<Integer> coord = pair.getKey();
      int cx = coord.get(0), cy = coord.get(1);
      if (Math.abs(cx - point[0]) != Math.abs(cy-point[1]) || (cx == point[0] && cy == point[1])) {
        continue;
      }
      int count_1 = 0, count_2 = 0;
      if (this.freq.containsKey(List.of(cx, point[1]))) {
        count_1 = this.freq.get(List.of(cx, point[1]));
      }
      if (this.freq.containsKey(List.of(point[0], cy))) {
        count_2 = this.freq.get(List.of(point[0], cy));
      }
      res += count * count_1 * count_2;
    }
    return res;
  }
}
