package xyz.matthewtgm.mango.data;

import lombok.Getter;
import lombok.Setter;

public class Vec2 {
    @Getter @Setter private int x, y;
    public Vec2(int x, int y) {
        this.x = x;
        this.y = y;
    }
}