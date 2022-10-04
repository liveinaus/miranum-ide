package io.miragon.digiwf.digiwfdeploymentproxy.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@Setter
@Getter
@ConfigurationProperties(prefix = "io.miragon.digiwf.digiwf-deployment-proxy")
public class DeploymentProxyProperties {
    private Map<String, String> deploymentHandlers;
    private Map<String, String> targets;
}