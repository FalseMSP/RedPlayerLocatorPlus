package sh.sit.plp;

import com.mojang.serialization.Codec;
import net.minecraft.util.datafix.DataFixTypes;
import net.minecraft.world.level.saveddata.SavedData;
import net.minecraft.world.level.saveddata.SavedDataType;

import java.util.function.Supplier;

public class SavedDataTypeHelper {
    public static <T extends SavedData> SavedDataType<T> construct(String id, Supplier<T> constructor, Codec<T> codec, DataFixTypes dataFixType) {
        return new SavedDataType<>(id, constructor, codec, dataFixType);
    }
}
