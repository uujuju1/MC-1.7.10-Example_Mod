package com.keller23.mc.Example1710.worldgen;

import com.keller23.mc.Example1710.blocks.ModBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

import java.util.Random;

public class TestWorldGen implements IWorldGenerator {

    @Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        switch(world.provider.dimensionId){
            case 0: genOverworld(random, world, chunkX * 16, chunkZ * 16); break;
            case 1: genEnd(random, world, chunkX * 16, chunkZ * 16); break;
            case -1: genNether(random, world, chunkX * 16, chunkZ * 16); break;
            default: genOverworld(random, world, chunkX * 16, chunkZ * 16);
        }
    }

    private void genOverworld(Random random, World world, int x, int z) {
        // _block, (_blockToReplace,) world, random, x, z, _smallestVein, _largestVein, _chance, _minY, _maxY
        //addOre(ModBlocks.testBlock, world, random, x, z, 2, 30, 200, 50, 100); // smallest: 2, largest: 30, chance: 200, minY: 50, maxY: 100

        // add beef ore in the bottom 20m of the world, but above bedrock; more common
        addOre(ModBlocks.beefOre, world, random, x, z, 2, 30, 40, 5, 20);
        addOre(ModBlocks.beefOre, world, random, x, z, 2, 6, 10, 21, 40);
    }

    private void genEnd(Random random, World world, int x, int z) {

    }

    private void genNether(Random random, World world, int x, int z) {
        // Steak Ore; good chance of replacing netherrack
        addOre(ModBlocks.steakOre, Blocks.netherrack, world, random, x, z, 1, 10, 40, 0, 100);
    }

    // replaces Blocks.stone by default
    private void addOre(Block block, World world, Random random, int blockXPos, int blockZPos, int minVein, int maxVein, int chanceToSpawn, int minY, int maxY) {
        WorldGenMinable minable = new WorldGenMinable(block, minVein + random.nextInt(maxVein - minVein), Blocks.stone);
        for(int i = 0; i < chanceToSpawn; i++){
            int posX = blockXPos + random.nextInt(15);
            int posZ = blockZPos + random.nextInt(15);
            int posY = minY + random.nextInt(maxY - minY);
            minable.generate(world, random, posX, posY, posZ);
        }
    }

    // allows you to replace any block you input
    private void addOre(Block block, Block replaceBlock, World world, Random random, int blockXPos, int blockZPos, int minVein, int maxVein, int chanceToSpawn, int minY, int maxY) {
        WorldGenMinable minable = new WorldGenMinable(block, minVein + random.nextInt(maxVein - minVein), replaceBlock);
        for(int i = 0; i < chanceToSpawn; i++){
            int posX = blockXPos + random.nextInt(15);
            int posZ = blockZPos + random.nextInt(15);
            int posY = minY + random.nextInt(maxY - minY);
            minable.generate(world, random, posX, posY, posZ);
        }
    }
}
