package com.elizium.entities.goods.cross;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WoodCross extends Cross{
    private TypeOfWood typeOfWood;
}
