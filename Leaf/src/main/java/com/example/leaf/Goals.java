package com.example.leaf;
//provides strings for the label bar at the top that summarizes the purpose of an organelle
public enum Goals {
    Leafday("Role: site where photosynthesis happens the most."), Leafnight("Role: site where photosynthesis happens the most."),
    Cellday("Role: holds organelles that sustain plant life."), Cellnight("Role: holds organelles that sustain plant life"),
    Stomataday("Role: Intake C02 while controlling water loss."), Stomatanight("Role: Intake C02 while controlling water loss."),
    Veinday("Role: Provide structural support and transport molecules."), Veinnight("Role: Provide structural support and transport molecules."),
    Mitochondrionday("Role: Cellular respiration, signal cell death and carry DNA."), Mitochondrionnight("Role: Cellular respiration, signal cell death and carry DNA."),
    Chloroplastday("Role: site for photosynthesis."), Chloroplastnight("Role: site for photosynthesis."),
    Ribosomeday("Role: translates mitochondrial mRNAs from mtDNA."), Ribosomenight("Role: translates mitochondrial mRNAs from mtDNA."),
    DNAday("Role: hold plant genetic information."), DNAnight("Role: hold plant genetic information."),
    Matrixday("Role: produce acetyl CoA and package energy."), Matrixnight("Role: produce acetyl CoA and package energy."),
    Innerday("Role: power ATP production and release water."), Innernight("Role: power ATP production and release water."),
    Outerday("Role: make pyruvate molecules."), Outernight("Role: make pyruvate molecules. "),
    Thylakoidday("Role: Light dependent reaction that generates energy."), Thylakoidnight("Role: Light dependent reaction that generates energy."),
    Granaday("Role: Light independent reaction that produces sugars."), Grananight("Role: Light independent reaction that produces sugars.");

    String goal;

    //enum constructor
    Goals(String s) {
        goal = s;
    }

    //returns the enum string
    public String getGoal(){
        return goal;
    }
}
