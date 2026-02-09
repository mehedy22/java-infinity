package design_pattern.interfaces;


/*
 * can extend multiple interfaces using extends keyword
 *
 */

public interface NonFlyingBirds extends Bird, LivingThings {
    void canRun();
}
