package com.collections.task.map;


public class StatePopulation implements Comparable<StatePopulation> {

    private String name;
    private Integer population;

    public StatePopulation(String name, Integer population) {
        this.name = name;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public Integer getPopulation() {
        return population;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        result = prime * result + ((population == null) ? 0 : population.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        StatePopulation statePopulation = (StatePopulation) obj;
        return name.equals(statePopulation.name) && population.equals(statePopulation.population);
    }

    @Override
    public int compareTo(StatePopulation o) {
        return this.population.compareTo(o.population);
    }

    @Override
    public String toString() {
        return "State:" + name + ", Population:" + population;
    }
    
    
}
