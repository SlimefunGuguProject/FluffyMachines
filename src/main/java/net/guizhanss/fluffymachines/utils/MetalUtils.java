package net.guizhanss.fluffymachines.utils;

import lombok.experimental.UtilityClass;
import net.guizhanss.guizhanlib.common.utils.StringUtil;

import java.util.Locale;

@UtilityClass
public final class MetalUtils {

    public static String getMetalName(String type) {
        return switch (type.toUpperCase(Locale.ROOT)) {
            case "IRON" -> "铁";
            case "GOLD" -> "金";
            case "COPPER" -> "铜";
            case "TIN" -> "锡";
            case "SILVER" -> "银";
            case "LEAD" -> "铅";
            case "ALUMINUM" -> "铝";
            case "ZINC" -> "锌";
            case "MAGNESIUM" -> "镁";
            default -> StringUtil.humanize(type);
        };
    }
}
