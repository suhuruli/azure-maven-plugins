/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.maven.webapp;

import com.microsoft.azure.management.appservice.JavaVersion;
import com.microsoft.azure.management.appservice.PricingTier;
import com.microsoft.azure.management.appservice.RuntimeStack;
import com.microsoft.azure.management.appservice.WebContainer;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import com.microsoft.azure.maven.webapp.configuration.OperatingSystemEnum;
import org.apache.maven.execution.MavenSession;
import org.apache.maven.model.Resource;
import org.apache.maven.project.MavenProject;
import org.apache.maven.settings.Settings;
import org.apache.maven.shared.filtering.MavenResourcesFiltering;
import java.util.List;

public class WebAppConfiguration {
    // artifact deploy related configurations
    protected String appName;
    protected String resourceGroup;
    protected Region region;
    protected PricingTier pricingTier;
    protected String servicePlanName;
    protected String servicePlanResourceGroup;
    protected OperatingSystemEnum os;
    protected RuntimeStack runtimeStack;
    protected JavaVersion javaVersion;
    protected WebContainer webContainer;
    protected Settings mavenSettings;
    protected String image;
    protected String serverId;
    protected String registryUrl;

    // web app runtime related configurations
    protected List<Resource> resources;
    protected String stagingDirectoryPath;
    protected String buildDirectoryAbsolutePath;
    protected MavenProject project;
    protected MavenSession session;
    protected MavenResourcesFiltering filtering;

    private WebAppConfiguration(final Builder builder) {
        this.appName = builder.appName;
        this.resourceGroup = builder.resourceGroup;
        this.region = builder.region;
        this.pricingTier = builder.pricingTier;
        this.servicePlanName = builder.servicePlanName;
        this.servicePlanResourceGroup = builder.servicePlanResourceGroup;
        this.os = builder.os;
        this.runtimeStack = builder.runtimeStack;
        this.javaVersion = builder.javaVersion;
        this.webContainer = builder.webContainer;
        this.mavenSettings = builder.mavenSettings;
        this.image = builder.image;
        this.serverId = builder.serverId;
        this.registryUrl = builder.registryUrl;

        this.resources = builder.resources;
        this.stagingDirectoryPath = builder.stagingDirectoryPath;
        this.buildDirectoryAbsolutePath = builder.buildDirectoryAbsolutePath;
        this.project = builder.project;
        this.session = builder.session;
        this.filtering = builder.filtering;
    }

    //region getters
    public String getAppName() {
        return this.appName;
    }

    public String getResourceGroup() {
        return resourceGroup;
    }

    public Region getRegion() {
        return region;
    }

    public PricingTier getPricingTier() {
        return pricingTier;
    }

    public String getServicePlanName() {
        return servicePlanName;
    }

    public String getServicePlanResourceGroup() {
        return servicePlanResourceGroup;
    }

    public OperatingSystemEnum getOs() {
        return this.os;
    }

    public RuntimeStack getRuntimeStack() {
        return runtimeStack;
    }

    public JavaVersion getJavaVersion() {
        return javaVersion;
    }

    public WebContainer getWebContainer() {
        return webContainer;
    }

    public Settings getMavenSettings() {
        return mavenSettings;
    }

    public String getImage() {
        return image;
    }

    public String getServerId() {
        return serverId;
    }

    public String getRegistryUrl() {
        return registryUrl;
    }

    public List<Resource> getResources() {
        return resources;
    }

    public String getStagingDirectoryPath() {
        return stagingDirectoryPath;
    }

    public String getBuildDirectoryAbsolutePath() {
        return buildDirectoryAbsolutePath;
    }

    public MavenProject getProject() {
        return project;
    }

    public MavenSession getSession() {
        return session;
    }

    public MavenResourcesFiltering getFiltering() {
        return filtering;
    }
    // endregion

    //region builder
    public static class Builder {
        private String appName;
        private String resourceGroup;
        private Region region;
        private PricingTier pricingTier;
        private String servicePlanName;
        private String servicePlanResourceGroup;
        private OperatingSystemEnum os;
        private RuntimeStack runtimeStack;
        private JavaVersion javaVersion;
        private WebContainer webContainer;
        private Settings mavenSettings;
        private String image;
        private String serverId;
        private String registryUrl;
        private List<Resource> resources;
        private String stagingDirectoryPath;
        private String buildDirectoryAbsolutePath;
        private MavenProject project;
        private MavenSession session;
        private MavenResourcesFiltering filtering;

        protected Builder self() {
            return this;
        }

        public WebAppConfiguration build() {
            return new WebAppConfiguration(this);
        }

        public Builder appName(final String value) {
            this.appName = value;
            return self();
        }

        public Builder resourceGroup(final String value) {
            this.resourceGroup = value;
            return self();
        }

        public Builder region(final Region value) {
            this.region = value;
            return self();
        }

        public Builder pricingTier(final PricingTier value) {
            this.pricingTier = value;
            return self();
        }

        public Builder servicePlanName(final String value) {
            this.servicePlanName = value;
            return self();
        }

        public Builder servicePlanResourceGroup(final String value) {
            this.servicePlanResourceGroup = value;
            return self();
        }

        public Builder os(final OperatingSystemEnum value) {
            this.os = value;
            return self();
        }

        public Builder runtimeStack(final RuntimeStack value) {
            this.runtimeStack = value;
            return self();
        }

        public Builder javaVersion(final JavaVersion value) {
            this.javaVersion = value;
            return self();
        }

        public Builder webContainer(final WebContainer value) {
            this.webContainer = value;
            return self();
        }

        public Builder mavenSettings(final Settings value) {
            this.mavenSettings = value;
            return self();
        }

        public Builder image(final String value) {
            this.image = value;
            return self();
        }

        public Builder serverId(final String value) {
            this.serverId = value;
            return self();
        }

        public Builder registryUrl(final String value) {
            this.registryUrl = value;
            return self();
        }

        public Builder resources(final List<Resource> values) {
            this.resources = values;
            return self();
        }

        public Builder stagingDirectoryPath(final String value) {
            this.stagingDirectoryPath = value;
            return self();
        }

        public Builder buildDirectoryAbsolutePath(final String value) {
            this.buildDirectoryAbsolutePath = value;
            return self();
        }

        public Builder project(final MavenProject value) {
            this.project = value;
            return self();
        }

        public Builder session(final MavenSession value) {
            this.session = value;
            return self();
        }

        public Builder filtering(final MavenResourcesFiltering value) {
            this.filtering = value;
            return self();
        }
    }
    //endregion
}
