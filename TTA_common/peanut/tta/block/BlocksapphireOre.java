package peanut.tta.block;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import peanut.tta.creativetab.CreactiveTabs;
import peanut.tta.item.ModItems;

public class BlocksapphireOre extends Block {
	public BlocksapphireOre(){
		super(810, Material.rock);
		this.setHardness(3.0F);
		this.setCreativeTab(CreactiveTabs.TTA_TABBASE);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister iconRegister){
		this.blockIcon = iconRegister.registerIcon("tta:sapphireOre");
	}   
	
	public int idDropped(int par1, Random par2Random, int par3){
		return ModItems.sapphireUncut.itemID;
	}

}

