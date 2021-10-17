package top.abmcar.easygetmonstername.config;

import org.bukkit.configuration.file.YamlConfiguration;
import top.abmcar.easygetmonstername.EasyGetMonsterName;

import java.util.List;

public class ConfigData {
    public static ConfigData INSTANCE = new ConfigData();

    private ConfigData() {}

    private YamlConfiguration config = ConfigUtil.loadYaml(EasyGetMonsterName.getPlugin(), "config.yml");

    public YamlConfiguration getConfigYaml() {
        return config;
    }

    public void setConfigYaml(YamlConfiguration config) {
        this.config = config;
    }

    public List<String> playerNames =config.getStringList("names");

    public void reload() {

    }
}
