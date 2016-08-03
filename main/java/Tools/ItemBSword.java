package Tools;

import main.Mainclass;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class ItemBSword extends ItemSword{

	public ItemBSword(ToolMaterial p_i45356_1_) {
		super(p_i45356_1_);
	}
	@Override
	public boolean getIsRepairable(ItemStack par1ItemStack, ItemStack par2ItemStack)
	{
	return par2ItemStack.isItemEqual(new ItemStack(Mainclass.BloodRock)) || super.getIsRepairable(par1ItemStack, par2ItemStack);
	}
}

