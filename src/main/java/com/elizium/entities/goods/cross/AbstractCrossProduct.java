package com.elizium.entities.goods.cross;


import com.elizium.entities.goods.AbstractProduct;

public abstract class AbstractCrossProduct implements AbstractProduct {
    abstract Cross getMetalCross();
    abstract Cross getWoodCross();

}
