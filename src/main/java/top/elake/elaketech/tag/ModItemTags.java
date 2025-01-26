package top.elake.elaketech.tag;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.core.registries.Registries;

/**
 * @author Qi-Month
 */
public class ModItemTags {
    /**
     * 获取neoforge的tag
     *
     * @param tag 标签名
     */
    private static TagKey<Item> getTag(String tag) {
        return ItemTags.create(ResourceLocation.fromNamespaceAndPath("c", tag));
    }

    public static class Items {
        public static final TagKey<Item> FLINT = getTag("flint");
        public static final TagKey<Item> INGOTS = getTag("ingots");
        public static final TagKey<Item> BRONZE = getTag("ingots/bronze");
        public static final TagKey<Item> GRAPHITE = getTag("ingots/graphite");
    }
}