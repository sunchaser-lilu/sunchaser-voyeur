package com.sunchaser.voyeur.core.process;

import com.sunchaser.voyeur.core.pipeline.CollectValueJsonFilePipeline;
import com.sunchaser.voyeur.domain.bing.request.BingApiRequest;
import us.codecraft.webmagic.Page;
import us.codecraft.webmagic.Site;
import us.codecraft.webmagic.Spider;
import us.codecraft.webmagic.processor.PageProcessor;

import java.time.LocalDate;

/**
 * @author admin@lilu.org.cn
 * @description
 * @date 2020/11/22
 * @since JDK 1.8
 */
public class BingImageProcess implements PageProcessor {

    private static final Site site = Site.me().setRetryTimes(3).setSleepTime(1000).setTimeOut(10000);

    @Override
    public void process(Page page) {
        page.putField(LocalDate.now().toString(),page.getRawText());
    }

    @Override
    public Site getSite() {
        return site;
    }

    public static void main(String[] args) {
        BingApiRequest request = new BingApiRequest();
        Spider.create(new BingImageProcess())
              .addUrl(String.format("http://cn.bing.com/HPImageArchive.aspx?format=%s&idx=%s&n=%s",request.getFormat(),request.getIdx(),request.getN()))
              .thread(1)
              .addPipeline(new CollectValueJsonFilePipeline("/Users/sunchaser/data/webmagic"))
              .run();
    }
}
