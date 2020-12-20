package com.sunchaser.voyeur.core.pipeline;

import org.apache.commons.codec.digest.DigestUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;
import us.codecraft.webmagic.utils.FilePersistentBase;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author SunChaser admin@lilu.org.cn
 * @since JDK8 2020/12/20
 */
public class CollectValueJsonFilePipeline extends FilePersistentBase implements Pipeline {
    private static final Logger logger = LoggerFactory.getLogger(CollectValueJsonFilePipeline.class);

    /**
     * new JsonFilePageModelPipeline with default path "/data/webmagic/"
     */
    public CollectValueJsonFilePipeline() {
        setPath("/data/webmagic");
    }

    public CollectValueJsonFilePipeline(String path) {
        setPath(path);
    }

    @Override
    public void process(ResultItems resultItems, Task task) {
        String path = this.path + task.getUUID() + PATH_SEPERATOR;
        try {
            PrintWriter printWriter = new PrintWriter(new FileWriter(getFile(path + DigestUtils.md5Hex(resultItems.getRequest().getUrl()) + ".json"),true));
            printWriter.write(resultItems.getAll().values().toString() + "\n");
            printWriter.close();
        } catch (IOException e) {
            logger.warn("write file error", e);
        }
    }
}
