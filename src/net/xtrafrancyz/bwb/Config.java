package net.xtrafrancyz.bwb;

import com.google.gson.annotations.SerializedName;

import java.util.Collections;
import java.util.Set;

/**
 * @author xtrafrancyz
 */
public class Config {
    public String host = "127.0.0.1";
    public int port = 4532;
    
    public String checkUrl = "http://..";
    @SerializedName("default")
    public String _default = "play.your-server.net";
    
    public Set<String> ignoredBungees = Collections.emptySet();
}
