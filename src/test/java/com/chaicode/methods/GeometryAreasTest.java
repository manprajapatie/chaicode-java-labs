package com.chaicode.methods;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Methods - Geometry Areas")
class GeometryAreasTest {

    @Test
    void circleArea() {
        assertEquals(78.54, GeometryAreas.circleArea(5.0));
    }

    @Test
    void rectangleArea() {
        assertEquals(20.0, GeometryAreas.rectangleArea(4.0, 5.0));
    }

    @Test
    void triangleArea() {
        assertEquals(10.0, GeometryAreas.triangleArea(4.0, 5.0));
    }

    @Test
    void invalidCircle() {
        assertEquals(-1.0, GeometryAreas.circleArea(-1.0));
    }
}
