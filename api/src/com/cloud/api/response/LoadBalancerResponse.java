// Licensed to the Apache Software Foundation (ASF) under one
// or more contributor license agreements.  See the NOTICE file
// distributed with this work for additional information
// regarding copyright ownership.  The ASF licenses this file
// to you under the Apache License, Version 2.0 (the
// "License"); you may not use this file except in compliance
// with the License.  You may obtain a copy of the License at
//
//   http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
package com.cloud.api.response;

import java.util.List;

import com.cloud.api.ApiConstants;
import com.cloud.serializer.Param;
import com.cloud.utils.IdentityProxy;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class LoadBalancerResponse extends BaseResponse implements ControlledEntityResponse {
    @SerializedName(ApiConstants.ID)
    @Param(description = "the load balancer rule ID")
    private IdentityProxy id = new IdentityProxy("firewall_rules");

    @SerializedName(ApiConstants.NAME)
    @Param(description = "the name of the load balancer")
    private String name;

    @SerializedName(ApiConstants.DESCRIPTION)
    @Param(description = "the description of the load balancer")
    private String description;

    @SerializedName(ApiConstants.PUBLIC_IP_ID)
    @Param(description = "the public ip address id")
    private IdentityProxy publicIpId = new IdentityProxy("user_ip_address");

    @SerializedName(ApiConstants.PUBLIC_IP)
    @Param(description = "the public ip address")
    private String publicIp;

    @SerializedName(ApiConstants.PUBLIC_PORT)
    @Param(description = "the public port")
    private String publicPort;

    @SerializedName(ApiConstants.PRIVATE_PORT)
    @Param(description = "the private port")
    private String privatePort;

    @SerializedName(ApiConstants.ALGORITHM)
    @Param(description = "the load balancer algorithm (source, roundrobin, leastconn)")
    private String algorithm;
    
    @SerializedName(ApiConstants.CIDR_LIST) @Param(description="the cidr list to forward traffic from")
    private String cidrList;

    @SerializedName(ApiConstants.ACCOUNT)
    @Param(description = "the account of the load balancer rule")
    private String accountName;
    
    @SerializedName(ApiConstants.PROJECT_ID) @Param(description="the project id of the load balancer")
    private IdentityProxy projectId = new IdentityProxy("projects");
    
    @SerializedName(ApiConstants.PROJECT) @Param(description="the project name of the load balancer")
    private String projectName;

    @SerializedName(ApiConstants.DOMAIN_ID)
    @Param(description = "the domain ID of the load balancer rule")
    private IdentityProxy domainId = new IdentityProxy("domain");

    @SerializedName(ApiConstants.DOMAIN)
    @Param(description = "the domain of the load balancer rule")
    private String domainName;

    @SerializedName(ApiConstants.STATE)
    @Param(description = "the state of the rule")
    private String state;

    @SerializedName(ApiConstants.ZONE_ID)
    @Param(description = "the id of the zone the rule belongs to")
    private IdentityProxy zoneId = new IdentityProxy("data_center");
    
    @SerializedName(ApiConstants.TAGS)  @Param(description="the list of resource tags associated with load balancer", responseObject = ResourceTagResponse.class)
    private List<ResourceTagResponse> tags;

    public void setId(Long id) {
        this.id.setValue(id);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPublicIp(String publicIp) {
        this.publicIp = publicIp;
    }

    public void setPublicPort(String publicPort) {
        this.publicPort = publicPort;
    }

    public void setPrivatePort(String privatePort) {
        this.privatePort = privatePort;
    }

    public void setCidrList(String cidrs) {
        this.cidrList = cidrs;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setDomainId(Long domainId) {
        this.domainId.setValue(domainId);
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setPublicIpId(Long publicIpId) {
        this.publicIpId.setValue(publicIpId);
    }

    public void setZoneId(Long zoneId) {
        this.zoneId.setValue(zoneId);
    }

    @Override
    public void setProjectId(Long projectId) {
        this.projectId.setValue(projectId);
    }

    @Override
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    
    public void setTags(List<ResourceTagResponse> tags) {
        this.tags = tags;
    }
   
}
