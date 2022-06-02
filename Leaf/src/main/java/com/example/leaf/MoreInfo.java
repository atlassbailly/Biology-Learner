package com.example.leaf;
//provides additional information about organelles
public enum MoreInfo {
    Mitochondrionday("Structure: Double membrane, where the inner membrane is folded to increase surface area to volume ratio (allows area for more chemical reactions to occur). These folds are called cristae. It also contains expressed genetic material, ribosomes, and matrix (the space inside the inner membrane)."),
    Mitochondrionnight("Structure: Double membrane, where the inner membrane is folded to increase surface area to volume ratio (allows area for more chemical reactions to occur). These folds are called cristae. It also contains expressed genetic material, ribosomes, and matrix (the space inside the inner membrane)."),
    Thylakoidday("Step 2. PSl: The charged electron reaches molecule pair P700, which boosts the electron to a higher energy level to push it down the membrane. At the end of the chain, two charged molecules created by these reactions are passed to NADP+ to create NADPH, which stores energy needed to create glucose."),
    Thylakoidnight("Step 2. PSl: The charged electron reaches molecule pair P700, which boosts the electron to a higher energy level to push it down the membrane. At the end of the chain, two charged molecules created by these reactions are passed to NADP+ to create NADPH, which stores energy needed to create glucose.");

    String infobar;

    //enum constructor
    MoreInfo(String s) {
        infobar = s;
    }

    //returns the more info string for an enum instance
    public String getInfo(){
        return infobar;
    }
}
