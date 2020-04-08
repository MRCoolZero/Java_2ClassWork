package ru.rickSanchez.company.home_work_2;

public class MatrixSizeException extends Exception {
    @Override
    public String toString() {
        return "MatrixSizeException[the size of the matrix obtained from a string is not equal to 4x4]";
    }

    public MatrixSizeException() {
    }

    public MatrixSizeException(String message, Throwable cause) {
        super(message, cause);
    }
}
