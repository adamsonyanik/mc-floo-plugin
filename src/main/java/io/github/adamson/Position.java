package io.github.adamson;

public record Position(int x, int y, int z) {

    @Override
    public String toString() {
        return x + ";" + y + ";" + z;
    }
}
