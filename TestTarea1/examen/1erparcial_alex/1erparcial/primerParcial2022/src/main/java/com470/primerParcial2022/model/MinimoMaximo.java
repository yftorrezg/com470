package com470.primerParcial2022.model;

import java.util.Objects;

public class MinimoMaximo {
    public Integer min;
    public Integer max;

    public MinimoMaximo(Integer min, Integer max) {
        this.min = min;
        this.max = max;
    }

    public MinimoMaximo() {
    }

    @Override
    public String toString() {
        return "MinimoMaximo{" + "min=" + min + ", max=" + max + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.min);
        hash = 67 * hash + Objects.hashCode(this.max);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final MinimoMaximo other = (MinimoMaximo) obj;
        if (!Objects.equals(this.min, other.min)) {
            return false;
        }
        if (!Objects.equals(this.max, other.max)) {
            return false;
        }
        return true;
    }

    
      
}
