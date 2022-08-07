import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<String> RunDetectSquares(String[] commands, int[][] points) {
    List<String> result = new ArrayList<>();
    DetectSquares ds = new DetectSquares();
    int LenCommands = commands.length;
    result.add("null");
    for (int pos = 1; pos < LenCommands; pos++) {
      switch (commands[pos]) {
        case "add":
          ds.add(points[pos]);
          result.add("null");
          break;
        case "count":
          int res = ds.count(points[pos]);
          result.add(String.valueOf(res));
      }
    }
    return result;
  }
}
