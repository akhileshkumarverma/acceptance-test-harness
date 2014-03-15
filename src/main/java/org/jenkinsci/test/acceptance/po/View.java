package org.jenkinsci.test.acceptance.po;

import com.google.inject.Injector;

import java.net.URL;

/**
 * @author Kohsuke Kawaguchi
 */
public class View extends ContainerPageObject {
    public final JobsMixIn jobs;

    public View(Injector injector, URL url) {
        super(injector, url);
        jobs = new JobsMixIn(this);
    }
}
