import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
  private final Solution sol = new Solution();
  @Test
  void runDetectSquaresExample1() {
    /**
     * ["DetectSquares", "add", "add", "add", "count", "count", "add", "count"]
     * [[], [[3, 10]], [[11, 2]], [[3, 2]], [[11, 10]], [[14, 8]], [[11, 2]], [[11, 10]]]
     * [null, null, null, null, 1, 0, null, 2]
     */
    assertEquals(List.of("null","null", "null", "null", "1", "0", "null", "2"), sol.RunDetectSquares(
        new String[]{"DetectSquares", "add", "add", "add", "count", "count", "add", "count"},
        new int[][]{{}, {3,10}, {11,2}, {3,2},{11,10},{14, 8}, {11, 2}, {11,10}}
    ));
  }
}