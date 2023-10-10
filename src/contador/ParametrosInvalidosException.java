package contador;

public class ParametrosInvalidosException extends Exception {

  /**
   * serial id
   */
  private static final long serialVersionUID = 1L;

  // construtor do erro customizado.
  public ParametrosInvalidosException(String message) {
    super(message);
  }

}
