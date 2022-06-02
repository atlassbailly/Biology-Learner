package com.example.leaf;

//provides side-bar info for organelles
public enum Infobars {
    Leafday("Many plants have leaves in order to capture sunlight, release water, and perform general photosynthesis and cellular respiration. Depending on the climate– water availability, competition for sunlight, temperature fluctuation– leaves grow to different shapes and sizes. The leaf pictured belongs to a subtropical climate, as seen to its sizable surface area which can capture more sunlight and release more water."),
    Leafnight("Plants perform photosynthesis during the day due to the abundance of sunlight, which powers the light dependent cycle and indirectly powers the light independent cycle. In areas that experience limited light– whether it be because of polar locations or competition with other plants– leaves tend to be less wide and longer. "),
    Cellday("Unlike eukaryotic animal cells, plant cells have cell walls, which allow them to retain a rigid structure without bursting due to excess water. These cells contain a nucleus, golgi apparatus, ribosomes, mitochondria, fibers, and chloroplasts. Although all organelles play a role in cell life, the mitochondria aids in cellular respiration, and chloroplasts aid in photosynthesis."),
    Cellnight("At night, the mitochondria is one of the most active organelles in the leaf due to its metabolic activity. While the chloroplast is less active due to the lack of sunlight, the mitochondria houses all four steps of cellular respiration: glycolysis,pyruvate oxidation, Krebs Cycle, and oxidative phosphorylation."),
    Stomataday("Stomata are pores on the leaf surface that are accompanied by two guard cells to intake C02 and minimize transpiration. They protect the leaf from most mass-flow solute penetration. The stomata are most opened during the daytime so water created from cellular respiration can be released (transpiration). In the nighttime, the stomata’s guard cells constrict to avoid losing water when photosynthesis isn’t happening."),
    Stomatanight("In the nighttime, the stomata’s guard cells constrict to avoid losing water when photosynthesis isn’t happening.They must keep all excess water in order to power photosynthesis when the morning comes. "),
    Veinday("Veins are widely distributed throughout the plant. They serve as a “skeleton” structure that provides rigidness, and disperse molecules throughout the plant. The two main vein structures are the xylem and the phloem. Water potential is low at the roots (since there is already a high concentration of water) and high at the edges of leaves (since they are the furthest distance from a water source). Through adhesion to plant tissue and cohesion with other water molecules, the xylem pushes water upwards to reach the leaves. The phloem responds to changes in cell signals to distribute nutrients in any direction, including downwards."),
    Veinnight("Veins are widely distributed throughout the plant. They serve as a “skeleton” structure that provides rigidness, and disperse molecules throughout the plant. The two main vein structures are the xylem and the phloem. Water potential is low at the roots (since there is already a high concentration of water) and high at the edges of leaves (since they are the furthest distance from a water source). Through adhesion to plant tissue and cohesion with other water molecules, the xylem pushes water upwards to reach the leaves. The phloem responds to changes in cell signals to distribute nutrients in any direction, including downwards."),
    Mitochondrionday("Site of cellular respiration (CR). Although CR in plants happens at all times, it is most active at night in the dark. In cellular respiration, glucose is broken down into carbon dioxide and water to release ATP used to catalyze cell growth. "),
    Mitochondrionnight("Although CR in plants happens at all times, it is most active at night in the dark. At night, there is no photosynthesis to intake C02 that is released by cellular respiration. Thus, a plant produces net C02 solely during the night."),
    Chloroplastday("Chloroplasts are plastids that capture photons emitted by the Sun and use them to excite electrons, which in turn power the synthesis of glucose. They are the most active and dominant during the day, and release net 02. They contain green pigments called chlorophyll, which are what captures photons by the sun and use it to excite electrons. Chlorophyll reflects back green light, which makes it appear green to our eyes."),
    Chloroplastnight("Chloroplasts cannot use solar energy to function at night. This impedes their ability to synthesize glucose using the light dependent reactions. "),
    Ribosomeday("Like ribosomes in the outside of the mitochondrion, these mitochondrial ribosomes catalyze the translation of mtDNA into genetic information. This code is eventually synthesized into proteins that contribute to plant phenotypes."),
    Ribosomenight("Like ribosomes in the outside of the mitochondrion, these mitochondrial ribosomes catalyze the translation of mtDNA into genetic information. This code is eventually synthesized into proteins that contribute to plant phenotypes."),
    DNAday("There is genetic information encoded in DNA found in the plant mitochondria. Plants may contain either circular or linear pieces of this genome, and vary based on the species."),
    DNAnight("There is genetic information encoded in DNA found in the plant mitochondria. Plants may contain either circular or linear pieces of this genome, and vary based on the species."),
    Matrixday("Pyruvate oxidation is the second step in cellular respiration. A carboxyl group is removed from the pyruvate to create a 2-carbon molecule, releasing 1 C02. This 2-carbon molecule is oxidized to form acetyl. The acetyl attaches to Coenzyme A, forms acetyl CoA, and is transported to the Krebs cycle. Molecules produced: 2 acetyl CoA, 2 C02, and 2 NADH. \n\n" +
            "The Krebs Cycle is the third step in cellular respiration. Acetyl CoA is transformed and its energy is packaged into electron carriers NADH, ATP, and FADH2. CO2 is produced as a byproduct."),
    Matrixnight("Pyruvate oxidation is the second step in cellular respiration. The Krebs Cycle is the third step in cellular respiration. Since CR happens at all times, the rate of these processes remains unchanged between day and night. "),
    Innerday("Fourth step in cellular respiration: oxidative phosphorylation. Here, NADH and FADH2 (produced by Krebs cycle) deliver electrons to the ETC and are reduced. Electrons traveling down the ETC help pump H+ ions into the intermembrane space, creating an electrochemical gradient. Oxygen molecules receive these electrons and join with a H+ to create H20. H+ protons flow through the matrix through embedded proteins called ATP synthase. This proton flow powers ATP synthase to create ATP. 2 ATP in glycolysis, 2 in Krebs cycle, and about 30 in oxidative phosphorylation."),
    Innernight("Fourth step in cellular respiration: oxidative phosphorylation. Since CR happens at all times, the rate of this process remains unchanged between day and night. "),
    Outerday("First step of cellular respiration: glycolysis occurs in cytosol, which is outside of the mitochondrion and neighbors the outer mitochondrial membrane. Glycolysis: converts one 6-carbon glucose molecule (produced by photosynthesis) into two 3-carbon pyruvate molecules. 2 ATPs are invested into the reaction, and 4 are produced (2 net ATP). 2 molecules of NADH are also produced. When 02 is present, this NADH is reduced back into NAD+. The outer membrane allows pyruvate molecules to passively diffuse to the mitochondrion without the use of energy. "),
    Outernight("First step of cellular respiration: glycolysis occurs in cytosol. Since CR happens at all times, the rate of this process remains unchanged between day and night. "),
    Thylakoidday("Things to know– electron transport chain (aka ETC) is another term for the thylakoid membrane. Step 1. PSll: Chlorophylls absorb a photon, and the energy is passed through pigments until it reaches the reaction center. Here, chlorophyll molecule pair P680 boosts an electron to a higher energy level. The electron moves down the membrane again until it reaches ATP synthase, pushing H+ protons into the thylakoid interior. An H20 molecule donates an electron to replace the spot of the charged electron, which releases a molecule 02. (click on more info to read about Step 2)."),
    Thylakoidnight("The electron transport chain provided by the thylakoid membrane has electrons that must be excited by sun in order to power the beginning steps of glucose synthesis (photosynthesis). Since there is no direct solar energy at night, this membrane does not serve a solar-dependent photosynthetic role at night.\n"),
    Granaday("Step 1. Carbon fixing: The enzyme RuBisCo combines a C02 molecule with 5 carbon acceptor RuBP to create a pair of 3-carbon molecules. \n\n" +
            "Step 2. Reduction: ATP and NADH are reduced to ADP and NAD. This reaction releases energy, which helps convert the 2 3-carbon molecules into 3-carbon sugars called G3P. In order for a G3P molecule to exit the Calvin cycle, two more G3Ps must be reduced to reactivate RuBP. Thus, 3 C02 molecules create one net G3P. C6H1206 (1 glucose molecule) is made after 6 turns of the Calvin cycle."),
    Grananight("The light independent reaction doesn’t directly require solar energy. The light dependent reaction provides charged electrons in NADPH carriers, which the light independent reaction requires in order to fix carbons and capture energy. Without sun, this reaction must resort to starch degradation or other energy sources in order to continue a minimal, low activity of nighttime photosynthesis. ");

    String infobar;

    //enum constructor
    Infobars(String s) {
        infobar = s;
    }

    //returns the string
    public String getInfo(){
        return infobar;
    }
}

