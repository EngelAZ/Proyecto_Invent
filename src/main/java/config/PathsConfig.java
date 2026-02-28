package config;

import java.nio.file.Path;
import java.nio.file.Paths;


public class PathsConfig
{
    public static final Path DATA_PRODUCT = Paths.get(System.getProperty("user.dir"),"src","main","java","db","Data.txt");
}