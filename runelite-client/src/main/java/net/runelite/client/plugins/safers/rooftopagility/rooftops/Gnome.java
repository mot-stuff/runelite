package net.runelite.client.plugins.safers.rooftopagility.rooftops;

import net.runelite.api.coords.WorldPoint;

import java.util.Arrays;

public class Gnome extends Base {
    public Gnome() {
        init();
    }

    @Override
    public String toString() {
        return "Gnome";
    }

    @Override
    public void init() {
        stageList.add(new RooftopStage("Log balance","Walk-across",new WorldPoint(2474,3435,0),23145,new WorldPoint(2467, 3412, 0), new WorldPoint(2493, 3442, 0)));
        
        
        stageList.add(new RooftopStage("Obstacle net","Climb-over",new WorldPoint(2474,3425,0),23134, Arrays.asList(new WorldPoint(2468,3424,0),new WorldPoint(2468,3425,0),new WorldPoint(2468,3426,0),new WorldPoint(2468,3427,0),new WorldPoint(2468,3428,0),new WorldPoint(2468,3429,0),new WorldPoint(2468,3430,0),new WorldPoint(2468,3431,0),new WorldPoint(2469,3424,0),new WorldPoint(2469,3425,0),new WorldPoint(2469,3426,0),new WorldPoint(2469,3427,0),new WorldPoint(2469,3428,0),new WorldPoint(2469,3429,0),new WorldPoint(2469,3430,0),new WorldPoint(2469,3431,0),new WorldPoint(2470,3424,0),new WorldPoint(2470,3425,0),new WorldPoint(2470,3426,0),new WorldPoint(2470,3427,0),new WorldPoint(2470,3428,0),new WorldPoint(2470,3429,0),new WorldPoint(2470,3430,0),new WorldPoint(2470,3431,0),new WorldPoint(2471,3424,0),new WorldPoint(2471,3425,0),new WorldPoint(2471,3426,0),new WorldPoint(2471,3427,0),new WorldPoint(2471,3428,0),new WorldPoint(2471,3429,0),new WorldPoint(2471,3430,0),new WorldPoint(2471,3431,0),new WorldPoint(2472,3424,0),new WorldPoint(2472,3425,0),new WorldPoint(2472,3426,0),new WorldPoint(2472,3427,0),new WorldPoint(2472,3428,0),new WorldPoint(2472,3429,0),new WorldPoint(2472,3430,0),new WorldPoint(2472,3431,0),new WorldPoint(2473,3424,0),new WorldPoint(2473,3425,0),new WorldPoint(2473,3426,0),new WorldPoint(2473,3427,0),new WorldPoint(2473,3428,0),new WorldPoint(2473,3429,0),new WorldPoint(2473,3430,0),new WorldPoint(2473,3431,0),new WorldPoint(2474,3424,0),new WorldPoint(2474,3425,0),new WorldPoint(2474,3426,0),new WorldPoint(2474,3427,0),new WorldPoint(2474,3428,0),new WorldPoint(2474,3429,0),new WorldPoint(2474,3430,0),new WorldPoint(2474,3431,0),new WorldPoint(2475,3424,0),new WorldPoint(2475,3425,0),new WorldPoint(2475,3426,0),new WorldPoint(2475,3427,0),new WorldPoint(2475,3428,0),new WorldPoint(2475,3429,0),new WorldPoint(2475,3430,0),new WorldPoint(2475,3431,0),new WorldPoint(2476,3424,0),new WorldPoint(2476,3425,0),new WorldPoint(2476,3426,0),new WorldPoint(2476,3427,0),new WorldPoint(2476,3428,0),new WorldPoint(2476,3429,0),new WorldPoint(2476,3430,0),new WorldPoint(2476,3431,0),new WorldPoint(2477,3424,0),new WorldPoint(2477,3425,0),new WorldPoint(2477,3426,0),new WorldPoint(2477,3427,0),new WorldPoint(2477,3428,0),new WorldPoint(2477,3429,0),new WorldPoint(2477,3430,0),new WorldPoint(2477,3431,0),new WorldPoint(2478,3424,0),new WorldPoint(2478,3425,0),new WorldPoint(2478,3426,0),new WorldPoint(2478,3427,0),new WorldPoint(2478,3428,0),new WorldPoint(2478,3429,0),new WorldPoint(2478,3430,0),new WorldPoint(2478,3431,0),new WorldPoint(2479,3425,0),new WorldPoint(2479,3426,0),new WorldPoint(2479,3427,0),new WorldPoint(2479,3428,0),new WorldPoint(2479,3429,0),new WorldPoint(2479,3430,0),new WorldPoint(2479,3431,0))));
        stageList.add(new RooftopStage("Tree branch","Climb",new WorldPoint(2473,3422,1),23559, Arrays.asList(new WorldPoint(2471,3422,1),new WorldPoint(2471,3423,1),new WorldPoint(2471,3424,1),new WorldPoint(2472,3422,1),new WorldPoint(2472,3423,1),new WorldPoint(2472,3424,1),new WorldPoint(2473,3423,1),new WorldPoint(2473,3424,1),new WorldPoint(2474,3422,1),new WorldPoint(2474,3423,1),new WorldPoint(2474,3424,1),new WorldPoint(2475,3422,1),new WorldPoint(2475,3423,1),new WorldPoint(2475,3424,1),new WorldPoint(2476,3422,1),new WorldPoint(2476,3423,1),new WorldPoint(2476,3424,1))));
        stageList.add(new RooftopStage("Balancing rope","Walk-on",new WorldPoint(2478,3420,2),23557,Arrays.asList(new WorldPoint(2472,3418,2),new WorldPoint(2472,3419,2),new WorldPoint(2472,3420,2),new WorldPoint(2472,3421,2),new WorldPoint(2473,3419,2),new WorldPoint(2473,3420,2),new WorldPoint(2474,3418,2),new WorldPoint(2474,3419,2),new WorldPoint(2474,3420,2),new WorldPoint(2474,3421,2),new WorldPoint(2475,3418,2),new WorldPoint(2475,3419,2),new WorldPoint(2475,3420,2),new WorldPoint(2475,3421,2),new WorldPoint(2476,3419,2),new WorldPoint(2476,3420,2),new WorldPoint(2477,3419,2),new WorldPoint(2477,3420,2))));
        stageList.add(new RooftopStage("Tree branch","Climb-down",new WorldPoint(2486,3419,2),23560,Arrays.asList(new WorldPoint(2483,3419,2),new WorldPoint(2483,3420,2),new WorldPoint(2484,3419,2),new WorldPoint(2484,3420,2),new WorldPoint(2485,3418,2),new WorldPoint(2485,3419,2),new WorldPoint(2485,3420,2),new WorldPoint(2485,3421,2),new WorldPoint(2486,3418,2),new WorldPoint(2486,3420,2),new WorldPoint(2486,3421,2),new WorldPoint(2487,3421,2),new WorldPoint(2488,3420,2),new WorldPoint(2488,3421,2))));
        stageList.add(new RooftopStage("Obstacle net","Climb-over",new WorldPoint(2486,3426,0),23135,Arrays.asList(new WorldPoint(2480,3417,0),new WorldPoint(2480,3418,0),new WorldPoint(2480,3419,0),new WorldPoint(2480,3420,0),new WorldPoint(2480,3421,0),new WorldPoint(2480,3422,0),new WorldPoint(2480,3423,0),new WorldPoint(2480,3424,0),new WorldPoint(2480,3425,0),new WorldPoint(2481,3417,0),new WorldPoint(2481,3418,0),new WorldPoint(2481,3419,0),new WorldPoint(2481,3420,0),new WorldPoint(2481,3421,0),new WorldPoint(2481,3422,0),new WorldPoint(2481,3423,0),new WorldPoint(2481,3424,0),new WorldPoint(2481,3425,0),new WorldPoint(2482,3417,0),new WorldPoint(2482,3418,0),new WorldPoint(2482,3419,0),new WorldPoint(2482,3420,0),new WorldPoint(2482,3421,0),new WorldPoint(2482,3422,0),new WorldPoint(2482,3423,0),new WorldPoint(2482,3424,0),new WorldPoint(2482,3425,0),new WorldPoint(2483,3417,0),new WorldPoint(2483,3418,0),new WorldPoint(2483,3419,0),new WorldPoint(2483,3420,0),new WorldPoint(2483,3421,0),new WorldPoint(2483,3422,0),new WorldPoint(2483,3423,0),new WorldPoint(2483,3424,0),new WorldPoint(2483,3425,0),new WorldPoint(2484,3417,0),new WorldPoint(2484,3418,0),new WorldPoint(2484,3419,0),new WorldPoint(2484,3420,0),new WorldPoint(2484,3421,0),new WorldPoint(2484,3422,0),new WorldPoint(2484,3423,0),new WorldPoint(2484,3424,0),new WorldPoint(2484,3425,0),new WorldPoint(2485,3417,0),new WorldPoint(2485,3418,0),new WorldPoint(2485,3419,0),new WorldPoint(2485,3420,0),new WorldPoint(2485,3421,0),new WorldPoint(2485,3422,0),new WorldPoint(2485,3423,0),new WorldPoint(2485,3424,0),new WorldPoint(2485,3425,0),new WorldPoint(2486,3417,0),new WorldPoint(2486,3418,0),new WorldPoint(2486,3419,0),new WorldPoint(2486,3420,0),new WorldPoint(2486,3421,0),new WorldPoint(2486,3422,0),new WorldPoint(2486,3423,0),new WorldPoint(2486,3424,0),new WorldPoint(2486,3425,0),new WorldPoint(2487,3417,0),new WorldPoint(2487,3418,0),new WorldPoint(2487,3419,0),new WorldPoint(2487,3420,0),new WorldPoint(2487,3421,0),new WorldPoint(2487,3422,0),new WorldPoint(2487,3423,0),new WorldPoint(2487,3424,0),new WorldPoint(2487,3425,0),new WorldPoint(2488,3417,0),new WorldPoint(2488,3418,0),new WorldPoint(2488,3419,0),new WorldPoint(2488,3420,0),new WorldPoint(2488,3421,0),new WorldPoint(2488,3422,0),new WorldPoint(2488,3423,0),new WorldPoint(2488,3424,0),new WorldPoint(2488,3425,0),new WorldPoint(2489,3417,0),new WorldPoint(2489,3418,0),new WorldPoint(2489,3419,0),new WorldPoint(2489,3420,0),new WorldPoint(2489,3421,0),new WorldPoint(2489,3422,0),new WorldPoint(2489,3423,0),new WorldPoint(2489,3424,0),new WorldPoint(2489,3425,0),new WorldPoint(2490,3417,0),new WorldPoint(2490,3418,0),new WorldPoint(2490,3419,0),new WorldPoint(2490,3420,0),new WorldPoint(2490,3421,0),new WorldPoint(2490,3422,0),new WorldPoint(2490,3423,0),new WorldPoint(2490,3424,0),new WorldPoint(2490,3425,0),new WorldPoint(2491,3417,0),new WorldPoint(2491,3418,0),new WorldPoint(2491,3419,0),new WorldPoint(2491,3420,0),new WorldPoint(2491,3421,0),new WorldPoint(2491,3422,0),new WorldPoint(2491,3423,0),new WorldPoint(2491,3424,0),new WorldPoint(2491,3425,0))));
        stageList.add(new RooftopStage("Obstacle pipe","Squeeze-through",new WorldPoint(2484,3432,0),23138,Arrays.asList(new WorldPoint(2481,3427,0),new WorldPoint(2481,3428,0),new WorldPoint(2481,3429,0),new WorldPoint(2481,3430,0),new WorldPoint(2481,3431,0),new WorldPoint(2482,3427,0),new WorldPoint(2482,3428,0),new WorldPoint(2482,3429,0),new WorldPoint(2482,3430,0),new WorldPoint(2482,3431,0),new WorldPoint(2483,3427,0),new WorldPoint(2483,3428,0),new WorldPoint(2483,3429,0),new WorldPoint(2483,3430,0),new WorldPoint(2483,3431,0),new WorldPoint(2484,3427,0),new WorldPoint(2484,3428,0),new WorldPoint(2484,3429,0),new WorldPoint(2484,3430,0),new WorldPoint(2484,3431,0),new WorldPoint(2485,3427,0),new WorldPoint(2485,3428,0),new WorldPoint(2485,3429,0),new WorldPoint(2485,3430,0),new WorldPoint(2485,3431,0),new WorldPoint(2486,3427,0),new WorldPoint(2486,3428,0),new WorldPoint(2486,3429,0),new WorldPoint(2486,3430,0),new WorldPoint(2486,3431,0),new WorldPoint(2487,3427,0),new WorldPoint(2487,3428,0),new WorldPoint(2487,3429,0),new WorldPoint(2487,3430,0),new WorldPoint(2487,3431,0),new WorldPoint(2488,3427,0),new WorldPoint(2488,3428,0),new WorldPoint(2488,3429,0),new WorldPoint(2488,3430,0),new WorldPoint(2488,3431,0),new WorldPoint(2489,3427,0),new WorldPoint(2489,3428,0),new WorldPoint(2489,3429,0),new WorldPoint(2489,3430,0),new WorldPoint(2489,3431,0),new WorldPoint(2490,3427,0),new WorldPoint(2490,3428,0),new WorldPoint(2490,3429,0),new WorldPoint(2490,3430,0),new WorldPoint(2490,3431,0))));
    }

    @Override
    public int getLevel() {
        return 1;
    }

    @Override
    public WorldPoint getLocation() {
        return new WorldPoint(2474,3435,0);
    }
}