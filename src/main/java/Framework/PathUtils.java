package Framework;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

@UtilityClass
public class PathUtils {
    @SneakyThrows
    public void applySleep(long time)
    {
        Thread.sleep(time);
    }
}
