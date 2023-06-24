package main.controlefluxo;

public class ParametrosInvalidosException extends RuntimeException {
    public ParametrosInvalidosException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }
}
