package Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures;

import Part1.module6_inheritanceAndPolymorphism.lesson7_11_InterfacesPolymorphismLambdas.figures.abstraction.Figure3D;

public class Sphere extends Figure3D {
    @Override
    public double getVolume() {
        return 0;
    }

    @Override
    public double getSurfaceSquare() {
        return 0;
    }

    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWidth() {
        return 0;
    }
}
