package com.mds.platform.starter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

@AutoConfiguration
@ConditionalOnProperty(name = "mds.platform.enabled", havingValue = "true", matchIfMissing = true)
@ComponentScan(
    basePackages = {"com.mds"},
    excludeFilters = @ComponentScan.Filter(
        type = FilterType.REGEX,
        pattern = {"com\\.mds\\.token\\..*", "com\\.mds\\.cache\\..*"}
    )
)
public class MdsPlatformAutoConfiguration {

  private static final Logger log = LoggerFactory.getLogger(MdsPlatformAutoConfiguration.class);

  public MdsPlatformAutoConfiguration() {
    log.info("[MDS Platform Starter] initialized — all MDS modules loaded.");
  }
}
