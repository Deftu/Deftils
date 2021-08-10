package xyz.matthewtgm.mango.data;

import lombok.Getter;
import lombok.Setter;

public class Vec3 {
    @Getter @Setter private int x, y, z;
    public Vec3(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
}