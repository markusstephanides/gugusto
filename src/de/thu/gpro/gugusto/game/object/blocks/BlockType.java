package de.thu.gpro.gugusto.game.object.blocks;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

public enum BlockType {

    NONE(0),
    GRASS(1),
    GOAL(2),
    COIN(3),
    CHEST(4),
    JUMP_PAD(5),
    DIRT(6);

    private static final Map<Integer, BlockType> map = new HashMap<>();

    static {
        for(BlockType type : EnumSet.allOf(BlockType.class)) map.put(type.id, type);
    }

    private int id;

    BlockType(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public static BlockType get(int id){
        return map.get(id);
    }

}
