package Generics;

/**
 * Created by pc on 18.01.2016.
 */
interface MinMax<T extends Comparable<T>> {
    T min();
    T max();
}
