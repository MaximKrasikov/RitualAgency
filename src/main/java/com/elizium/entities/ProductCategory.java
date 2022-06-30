package com.elizium.entities;

import com.elizium.entities.goods.AbstractProduct;
import com.elizium.entities.goods.feature.Coffin;
import com.elizium.entities.goods.cross.Cross;
import com.elizium.entities.goods.feature.TypeOfBudget;
import com.elizium.entities.goods.feature.Wreath;

public enum ProductCategory {
    COFFIN{
        @Override
        public AbstractProduct getProductCategory(){
            return (AbstractProduct) new Coffin(typeOfBudget);
        }
    },//гробы
    WREATH{
        @Override
        public AbstractProduct getProductCategory(){
            return (AbstractProduct) new Wreath(typeOfBudget);
        }
    },//венки
    CROSS{
        @Override
        public AbstractProduct getProductCategory(){
            return new Cross();
        }
    };//кресты
    private static TypeOfBudget typeOfBudget;
    public abstract AbstractProduct getProductCategory();
}
