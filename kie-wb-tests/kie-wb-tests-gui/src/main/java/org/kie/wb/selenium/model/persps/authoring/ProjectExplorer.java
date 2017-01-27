/*
 * Copyright 2016 JBoss by Red Hat.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.kie.wb.selenium.model.persps.authoring;

import org.jboss.arquillian.graphene.findby.FindByJQuery;
import org.kie.wb.selenium.util.Waits;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProjectExplorer {

    private static final By LOADING = By.cssSelector( "div.gwt-PopupPanelGlass" );

    @FindByJQuery("button:contains('Open Project Editor')")
    private WebElement openPexButton;


    public void openProjectEditor() {
        Waits.elementAbsent( LOADING );
        openPexButton.click();
    }
}