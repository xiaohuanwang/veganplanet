package com.veganplanet.system.entity;

import java.io.Serializable;

public class SysDeptRelation implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 祖先节点
     *
     * @mbggenerated
     */
    private Integer ancestor;
    /**
     * 后代节点
     *
     * @mbggenerated
     */
    private Integer descendant;

    public Integer getAncestor() {
        return ancestor;
    }

    public void setAncestor(Integer ancestor) {
        this.ancestor = ancestor;
    }

    public Integer getDescendant() {
        return descendant;
    }

    public void setDescendant(Integer descendant) {
        this.descendant = descendant;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ancestor=").append(ancestor);
        sb.append(", descendant=").append(descendant);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}