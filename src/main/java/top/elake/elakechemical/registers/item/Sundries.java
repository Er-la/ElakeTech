package top.elake.elakechemical.registers.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import top.elake.elakechemical.ElakeChemical;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Sundries {
    public static final DeferredRegister.Items ITEMS = DeferredRegister
            .createItems(ElakeChemical.MODID);

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    /**
     * 已注册的元素
     */
    public static final List<DeferredItem<? extends Item>> REGISTERED_ELEMENTS = new ArrayList<>();

    /**
     * 获取已注册的元素物品列表
     *
     * @return 已注册的元素物品列表
     */
    public static List<DeferredItem<? extends Item>> getRegisteredElements() {
        return REGISTERED_ELEMENTS;
    }

    // 杂草
    public static final Supplier<Item> GRASS_FIBER = ITEMS.registerSimpleItem("grass_fiber", new Item.Properties());
    // 草绳
    public static final Supplier<Item> GRASS_STRING = ITEMS.registerSimpleItem("grass_string", new Item.Properties());
}