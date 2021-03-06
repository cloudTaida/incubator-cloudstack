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
import com.cloud.api.ApiConstants;
import com.cloud.serializer.Param;
import com.cloud.utils.IdentityProxy;
import com.google.gson.annotations.SerializedName;

@SuppressWarnings("unused")
public class PrivateGatewayResponse extends BaseResponse implements ControlledEntityResponse{
    
    @SerializedName(ApiConstants.ID) @Param(description="the id of the private gateway")
    private IdentityProxy id = new IdentityProxy("vpc_gateways");
    
    @SerializedName(ApiConstants.GATEWAY) @Param(description="the gateway")
    private String gateway;
    
    @SerializedName(ApiConstants.NETMASK) @Param(description="the private gateway's netmask")
    private String netmask;
    
    @SerializedName(ApiConstants.IP_ADDRESS) @Param(description="the private gateway's ip address")
    private String address;
    
    @SerializedName(ApiConstants.ZONE_ID) @Param(description="zone id of the private gateway")
    private IdentityProxy zoneId = new IdentityProxy("data_center");
    
    @SerializedName(ApiConstants.ZONE_NAME) @Param(description="the name of the zone the private gateway belongs to")
    private String zoneName;
    
    @SerializedName(ApiConstants.VLAN) @Param(description="the vlan of the private gateway")
    private String vlan;
    
    @SerializedName(ApiConstants.VPC_ID) @Param(description="VPC the private gateaway belongs to")
    private IdentityProxy vpcId = new IdentityProxy("vpc");
    
    @SerializedName(ApiConstants.PHYSICAL_NETWORK_ID) @Param(description="the physical network id")
    private IdentityProxy physicalNetworkId = new IdentityProxy("physical_network");
    
    @SerializedName(ApiConstants.ACCOUNT)
    @Param(description = "the account associated with the private gateway")
    private String accountName;
    
    @SerializedName(ApiConstants.PROJECT_ID) @Param(description="the project id of the private gateway")
    private IdentityProxy projectId = new IdentityProxy("projects");
    
    @SerializedName(ApiConstants.PROJECT) @Param(description="the project name of the private gateway")
    private String projectName;

    @SerializedName(ApiConstants.DOMAIN_ID)
    @Param(description = "the ID of the domain associated with the private gateway")
    private IdentityProxy domainId = new IdentityProxy("domain");

    @SerializedName(ApiConstants.DOMAIN)
    @Param(description = "the domain associated with the private gateway")
    private String domainName;
    
    @SerializedName(ApiConstants.STATE) @Param(description="State of the gateway, can be Creating, Ready, Deleting")
    private String state;
    
    
    public void setId(Long id) {
        this.id.setValue(id);
    }

    public void setGateway(String gateway) {
        this.gateway = gateway;
    }

    public void setNetmask(String netmask) {
        this.netmask = netmask;
    }
    
    public void setZoneId(Long zoneId) {
        this.zoneId.setValue(zoneId);
    }

    public void setVlan(String vlan) {
        this.vlan = vlan;
    }

    public void setZoneName(String zoneName) {
        this.zoneName = zoneName;
    }
    
    public void setVpcId(Long vpcId) {
        this.vpcId.setValue(vpcId);
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhysicalNetworkId(Long physicalNetworkId) {
        this.physicalNetworkId.setValue(physicalNetworkId);
    }
    
    @Override
    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    @Override
    public void setDomainId(Long domainId) {
        this.domainId.setValue(domainId);
    }
    
    @Override
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    @Override
    public void setProjectId(Long projectId) {
        this.projectId.setValue(projectId);
    }

    @Override
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public void setState(String state) {
        this.state = state;
    }
}

