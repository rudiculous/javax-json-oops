import javax.json.Json;

public class Main {
  public static void main(String[] args) {
    for (int i = 1; i <= 1e6; i += 1) {
      Json.createObjectBuilder();
      if (i % 1e5 == 0) {
        System.out.println("Created " + i + " objects so far...");
      }
    }
  }
}
