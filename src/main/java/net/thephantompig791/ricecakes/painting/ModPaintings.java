package net.thephantompig791.ricecakes.painting;

import net.minecraft.entity.decoration.painting.PaintingVariant;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.thephantompig791.ricecakes.Ricecakes;

public class ModPaintings {

    public static final PaintingVariant RICES = registerPainting("rices", new PaintingVariant(16, 16));
    public static final PaintingVariant RICE_CAKE = registerPainting("rice_cake", new PaintingVariant(96, 96));
    public static final PaintingVariant LONG_RICE = registerPainting("long_rice", new PaintingVariant(16, 320));


    private static PaintingVariant registerPainting(String name, PaintingVariant paintingVariant) {
        return Registry.register(Registry.PAINTING_VARIANT, new Identifier(Ricecakes.MOD_ID, name), paintingVariant);
    }

    public static void registerPaintings() {
        Ricecakes.LOGGER.info("Registering the rice cake paintings!");
    }
}
