class Main {
  public static void main(String[] args) {
    for (int i = 5; i > 0; i--) {
      log(i);
    }

    /* Test: number 1 - 100 */
    for (int i = 1; i <= 100; i++) {
      log(i);
    }

  }

  public static void log(Object message) {
    System.out.println(message);
  }
}