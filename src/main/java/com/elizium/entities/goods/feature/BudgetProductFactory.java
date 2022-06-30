package com.elizium.entities.goods.feature;

import com.elizium.entities.goods.AbstractProduct;

public interface BudgetProductFactory extends AbstractProduct {
    Coffin createCoffinProduct(TypeOfBudget typeOfBudget);
    Wreath createWreathProduct(TypeOfBudget typeOfBudget);
}
