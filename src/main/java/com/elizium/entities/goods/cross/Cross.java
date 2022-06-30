package com.elizium.entities.goods.cross;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Cross extends AbstractCrossProduct{
    @Override
    Cross getMetalCross() {
        return new MetalCross();
    }

    @Override
    Cross getWoodCross() {
        return new WoodCross(TypeOfWood.DEFAULT);
    }
}
