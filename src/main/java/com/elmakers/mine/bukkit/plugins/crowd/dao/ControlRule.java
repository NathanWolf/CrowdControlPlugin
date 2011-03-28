package com.elmakers.mine.bukkit.plugins.crowd.dao;

import com.elmakers.mine.bukkit.borrowed.CreatureType;
import com.elmakers.mine.bukkit.persisted.PersistClass;
import com.elmakers.mine.bukkit.persisted.PersistField;

@PersistClass(schema = "crowd", name = "rule")
public class ControlRule
{
    protected CreatureType creatureType;

    protected float        percentChance;

    protected int          rank;

    protected CreatureType replaceWith;

    public ControlRule()
    {

    }

    public ControlRule(int order, CreatureType mobType)
    {
        this.rank = order;
        this.creatureType = mobType;
    }

    @PersistField
    public CreatureType getCreatureType()
    {
        return creatureType;
    }

    @PersistField
    public float getPercentChance()
    {
        return percentChance;
    }

    @PersistField(id = true)
    public int getRank()
    {
        return rank;
    }

    @PersistField
    public CreatureType getReplaceWith()
    {
        return replaceWith;
    }

    public void setCreatureType(CreatureType creatureType)
    {
        this.creatureType = creatureType;
    }

    public void setPercentChance(float percentChance)
    {
        this.percentChance = percentChance;
    }

    public void setRank(int rank)
    {
        this.rank = rank;
    }

    public void setReplaceWith(CreatureType replaceWith)
    {
        this.replaceWith = replaceWith;
    }
}
