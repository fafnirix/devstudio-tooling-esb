/*
 * Copyright (c) 2020, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.wso2.developerstudio.eclipse.artifact.proxyservice.validators;

import java.util.ArrayList;
import java.util.List;
import org.wso2.developerstudio.eclipse.artifact.proxyservice.utils.PsArtifactConstants;
import org.wso2.developerstudio.eclipse.platform.core.model.AbstractListDataProvider;
import org.wso2.developerstudio.eclipse.platform.core.project.model.ProjectDataModel;

public class ProxyServiceWSDLTypes extends AbstractListDataProvider {

    @Override
    public List<ListData> getListData(String modelProperty, ProjectDataModel model) {
        List<ListData> wsdlTypeList = new ArrayList<ListData>();
        wsdlTypeList.add(createListData(PsArtifactConstants.TYPE_WSDL_URL, PsArtifactConstants.TYPE_WSDL_URL));
        wsdlTypeList.add(createListData(PsArtifactConstants.TYPE_WSDL_FILE, PsArtifactConstants.TYPE_WSDL_FILE));
        return wsdlTypeList;
    }

}
