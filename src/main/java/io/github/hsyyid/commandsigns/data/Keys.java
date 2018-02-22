package io.github.hsyyid.commandsigns.data;

import com.google.common.reflect.TypeToken;
import javax.annotation.Generated;
import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.data.key.Key;
import org.spongepowered.api.data.key.KeyFactory;
import org.spongepowered.api.data.value.mutable.ListValue;
import org.spongepowered.api.data.value.mutable.Value;

import java.util.List;

import com.google.common.reflect.TypeToken;
import javax.annotation.Generated;
import org.spongepowered.api.data.DataQuery;
import org.spongepowered.api.data.key.Key;
import org.spongepowered.api.data.key.KeyFactory;
import org.spongepowered.api.data.value.mutable.ListValue;

@Generated(value = "flavor.pie.generator.data.DataManipulatorGenerator", date = "2018-02-07T05:40:53.507Z")
public class Keys {

    private Keys() {}

    public final static Key<ListValue<String>> CMDS;
    static {
        TypeToken<List<String>> listStringToken = new TypeToken<List<String>>(){};
        TypeToken<ListValue<String>> listValueStringToken = new TypeToken<ListValue<String>>(){};
        CMDS = KeyFactory.makeListKey(listStringToken, listValueStringToken, DataQuery.of("Cmds"), "commandsigns:cmds", "Cmds");
    }
}